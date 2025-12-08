package com.fca.gestionLesiones.domain;

import java.util.Date;

public class Lesion implements ILesion {
    private int idLesion;
    private Date fechaInicio;
    private Date fechaAlta;
    private int semanasRecuperacion;
    private boolean estado;
    private TipoLesion tipoLesion;
    private ZonaLesion zonaLesion;
    private IRehabilitacion rehabilitacion;
    private IJugadora jugadora;
    private IDoctor doctor;

    public int getIdLesion() { return idLesion; }

    public void setIdLesion(int idLesion) { this.idLesion = idLesion; }

    public Date getFechaInicio() { return fechaInicio; }

    public void setFechaInicio(Date fechaInicio) {this.fechaInicio = fechaInicio;}

    public Date getFechaAlta() {return fechaAlta;}

    public void setFechaAlta(Date fechaAlta) {this.fechaAlta = fechaAlta;}

    public int getSemanasRecuperacion() {return semanasRecuperacion;}

    public void setSemanasRecuperacion(int semanasRecuperacion) {this.semanasRecuperacion = semanasRecuperacion;}

    public boolean isEstado() {return estado;}

    public void setEstado(boolean estado) {this.estado = estado;}

    public TipoLesion getTipoLesion() {return tipoLesion;}

    public void setTipoLesion(TipoLesion tipoLesion) {this.tipoLesion = tipoLesion;}

    public ZonaLesion getZonaLesion() {return zonaLesion;}

    public void setZonaLesion(ZonaLesion zonaLesion) {this.zonaLesion = zonaLesion;}

    public IRehabilitacion getRehabilitacion() {return rehabilitacion;}

    public void setRehabilitacion(IRehabilitacion rehabilitacion) {this.rehabilitacion = rehabilitacion;}

    public IJugadora getJugadora() {return jugadora;}

    public void setJugadora(IJugadora jugadora) {this.jugadora = jugadora;}

    public IDoctor getDoctor() {return doctor;}

    public void setDoctor(IDoctor doctor) {this.doctor = doctor;}


    @Override
    public void asignarRehabilitacion(IRehabilitacion rehabilitacion) {

    }

    @Override
    public void actualizarSemanasRecuperacion() {

    }

    @Override
    public void darDeAlta() {

    }

    @Override
    public boolean estaActiva() {
        return false;
    }
}
