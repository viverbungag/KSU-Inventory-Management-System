package com.ksu.inventory_management_system_backend.entities.supplier;

import com.ksu.inventory_management_system_backend.entities.supplier.dto.CreateSupplierDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSupplier(@RequestBody CreateSupplierDto createSupplierDto) {
        supplierService.createSupplier(createSupplierDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateSupplier(@PathVariable long id, @RequestBody CreateSupplierDto createSupplierDto) {
        supplierService.updateSupplier(id, createSupplierDto);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Supplier getSupplier(@PathVariable long id) {
        return supplierService.getSupplier(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSupplier(@PathVariable long id) {
        supplierService.deleteSupplier(id);
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Supplier getSupplierByName(@PathVariable String name) {
        return supplierService.getSupplierByName(name);
    }
}