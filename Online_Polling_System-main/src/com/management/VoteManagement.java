package com.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.database.DBConnectionManager;
import com.model.Vote;

public class VoteManagement {

    // Insert vote
    public boolean insertVote(Vote vote) {

        boolean status = false;

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "INSERT INTO Vote VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, vote.getVoteId());
            ps.setString(2, vote.getVoterId());
            ps.setString(3, vote.getNomineeId());
            ps.setDate(4, vote.getVotedDate());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            // update nominee vote count
            String updateQuery =
                    "UPDATE Nominee SET vote_count = vote_count + 1 WHERE nominee_id=?";

            PreparedStatement ps2 =
                    con.prepareStatement(updateQuery);

            ps2.setString(1, vote.getNomineeId());

            ps2.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Check voter login
    public boolean validateVoter(String loginId,
                                 String password) {

        boolean status = false;

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "SELECT * FROM Voter WHERE LOGIN_ID=? AND PASSWORD=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, loginId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Get district by login
    public String getDistrict(String loginId,
                              String password) {

        String district = "";

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "SELECT DISTRICT FROM Voter WHERE LOGIN_ID=? AND PASSWORD=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, loginId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                district = rs.getString("DISTRICT");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return district;
    }

    // Voting percentage district wise
    public Map<String, Double> votingPercentage() {

        Map<String, Double> map =
                new HashMap<>();

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "SELECT district FROM voter";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String district =
                        rs.getString("district");

                int totalVoters = totalVoters(district);

                int votedPeople =
                        votedPeople(district);

                double percentage =
                        ((double) votedPeople / totalVoters) * 100;

                map.put(district, percentage);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    // Total voters
    public int totalVoters(String district) {

        int count = 0;

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "SELECT COUNT(*) FROM voter WHERE district=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, district);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    // Voted people
    public int votedPeople(String district) {

        int count = 0;

        try {

            Connection con =
                    DBConnectionManager.getConnection();

            String query =
                    "SELECT COUNT(*) FROM vote v JOIN voter vt ON v.voter_id = vt.voter_id WHERE vt.district=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, district);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}