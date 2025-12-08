package com.fca.gestionLesiones.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tTratamiento")
public class TratamientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamiento;

    @ManyToOne
    @JoinColumn(name = "idRehabilitacion", nullable = false)
    private RehabilitacionEntity rehabilitacion;

    @ManyToOne
    @JoinColumn(name = "idTerapeuta", nullable = false)
    private TerapeutaEntity terapeuta;

    @Column(length = 100)
    private String nombreTratamiento;

    @Column(length = 100)
    private String descripcionTratamiento;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    private Integer sesionesRequeridas;

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public RehabilitacionEntity getRehabilitacion() {
        return rehabilitacion;
    }

    public void setRehabilitacion(RehabilitacionEntity rehabilitacion) {
        this.rehabilitacion = rehabilitacion;
    }

    public TerapeutaEntity getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(TerapeutaEntity terapeuta) {
        this.terapeuta = terapeuta;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public String getDescripcionTratamiento() {
        return descripcionTratamiento;
    }

    public void setDescripcionTratamiento(String descripcionTratamiento) {
        this.descripcionTratamiento = descripcionTratamiento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getSesionesRequeridas() {
        return sesionesRequeridas;
    }

    public void setSesionesRequeridas(Integer sesionesRequeridas) {
        this.sesionesRequeridas = sesionesRequeridas;
    }
}
