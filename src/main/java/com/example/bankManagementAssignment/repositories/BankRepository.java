package com.example.bankManagementAssignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankManagementAssignment.Enitity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
