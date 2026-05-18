// ApplicationUtil.java
package com.polling.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.polling.db.DBConnectionManager;

public class ApplicationUtil {

    // Generate Voter ID
    public static String generateVoterId() {

        String voterId = "V1001";

        try {

            Connection con = DBConnectionManager.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "select voter_id from voter order by voter_id desc limit 1");

            if (rs.next()) {

                String lastId = rs.getString(1);

                int num = Integer.parseInt(lastId.substring(1));

                voterId = "V" + (num + 1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return voterId;
    }

    // Generate Nominee ID
    public static String generateNomineeId() {

        String nomineeId = "N1001";

        try {

            Connection con = DBConnectionManager.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "select nominee_id from nominee order by nominee_id desc limit 1");

            if (rs.next()) {

                String lastId = rs.getString(1);

                int num = Integer.parseInt(lastId.substring(1));

                nomineeId = "N" + (num + 1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nomineeId;
    }

    // Generate Vote ID
    public static String generateVoteId() {

        String voteId = "VT1001";

        try {

            Connection con = DBConnectionManager.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "select vote_id from vote order by vote_id desc limit 1");

            if (rs.next()) {

                String lastId = rs.getString(1);

                int num = Integer.parseInt(lastId.substring(2));

                voteId = "VT" + (num + 1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return voteId;
    }
}