package com.example.bankManagementAssignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankManagementAssignment.Enitity.Bank;
import com.example.bankManagementAssignment.Enitity.Branch;
import com.example.bankManagementAssignment.repositories.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private BankService bankService;

    @Override
    public Branch addBranch(Branch branch, Long id) throws Exception {

        Bank bank = bankService.findBankById(id);

        if (bank == null) {
            throw new Exception("Bank not found");
        }

        Branch newBranch = new Branch();

        newBranch.setName(branch.getName());

        newBranch.setBank(branch.getBank());

        newBranch.setState(branch.getState());

        newBranch.setCity(branch.getCity());

        newBranch.setAddress(branch.getAddress());

        newBranch.setPhoneNumber(branch.getPhoneNumber());

        newBranch.setBank(bank);

        Branch savedBranch = branchRepository.save(newBranch);

        return savedBranch;
    }

    @Override
    public Branch findBranchById(Long id) {

        return branchRepository.findById(id).orElse(null);
    }

    @Override
    public List<Branch> getBranchesByBank(Long id) {

        Bank bank = bankService.findBankById(id);

        if (bank == null) {
            return null;
        }

        return branchRepository.findBranchByBankId(id);

    }

}
