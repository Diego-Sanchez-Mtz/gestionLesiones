package com.fca.gestionLesiones.data;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tRehabilitacion")
public class RehabilitacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRehabilitacion;

    @OneToOne
    @JoinColumn(name = "idLesion", nullable = false)
    private LesionEntity lesion;

    private Integer sesionesRealizadas;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaFinal;

    private boolean completada;

    @OneToMany(mappedBy = "rehabilitacion")
    private List<TratamientoEntity> tratamientos;

    public int getIdRehabilitacion() {
        return idRehabilitacion;
    }

    public void setIdRehabilitacion(int idRehabilitacion) {
        this.idRehabilitacion = idRehabilitacion;
    }

    public LesionEntity getLesion() {
        return lesion;
    }

    public void setLesion(LesionEntity lesion) {
        this.lesion = lesion;
    }

    public Integer getSesionesRealizadas() {
        return sesionesRealizadas;
    }

    public void setSesionesRealizadas(Integer sesionesRealizadas) {
        this.sesionesRealizadas = sesionesRealizadas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public List<TratamientoEntity> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<TratamientoEntity> tratamientos) {
        this.tratamientos = tratamientos;
    }
}
