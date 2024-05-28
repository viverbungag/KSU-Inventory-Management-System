package com.ksu.inventory_management_system_backend.entities.unit;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/units")
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Unit createUnit(@RequestBody CreateUnitDto createUnitDto) {
        return unitService.createUnit(createUnitDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Unit updateUnit(@PathVariable long id, @RequestBody CreateUnitDto createUnitDto) {
        return unitService.updateUnit(id, createUnitDto);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Unit getUnit(@PathVariable long id) {
        return unitService.getUnitById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUnit(@PathVariable long id) {
        unitService.deleteUnit(id);
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Unit getUnitByName(@PathVariable String name) {
        return unitService.getUnitByName(name);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Unit> getUnits() {
        return unitService.getAllUnits();
    }

}
