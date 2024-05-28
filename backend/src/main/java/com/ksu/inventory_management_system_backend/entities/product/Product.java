package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.supplier.Supplier;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @Column(name = "quantity")
    @Setter
    @NonNull
    private Float quantity;

    @Column(name = "minimum_quantity")
    @Setter
    @NonNull
    private Float MinimumQuantity;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    @Setter
    private Supplier supplier;
}
