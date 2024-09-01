package com.example.bankManagementAssignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankManagementAssignment.Enitity.Bank;
import com.example.bankManagementAssignment.Enitity.Branch;
import com.example.bankManagementAssignment.Enitity.Service;
import com.example.bankManagementAssignment.services.BankService;
import com.example.bankManagementAssignment.services.BranchService;
import com.example.bankManagementAssignment.services.PlansService;

@RestController

public class HomeController {

    @Autowired
    private BankService bankService;

    @Autowired
    private BranchService branchService;

    @Autowired
    private PlansService plansService;

    @PostMapping("/bank")
    public Bank createBank(@RequestBody Bank bank) {
        Bank savedBank = bankService.createBank(bank);
        return savedBank;
    }

    @GetMapping("/bank")
    public List<Bank> getAllBanks() {
        return bankService.getAllBanks();
    }

    @PostMapping("/branch/{id}")
    public Branch addBranch(@RequestBody Branch branch, @PathVariable Long id) throws Exception {
        return branchService.addBranch(branch, id);
    }

    @PostMapping("/services/{id}")
    public Service createService(@RequestBody Service service, @PathVariable Long id) throws Exception {
        Service savedService = plansService.createPlan(service, id);

        return savedService;
    }

}
