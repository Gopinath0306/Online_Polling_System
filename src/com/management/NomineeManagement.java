package com.management;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Nominee;
import com.management.DBConnectionManager;

public class NomineeManagement {

    public int addNominee(Nominee nominee) {

        int rows = 0;

        try {

            Connection con = DBConnectionManager.getConnection();

            String query = "" + "insert into nominee values(?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, nominee.getNomineeId());
            ps.setString(2, nominee.getNomineeName());
            ps.setString(3, nominee.getConstitution());
            ps.setString(4, nominee.getDistrict());
            ps.setString(5, nominee.getSymbol());
            ps.setString(6, nominee.getAddress());
            ps.setInt(7, nominee.getVoteCount());

            rows = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }
}
