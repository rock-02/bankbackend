package com.example.bankManagementAssignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<com.example.bankManagementAssignment.Enitity.Service, Long> {

}
