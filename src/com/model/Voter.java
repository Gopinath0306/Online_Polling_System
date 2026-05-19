package com.model;

import java.util.Date;

public class Voter 
{
	private String voterId;
    private String voterName;
	private Date dob;
    private int age;
    private String loginId;
   	private String password;
    private String address;
    private String district;
    private long mobileNumber;
    
    public Voter(String voterId, String voterName, Date dob, int age, String loginId, String password, String address, String district, long mobileNumber) 
    {
		super();
		this.voterId = voterId;
		this.voterName = voterName;
		this.dob = dob;
		this.age = age;
		this.loginId = loginId;
		this.password = password;
		this.address = address;
		this.district = district;
		this.mobileNumber = mobileNumber;
	}
    
    // Getters
    
    public String getVoterId() 
    {
		return voterId;
	}
    
    public String getVoterName() 
	{
		return voterName;
	}
    
    public Date getDob() 
	{
		return dob;
	}
    
    public int getAge() 
	{
		return age;
	}
    
    public String getLoginId() 
	{
		return loginId;
	}
    
    public String getPassword() 
	{
		return password;
	}
    
    public String getAddress() 
	{
		return address;
	}
    
    public String getDistrict() 
	{
		return district;
	}
    
    public long getMobileNumber() 
	{
		return mobileNumber;
	}
    
    // Setters
    
	public void setVoterId(String voterId) 
	
	{
		this.voterId = voterId;
	}
	
	public void setVoterName(String voterName) 
	{
		this.voterName = voterName;
	}
	
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public void setLoginId(String loginId) 
	{
		this.loginId = loginId;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	public void setDistrict(String district) 
	{
		this.district = district;
	}
	
	public void setMobileNumber(long mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
}
