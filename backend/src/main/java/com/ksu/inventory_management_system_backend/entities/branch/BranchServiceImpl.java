package com.ksu.inventory_management_system_backend.entities.branch;

import com.ksu.inventory_management_system_backend.entities.branch.dto.CreateBranchDto;
import com.ksu.inventory_management_system_backend.exceptions.ReferentialIntegrityViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final JpaBranchRepository branchRepository;

    @Override
    public void createBranch(CreateBranchDto createBranchDto) {
        Branch branch = Branch.from(createBranchDto);
        branchRepository.save(branch);
    }

    @Override
    public void updateBranch(long id, CreateBranchDto createBranchDto) {
        Optional<Branch> optionalBranch = branchRepository.findById(id);
        if (optionalBranch.isPresent()) {
            Branch branch = optionalBranch.get();
            branch.setName(createBranchDto.name());
            branchRepository.save(branch);
        } else {
            throw new ReferentialIntegrityViolationException("Branch with id " + id + " does not exist");
        }
    }

    @Override
    public void deleteBranch(long id) {
        if (branchRepository.existsById(id)) {
            branchRepository.deleteById(id);
        } else {
            throw new ReferentialIntegrityViolationException("Branch with id " + id + " does not exist");
        }
    }

    @Override
    public Branch getBranchByName(String name) {
        return branchRepository.findByName(name).orElseThrow(() -> new ReferentialIntegrityViolationException("Branch with name " + name + " does not exist"));
    }

    @Override
    public Branch getBranchById(long id) {
        return branchRepository.findById(id).orElseThrow(() -> new ReferentialIntegrityViolationException("Branch with id " + id + " does not exist"));
    }

    @Override
    public Iterable<Branch> getAllBranches() {
        return branchRepository.findAll();
    }
}
