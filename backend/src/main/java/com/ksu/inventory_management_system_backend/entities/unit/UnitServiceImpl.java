package com.ksu.inventory_management_system_backend.entities.unit;

import com.ksu.inventory_management_system_backend.entities.unit.dto.CreateUnitDto;
import com.ksu.inventory_management_system_backend.exceptions.ReferentialIntegrityViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService{
    private final JpaUnitRepository jpaUnitRepository;

    @Override
    public void createUnit(CreateUnitDto createUnitDto) {
        Unit unit = Unit.from(createUnitDto);
        jpaUnitRepository.save(unit);
    }

    @Override
    public void updateUnit(long id, CreateUnitDto createUnitDto) {
        Optional<Unit> optionalUnit = jpaUnitRepository.findById(id);
        if (optionalUnit.isPresent()) {
            Unit unit = optionalUnit.get();
            unit.setName(createUnitDto.name());
            jpaUnitRepository.save(unit);
        } else {
            throw new ReferentialIntegrityViolationException("Unit with id " + id + " does not exist");
        }
    }

    @Override
    public void deleteUnit(long id) {
        if (jpaUnitRepository.existsById(id)) {
            jpaUnitRepository.deleteById(id);
        } else {
            throw new ReferentialIntegrityViolationException("Unit with id " + id + " does not exist");
        }
    }

    @Override
    public Unit getUnitByName(String name) {
        return jpaUnitRepository.findByName(name).orElseThrow(() -> new ReferentialIntegrityViolationException("Unit with name " + name + " does not exist"));
    }

    @Override
    public Unit getUnitById(long id) {
        return jpaUnitRepository.findById(id).orElseThrow(() -> new ReferentialIntegrityViolationException("Unit with id " + id + " does not exist"));
    }

    @Override
    public Iterable<Unit> getAllUnits() {
        return jpaUnitRepository.findAll();
    }
}
