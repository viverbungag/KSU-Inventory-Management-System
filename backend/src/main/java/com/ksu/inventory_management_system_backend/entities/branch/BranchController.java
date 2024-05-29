package com.ksu.inventory_management_system_backend.entities.branch;


import com.ksu.inventory_management_system_backend.entities.branch.dto.CreateBranchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/branches")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBranch(@RequestBody CreateBranchDto branch) {
        branchService.createBranch(branch);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBranch(@PathVariable Long id, @RequestBody CreateBranchDto branch) {
        branchService.updateBranch(id, branch);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Branch getBranchById(@PathVariable Long id) {
        return branchService.getBranchById(id);
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Branch getBranchByName(@PathVariable String name) {
        return branchService.getBranchByName(name);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBranch(@PathVariable Long id) {
        branchService.deleteBranch(id);
    }
}
