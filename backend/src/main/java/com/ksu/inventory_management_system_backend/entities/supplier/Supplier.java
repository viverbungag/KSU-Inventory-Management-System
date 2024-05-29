package com.ksu.inventory_management_system_backend.entities.supplier;

import com.ksu.inventory_management_system_backend.entities.product.Product;
import com.ksu.inventory_management_system_backend.entities.supplier.dto.CreateSupplierDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity(name = "supplier")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @Column(name = "contact_number")
    @Setter
    @NonNull
    private String contactNumber;

    @Column(name = "address")
    @Setter
    @NonNull
    private String address;

    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
    @Setter
    private Collection<Product> products;

    public static Supplier from(CreateSupplierDto createSupplierDto) {
        return new Supplier(createSupplierDto.name(), createSupplierDto.contactNumber(), createSupplierDto.address());
    }
}
