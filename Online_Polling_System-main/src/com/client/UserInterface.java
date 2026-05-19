package com.client;
import com.service.VoteService;

public class UserInterface {
    public static void main(String[] args) {

        VoteService vs =
                new VoteService();

        boolean status =
                vs.addVote(
                        "VOTER101",
                        "NOM101");

        if(status) {
            System.out.println(
                    "Vote Added Successfully");
        }
        else {
            System.out.println(
                    "Vote Failed");
        }

        vs.showVotingPercentage();
    }
}