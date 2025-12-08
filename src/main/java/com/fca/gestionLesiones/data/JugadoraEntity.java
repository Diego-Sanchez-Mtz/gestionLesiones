package com.fca.gestionLesiones.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tJugadora")
@PrimaryKeyJoinColumn(name = "idJugadora")
public class JugadoraEntity extends PersonaEntity {

    @Column(nullable = false, length = 50)
    private String posicion;

    @OneToMany(mappedBy = "jugadora")
    private List<LesionEntity> lesiones;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<LesionEntity> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<LesionEntity> lesiones) {
        this.lesiones = lesiones;
    }
}