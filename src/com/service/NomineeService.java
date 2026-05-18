package com.service;

import com.model.Nominee;
import com.management.NomineeManagement;

public class NomineeService {

    NomineeManagement nm = new NomineeManagement();

    public void addNominee(Nominee nominee) {

        int result = nm.addNominee(nominee);

        if(result > 0) {
            System.out.println("Nominee Added Successfully");
        } else {
            System.out.println("Failed");
        }
    }
}