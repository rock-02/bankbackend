package com.example.bankManagementAssignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankManagementAssignment.Enitity.Branch;
import com.example.bankManagementAssignment.Enitity.Service;
import com.example.bankManagementAssignment.services.BranchService;
import com.example.bankManagementAssignment.services.PlansService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class MainController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private PlansService plansService;

    @GetMapping("/branches/{id}")
    public List<Branch> getBranchesByBankId(@PathVariable Long id) {

        return branchService.getBranchesByBank(id);
    }

    @GetMapping("/services/{branchId}")
    public List<Service> getServicesByBranchId(@PathVariable Long branchId) throws Exception {
        return plansService.getServicesByBranch(branchId);
    }
}
