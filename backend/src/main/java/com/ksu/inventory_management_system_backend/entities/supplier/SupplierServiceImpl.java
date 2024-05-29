package com.ksu.inventory_management_system_backend.entities.supplier;


import com.ksu.inventory_management_system_backend.entities.supplier.dto.CreateSupplierDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService{

    private final JpaSupplierRepository jpaSupplierRepository;

    @Override
    public Supplier createSupplier(CreateSupplierDto createSupplierDto) {
        return jpaSupplierRepository.save(Supplier.from(createSupplierDto));
    }

    @Override
    public Supplier updateSupplier(long id, CreateSupplierDto createSupplierDto) {
        return jpaSupplierRepository.save(Supplier.from(createSupplierDto));
    }

    @Override
    public Supplier getSupplier(long id) {
        return jpaSupplierRepository.findById(id);
    }

    @Override
    public void deleteSupplier(long id) {
        jpaSupplierRepository.deleteById(id);
    }

    @Override
    public Supplier getSupplierByName(String name) {
        return jpaSupplierRepository.findByName(name);
    }

}
