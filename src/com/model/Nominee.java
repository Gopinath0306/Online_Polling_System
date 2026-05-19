package com.model;
public class Nominee 
{
	private int nomineeId;
	private String nomineeName;
	private String constitution;
	private String district;
	private String symbol;
	private String address;
	private int voteCount;
	
	public Nominee(int nomineeId, String nomineeName, String constitution, String district, String symbol,String address, int voteCount) 
	{
		super();
		this.nomineeId = nomineeId;
		this.nomineeName = nomineeName;
		this.constitution = constitution;
		this.district = district;
		this.symbol = symbol;
		this.address = address;
		this.voteCount = voteCount;
	}
	
	// Getters
	
	public int getNomineeId() 
	{
		return nomineeId;
	}
	
	public String getNomineeName() 
	{
		return nomineeName;
	}
	
	public String getConstitution() 
	{
		return constitution;
	}
	
	public String getDistrict() 
	{
		return district;
	}
	
	public String getSymbol() 
	{
		return symbol;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public int getVoteCount() 
	{
		return voteCount;
	}
	
	// Setters
	
	public void setNomineeId(int nomineeId) 
	{
		this.nomineeId = nomineeId;
	}
	
	public void setNomineeName(String nomineeName) 
	{
		this.nomineeName = nomineeName;
	}
	
	public void setConstitution(String constitution) 
	{
		this.constitution = constitution;
	}
	
	public void setDistrict(String district) 
	{
		this.district = district;
	}
	
	public void setSymbol(String symbol) 
	{
		this.symbol = symbol;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setVoteCount(int voteCount) 
	{
		this.voteCount = voteCount;
	}
}
