package com.ksu.inventory_management_system_backend.entities.supplier;


import com.ksu.inventory_management_system_backend.entities.supplier.Dto.CreateSupplierDto;

public interface SupplierService {
    Supplier createSupplier(CreateSupplierDto createSupplierDto);
    Supplier updateSupplier(long id, CreateSupplierDto createSupplierDto);
    Supplier getSupplier(long id);
    void deleteSupplier(long id);
    Supplier getSupplierByName(String name);
}
