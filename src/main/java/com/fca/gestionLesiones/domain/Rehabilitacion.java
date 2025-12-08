package com.fca.gestionLesiones.domain;

import java.util.Date;
import java.util.List;

public class Rehabilitacion implements IRehabilitacion {

    private int idRehabilitacion;
    private int sesionesRealizadas;
    private List<ITratamiento> tratamientos;
    private Date fechaInicio;
    private Date fechaFinal;
    private boolean completada;
    private ILesion lesion;

    public int getIdRehabilitacion() {
        return idRehabilitacion;
    }

    public void setIdRehabilitacion(int idRehabilitacion) {
        this.idRehabilitacion = idRehabilitacion;
    }

    public int getSesionesRealizadas() {
        return sesionesRealizadas;
    }

    public void setSesionesRealizadas(int sesionesRealizadas) {
        this.sesionesRealizadas = sesionesRealizadas;
    }

    public List<ITratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<ITratamiento> tratamientos) {
        this.tratamientos = tratamientos;
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

    public ILesion getLesion() {
        return lesion;
    }

    public void setLesion(ILesion lesion) {
        this.lesion = lesion;
    }

    @Override
    public void asignarTratamiento(ITratamiento tratamiento) {


    }

    @Override
    public void eliminarTratamiento(ITratamiento tratamiento) {

    }

    @Override
    public List<Tratamiento> obtenerListaTratamientos() {
        return List.of();
    }

    @Override
    public void marcarComoCompletada() {

    }

    @Override
    public boolean estaCompletada() {

        return false;
    }

    @Override
    public void incrementarSesion() {
        this.sesionesRealizadas++;
    }


}
