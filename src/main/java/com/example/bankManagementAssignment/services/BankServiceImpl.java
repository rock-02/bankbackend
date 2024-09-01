package com.example.bankManagementAssignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankManagementAssignment.Enitity.Bank;
import com.example.bankManagementAssignment.repositories.BankRepository;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    public Bank createBank(Bank bank) {

        return bankRepository.save(bank);
    }

    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }

    public Bank findBankById(Long id) {
        return bankRepository.findById(id).orElse(null);
    }

    public String deleteAll() {
        bankRepository.deleteAll();
        return "All data deleted";
    }
}
