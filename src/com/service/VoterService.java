package com.service;

import com.management.VoterManagement;
import com.model.Voter;

public class VoterService {

    VoterManagement management = new VoterManagement();

    // Generate Voter ID
    public String generateVoterId() {

        return "V" + UUID.randomUUID().toString().substring(0,5);
    }

    // Validate Age
    public boolean validateAge(int age) {

        return age >= 18;
    }

    // Add Voter
    public boolean addVoter(Voter voter) {

        if(!validateAge(voter.getAge())) {

            System.out.println("Voter age must be 18 or above");

            return false;
        }

        // Generate Voter ID
        voter.setVoterId(generateVoterId());

        // Insert into Database
        return management.insertVoter(voter);
    }

    // Search Voter By ID
    public Voter searchVoter(String voterId) {

        return management.getVoterById(voterId);
    }

    // Modify Address
    public boolean modifyAddress(String voterId,String newAddress) {

        return management.updateAddress(voterId,newAddress);
    }

    // Modify Mobile Number
    public boolean modifyMobile(String voterId, long newMobile) {

        return management.updateMobile(voterId,newMobile);
    }

    // Remove Voter
    public boolean removeVoter(String voterId) {

        return management.deleteVoter(voterId);
    }

    // Get District Wise Voters
    public List<Voter> getDistrictWiseVoters(String district) {

        return management.getVotersByDistrict(district);
    }
}