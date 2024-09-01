package com.example.bankManagementAssignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bankManagementAssignment.Enitity.Branch;
import com.example.bankManagementAssignment.Enitity.Service;
import com.example.bankManagementAssignment.repositories.BranchRepository;
import com.example.bankManagementAssignment.repositories.ServiceRepository;

@org.springframework.stereotype.Service
public class PlanServiceImpl implements PlansService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Service createPlan(Service service, Long id) throws Exception {

        Branch branch = branchRepository.findById(id).orElse(null);

        if (branch == null) {
            throw new Exception("Branch not found");
        }

        Service newService = new Service();

        newService.setAvailability(true);

        newService.setDescription(service.getDescription());

        newService.setName(service.getName());

        newService.setBranch(branch);

        Service savedService = serviceRepository.save(newService);

        branch.getServices().add(savedService);

        branchRepository.save(branch);

        return savedService;
    }

    @Override
    public Service findPlanById(Long id) {
        return null;
    }

    @Override
    public List<Service> getServicesByBranch(Long id) throws Exception {
        Branch branch = branchRepository.findById(id).orElse(null);

        if (branch == null) {
            throw new Exception("Branch not found");
        }

        return branch.getServices();
    }

}