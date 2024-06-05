package com.ksu.inventory_management_system_backend.entities.joins;

import com.ksu.inventory_management_system_backend.entities.branch.Branch;
import com.ksu.inventory_management_system_backend.entities.product.Product;
import com.ksu.inventory_management_system_backend.entities.transaction.depositTransaction.DepositTransaction;
import com.ksu.inventory_management_system_backend.entities.transaction.withdrawTransaction.WithdrawTransaction;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity(name = "branch_product")
@ToString
@RequiredArgsConstructor
@Getter
public class BranchProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "quantity")
    @Setter
    @NonNull
    private Float quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    @ToString.Exclude
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @ToString.Exclude
    private Product product;

    @OneToMany(mappedBy = "branchProduct", fetch = FetchType.LAZY)
    @ToString.Exclude
    Collection<DepositTransaction> depositTransactions;

    @OneToMany(mappedBy = "branchProduct", fetch = FetchType.LAZY)
    @ToString.Exclude
    Collection<WithdrawTransaction> withdrawTransactions;

    public void setWithdrawTransactions(Collection<WithdrawTransaction> withdrawTransactions) {
        this.withdrawTransactions = withdrawTransactions;
    }

    public void setDepositTransactions(Collection<DepositTransaction> depositTransactions) {
        this.depositTransactions = depositTransactions;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }


}
