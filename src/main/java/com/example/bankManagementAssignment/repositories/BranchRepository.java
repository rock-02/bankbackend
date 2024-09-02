package com.example.bankManagementAssignment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankManagementAssignment.Enitity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

    public List<Branch> findBranchByBankId(Long id);
    
}
