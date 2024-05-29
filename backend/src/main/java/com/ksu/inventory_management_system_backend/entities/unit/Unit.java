package com.ksu.inventory_management_system_backend.entities.unit;

import com.ksu.inventory_management_system_backend.entities.unit.dto.CreateUnitDto;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "unit")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    public static Unit from(CreateUnitDto createUnitDto) {
        return new Unit(createUnitDto.name());
    }
}
