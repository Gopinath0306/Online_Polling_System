package com.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.model.Voter;
import com.management.DBConnectionManager;
public class VoterService 
{
    public void addVoter(Voter voter) 
    {
        try 
        {
            Connection connection = DBConnectionManager.getConnection();
            String query = "insert into voter values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, voter.getVoterId());
            ps.setString(2, voter.getVoterName());
            java.sql.Date sqlDate = new java.sql.Date(voter.getDob().getTime());
            ps.setDate(3, sqlDate);
            ps.setInt(4, voter.getAge());
            ps.setString(5, voter.getLoginId());
            ps.setString(6, voter.getPassword());
            ps.setString(7, voter.getAddress());
            ps.setString(8, voter.getDistrict());
            ps.setLong(9, voter.getMobileNumber());
            int rows = ps.executeUpdate();
            if(rows > 0) 
            {
                System.out.println("Voter Added Successfully");
            }
            else 
            {
                System.out.println("Voter Not Added");
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
