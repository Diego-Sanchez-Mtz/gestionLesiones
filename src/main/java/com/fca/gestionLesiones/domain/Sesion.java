package com.fca.gestionLesiones.domain;

import java.util.Date;

public class Sesion implements ISesion {
    private int idSesion;
    private Date fechaSesion;
    private String observaciones;
    private boolean completada;
    private IJugadora jugadora;
    private ITerapeuta terapeuta;
    private ITratamiento tratamiento;

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public Date getFechaSesion() {
        return fechaSesion;
    }

    public void setFechaSesion(Date fechaSesion) {
        this.fechaSesion = fechaSesion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public IJugadora getJugadora() {
        return jugadora;
    }

    public void setJugadora(IJugadora jugadora) {
        this.jugadora = jugadora;
    }

    public ITerapeuta getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(ITerapeuta terapeuta) {
        this.terapeuta = terapeuta;
    }

    public ITratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(ITratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public void marcarComoCompletada() {

    }

    @Override
    public void modificarFecha(Date fecha) {

    }

    @Override
    public void agregarObservaciones(String observaciones) {

    }
}
