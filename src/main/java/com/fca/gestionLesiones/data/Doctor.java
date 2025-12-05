package com.fca.gestionLesiones.data;

import java.util.List;

public class Doctor extends Persona implements ILesion, IRehabilitacion, ITratamiento{
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
    public void asignarRehabilitacion(IRehabilitacion rehabilitacion) {
        //TODO
    }

    @Override
    public void actualizarSemanasRecuperacion() {
        //TODO
    }

    @Override
    public void darDeAlta() {
        //TODO
    }

    @Override
    public void estaActiva() {
        //TODO
    }

    @Override
    public void asignarTratamiento(ITratamiento tratamiento) {
       //TODO
    }

    @Override
    public void eliminarTratamiento(ITratamiento tratamiento) {
        //TODO
    }

    @Override
    public List<Tratamiento> obtenerListaTratamientos() {
        return List.of();
    }

    @Override
    public void marcarComoCompletada() {
        //TODO
    }

    @Override
    public void estaCompletada() {
        //TODO
    }

    @Override
    public void asignarTerapeuta() {
        //TODO
    }
}
