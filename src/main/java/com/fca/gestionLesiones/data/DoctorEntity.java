package com.fca.gestionLesiones.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tDoctor")
@PrimaryKeyJoinColumn(name = "idDoctor")
public class DoctorEntity extends PersonaEntity {

    @Column(nullable = false, length = 20)
    private String cedulaProfesional;

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }
}
