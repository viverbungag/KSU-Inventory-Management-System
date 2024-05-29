package com.ksu.inventory_management_system_backend.entities.supplier;


import com.ksu.inventory_management_system_backend.entities.supplier.dto.CreateSupplierDto;

public interface SupplierService {
    void createSupplier(CreateSupplierDto createSupplierDto);
    void updateSupplier(long id, CreateSupplierDto createSupplierDto);
    Supplier getSupplier(long id);
    void deleteSupplier(long id);
    Supplier getSupplierByName(String name);
}
