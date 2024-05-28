package com.ksu.inventory_management_system_backend.entities.unit;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService{
    private final JpaUnitRepository jpaUnitRepository;

    public Unit createUnit(CreateUnitDto createUnitDto) {
        return jpaUnitRepository.save(Unit.from(createUnitDto));
    }

    public Unit updateUnit(long id, CreateUnitDto createUnitDto) {
        return jpaUnitRepository.save(Unit.from(createUnitDto));
    }

    public Unit getUnitById(long id) {
        return jpaUnitRepository.findById(id);
    }

    public void deleteUnit(long id) {
        jpaUnitRepository.deleteById(id);
    }

    public Unit getUnitByName(String name) {
        return jpaUnitRepository.findByName(name);
    }

    public Iterable<Unit> getAllUnits() {
        return jpaUnitRepository.findAll();
    }
}
