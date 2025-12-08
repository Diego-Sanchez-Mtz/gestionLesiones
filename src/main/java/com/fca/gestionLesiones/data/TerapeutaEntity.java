package com.fca.gestionLesiones.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tTerapeuta")
@PrimaryKeyJoinColumn(name = "idTerapeuta")
public class TerapeutaEntity extends PersonaEntity{

    @Column(length = 50)
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
