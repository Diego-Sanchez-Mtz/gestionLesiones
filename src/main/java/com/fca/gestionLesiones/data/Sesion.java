package com.fca.gestionLesiones.data;

import java.util.Date;

public class Sesion implements ISesion{
    private int idSesion;
    private Date fechaSesion;
    private String observaciones;
    private boolean completada;

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

    @Override
    public void marcarComoCompletada() {
        //TODO
    }

    @Override
    public void modificarFecha() {
        //TODO
    }

    @Override
    public void agregarObservaciones() {

    }

}
