package com.fca.gestionLesiones.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tratamiento implements ITratamiento {
    private int idTratamiento;
    private String nombreTratamiento;
    private String DescripcionTratamiento;
    private Date fechaInicio;
    private Date fechaFin;
    private int sesionesRequeridas;
    private ITerapeuta terapeuta;
    private List<ISesion> sesiones;
    private IRehabilitacion rehabilitacion;

    public int getIdTratamiento() {return idTratamiento;}

    public void setIdTratamiento(int idTratamiento) {this.idTratamiento = idTratamiento;}

    public String getNombreTratamiento() {return nombreTratamiento;}

    public void setNombreTratamiento(String nombreTratamiento) {this.nombreTratamiento = nombreTratamiento;}

    public String getDescripcionTratamiento() {return DescripcionTratamiento;}

    public void setDescripcionTratamiento(String descripcionTratamiento) {DescripcionTratamiento = descripcionTratamiento;}

    public Date getFechaInicio() {return fechaInicio;}

    public void setFechaInicio(Date fechaInicio) {this.fechaInicio = fechaInicio;}

    public Date getFechaFin() {return fechaFin;}

    public void setFechaFin(Date fechaFin) {this.fechaFin = fechaFin;}

    public int getSesionesRequeridas() {return sesionesRequeridas;}

    public void setSesionesRequeridas(int sesionesRequeridas) {this.sesionesRequeridas = sesionesRequeridas;}

    public ITerapeuta getTerapeuta() {return terapeuta;}

    public void setTerapeuta(ITerapeuta terapeuta) {this.terapeuta = terapeuta;}

    public List<ISesion> getSesiones() {return sesiones;}

    public void setSesiones(List<ISesion> sesiones) {this.sesiones = sesiones;}

    public IRehabilitacion getRehabilitacion() {
        return rehabilitacion;
    }

    public void setRehabilitacion(IRehabilitacion rehabilitacion) {
        this.rehabilitacion = rehabilitacion;
    }

    @Override
    public void asignarTerapeuta(ITerapeuta terapeuta) {

    }

    @Override
    public void asignarSesion(ISesion sesion) {
        if (sesiones == null) {
            sesiones = new ArrayList<>();
        }
        sesiones.add(sesion);
    }

    public void asignarTerapeuta(Terapeuta terapeuta) {
        //TODO
    }


}
