package com.service;

import java.sql.Date;
import java.util.Map;

import com.management.VoteManagement;
import com.model.Vote;

public class VoteService {

    VoteManagement vm =
            new VoteManagement();

    // Generate Vote ID
    public String generateVoteId(int num) {

        return "VOTE" + num;
    }

    // Add Vote
    public boolean addVote(String voterId,
                           String nomineeId) {

        String voteId =
                generateVoteId((int)(Math.random()*1000));

        Date date =
                new Date(System.currentTimeMillis());

        Vote vote =
                new Vote(voteId,
                        voterId,
                        nomineeId,
                        date);

        return vm.insertVote(vote);
    }

    // Validate Login
    public boolean validateVoter(
            String loginId,
            String password) {

        return vm.validateVoter(
                loginId,
                password);
    }

    // Get District
    public String getDistrict(
            String loginId,
            String password) {

        return vm.getDistrict(
                loginId,
                password);
    }

    // Voting percentage report
    public void showVotingPercentage() {

        Map<String, Double> map =
                vm.votingPercentage();

        System.out.println(
                "District\tPercentage");

        for (String district : map.keySet()) {

            System.out.println(
                    district + "\t" +
                    map.get(district));
        }
    }
}