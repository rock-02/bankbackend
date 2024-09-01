package com.example.bankManagementAssignment.services;

import java.util.List;

import com.example.bankManagementAssignment.Enitity.Service;

public interface PlansService {

    public Service createPlan(Service service, Long id) throws Exception;

    public Service findPlanById(Long id);

    public List<Service> getServicesByBranch(Long id) throws Exception;

}
