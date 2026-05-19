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
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, voter.getVoterId());
            pstmt.setString(2, voter.getVoterName());
            java.sql.Date sqlDate = new java.sql.Date(voter.getDob().getTime());
            pstmt.setDate(3, sqlDate);
            pstmt.setInt(4, voter.getAge());
            pstmt.setString(5, voter.getLoginId());
            pstmt.setString(6, voter.getPassword());
            pstmt.setString(7, voter.getAddress());
            pstmt.setString(8, voter.getDistrict());
            pstmt.setLong(9, voter.getMobileNumber());
            int rows = pstmt.executeUpdate();
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
