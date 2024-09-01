package com.example.bankManagementAssignment.services;

import java.util.List;

import com.example.bankManagementAssignment.Enitity.Bank;

public interface BankService {

    public Bank createBank(Bank bank);

    public List<Bank> getAllBanks();

    public Bank findBankById(Long id);

    public String deleteAll();

}
