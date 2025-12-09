package com.fca.gestionLesiones.domain;

import java.util.Date;

public class Doctor extends Persona implements IDoctor {
    private String cedulaProfesional;

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    @Override
    public void editarTelefono(String telefono) {
        //TODO
    }

    @Override
    public void editarCorreo(String correo) {
        //TODO
    }

    @Override
    public void diagnosticarLesion(IJugadora jugadora, ILesion lesion) {
        //TODO
    }

    @Override
    public void asignarRehabilitacionALesion(ILesion lesion, IRehabilitacion rehabilitacion) {

    }

    @Override
    public void asignarTratamientoARehabilitacion(IRehabilitacion rehabilitacion, ITratamiento tratamiento) {

    }

    @Override
    public void asignarTerapeutaATratamiento(ITratamiento tratamiento, ITerapeuta terapeuta) {

    }

    @Override
    public void agendarSesion(IJugadora jugadora, ITerapeuta terapeuta, ITratamiento tratamiento, Date fechaSesion) {
        Sesion sesion = new Sesion();
        sesion.setJugadora(jugadora);
        sesion.setTerapeuta(terapeuta);
        sesion.setFechaSesion(fechaSesion);

        tratamiento.asignarSesion(sesion);
    }
}
