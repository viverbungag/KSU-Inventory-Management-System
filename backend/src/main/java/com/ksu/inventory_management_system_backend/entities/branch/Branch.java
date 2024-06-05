package com.ksu.inventory_management_system_backend.entities.branch;

import com.ksu.inventory_management_system_backend.entities.branch.dto.CreateBranchDto;
import com.ksu.inventory_management_system_backend.entities.joins.BranchProduct;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity(name = "branch")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @Setter
    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    @ToString.Exclude
    Collection<BranchProduct> branchProducts;

    public static Branch from(CreateBranchDto createBranchDto) {
        return new Branch(createBranchDto.name());
    }
}
