package com.ksu.inventory_management_system_backend.entities.size;

import com.ksu.inventory_management_system_backend.entities.product.Product;
import com.ksu.inventory_management_system_backend.entities.supplier.Supplier;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "size")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @Setter
    @ToString.Exclude
    private Product product;
}
