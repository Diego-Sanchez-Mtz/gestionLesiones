package com.fca.gestionLesiones.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TratamientoRepository extends JpaRepository<SesionEntity, Integer> {
}
