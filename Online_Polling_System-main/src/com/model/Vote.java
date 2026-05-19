package com.model;
import java.sql.Date;
public class Vote 
{
	private int voteId;
	private int voterId;
	private int nomineeId;
	private Date votedDate;
	public Vote(int voteId, int voterId, int nomineeId, Date votedDate) 
	{
		super();
		this.voteId = voteId;
		this.voterId = voterId;
		this.nomineeId = nomineeId;
		this.votedDate = votedDate;
	}
	public int getVoteId() 
	{
		return voteId;
	}
	public void setVoteId(int voteId) 
	{
		this.voteId = voteId;
	}
	public int getVoterId() 
	{
		return voterId;
	}
	public void setVoterId(int voterId) 
	{
		this.voterId = voterId;
	}
	public int getNomineeId() 
	{
		return nomineeId;
	}
	public void setNomineeId(int nomineeId) 
	{
		this.nomineeId = nomineeId;
	}
	public Date getVotedDate() 
	{
		return votedDate;
	}
	public void setVotedDate(Date votedDate) 
	{
		this.votedDate = votedDate;
	}
}
