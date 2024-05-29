package com.ksu.inventory_management_system_backend.entities.branch;

import com.ksu.inventory_management_system_backend.entities.branch.dto.CreateBranchDto;

public interface BranchService {

    void createBranch(CreateBranchDto createBranchDto);
    void updateBranch(long id, CreateBranchDto createBranchDto);
    void deleteBranch(long id);
    Branch getBranchByName(String name);
    Branch getBranchById(long id);
    Iterable<Branch> getAllBranches();
}
