package com.ksu.inventory_management_system_backend.entities.supplier;

import com.ksu.inventory_management_system_backend.entities.supplier.dto.CreateSupplierDto;
import com.ksu.inventory_management_system_backend.exceptions.ReferentialIntegrityViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService{

    private final JpaSupplierRepository jpaSupplierRepository;

    @Override
    public void createSupplier(CreateSupplierDto createSupplierDto) {
        Supplier supplier = Supplier.from(createSupplierDto);
        jpaSupplierRepository.save(supplier);
    }

    @Override
    public void updateSupplier(long id, CreateSupplierDto createSupplierDto) {
        Optional<Supplier> optionalSupplier = jpaSupplierRepository.findById(id);
        if (optionalSupplier.isPresent()) {
            Supplier supplier = optionalSupplier.get();
            supplier.setName(createSupplierDto.name());
            supplier.setContactNumber(createSupplierDto.contactNumber());
            supplier.setAddress(createSupplierDto.address());
            jpaSupplierRepository.save(supplier);
        } else {
            throw new ReferentialIntegrityViolationException("Supplier with id " + id + " does not exist");
        }
    }

    @Override
    public void deleteSupplier(long id) {
        if (jpaSupplierRepository.existsById(id)) {
            jpaSupplierRepository.deleteById(id);
        } else {
            throw new ReferentialIntegrityViolationException("Supplier with id " + id + " does not exist");
        }
    }

    @Override
    public Supplier getSupplierByName(String name) {
        return jpaSupplierRepository.findByName(name).orElseThrow(() -> new ReferentialIntegrityViolationException("Supplier with name " + name + " does not exist"));
    }

    @Override
    public Supplier getSupplier(long id) {
        return jpaSupplierRepository.findById(id).orElseThrow(() -> new ReferentialIntegrityViolationException("Supplier with id " + id + " does not exist"));
    }
}