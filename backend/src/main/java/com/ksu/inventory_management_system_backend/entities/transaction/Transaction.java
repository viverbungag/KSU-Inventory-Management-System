package com.ksu.inventory_management_system_backend.entities.transaction;

import com.ksu.inventory_management_system_backend.entities.joins.BranchProduct;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@MappedSuperclass
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float quantity;
    private LocalDate date;
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_product_id")
    BranchProduct branchProduct;
}
