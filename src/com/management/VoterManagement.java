package com.management;
import java.util.ArrayList;
import java.util.List;
import com.model.Voter;
public class VoterManagement 
{
	private List<Voter> voterList = new ArrayList<>();
	private Voter list;
	public List<Voter> getVoterList() 
	{
		return voterList;
	}
	public void setVoterList(List<Voter> voterList) 
	{
		this.voterList = voterList;
	}
	public void insertVoter(List<Voter> voterList)
	{
			voterList.add(list);
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
		for(int i = 0; i < voterList.size(); i++)
		{
			if(voterList.get(i).getVoterId().equals(voterId))
			{
				voterList.remove(i);
				break;
			}
		}
	}
}
