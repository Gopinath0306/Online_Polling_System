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
    public Voter(String voterId, String voterName, Date dob, int age, String loginId, String password, String address,
			String district, long mobileNumber) 
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
    public Voter() {
		// TODO Auto-generated constructor stub
	}
	public String getVoterId() 
    {
		return voterId;
	}
	public void setVoterId(String voterId) 
	
	{
		this.voterId = voterId;
	}
	public String getVoterName() 
	{
		return voterName;
	}
	public void setVoterName(String voterName) 
	{
		this.voterName = voterName;
	}
	public Date getDob() 
	{
		return dob;
	}
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getLoginId() 
	{
		return loginId;
	}
	public void setLoginId(String loginId) 
	{
		this.loginId = loginId;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getDistrict() 
	{
		return district;
	}
	public void setDistrict(String district) 
	{
		this.district = district;
	}
	public long getMobileNumber() 
	{
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
}
