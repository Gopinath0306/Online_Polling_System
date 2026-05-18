package com.service;
import java.util.*;

import com.management.VoterManagement;
import com.model.Voter;

public class VoterService {
	
	public String generateVoterId() {
		return "V" + UUID.randomUUID().toString().substring(0,5);
	}
	
	public boolean validateAge(int age) {
		return age >= 18;
	}
	
	public boolean addVoter(Voter voter) {
		if(!validateAge(voter.getAge())) {
			System.out.println("Voter age must be 18 or above");
			return false;
		}
		
	}

}
