package com.ksu.inventory_management_system_backend.entities.unit;

import com.ksu.inventory_management_system_backend.entities.unit.dto.CreateUnitDto;

public interface UnitService {
    Unit createUnit(CreateUnitDto createUnitDto);
    Unit updateUnit(long id, CreateUnitDto createUnitDto);
    void deleteUnit(long id);
    Unit getUnitByName(String name);
    Unit getUnitById(long id);
    Iterable<Unit> getAllUnits();
}
