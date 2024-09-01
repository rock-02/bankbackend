package com.example.bankManagementAssignment.services;

import java.util.List;

import com.example.bankManagementAssignment.Enitity.Branch;

public interface BranchService {

    public Branch addBranch(Branch branch, Long id) throws Exception;

    public Branch findBranchById(Long id);

    public List<Branch> getBranchesByBank(Long id);
}
