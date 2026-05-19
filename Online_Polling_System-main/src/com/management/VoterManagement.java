package com.management;
import java.util.ArrayList;
import java.util.List;
import com.model.Voter;
public class VoterManagement 
{
    private List<Voter> voterList = new ArrayList<>();
    public List<Voter> getVoterList() 
    {
        return voterList;
    }
    public void setVoterList(List<Voter> voterList) 
    {
        this.voterList = voterList;
    }
    public void insertVoter(Voter voter)
    {
        voterList.add(voter);
    }
    public void updateVoter(String voterId, String address)
    {
        for(Voter v : voterList)
        {
            if(v.getVoterId().equals(voterId))
            {
                v.setAddress(address);
            }
        }
    }
    public boolean isVoterExists(String voterId)
    {
        for(Voter v : voterList)
        {
            if(v.getVoterId().equals(voterId))
            {
                return true;
            }
        }
        return false;
    }
    public Voter getVoterById(String voterId)
    {
        for(Voter v : voterList)
        {
            if(v.getVoterId().equals(voterId))
            {
                return v;
            }
        }
        return null;
    }
    public void deleteVoter(String voterId)
    {
        voterList.removeIf(v -> v.getVoterId().equals(voterId));
    }
}
