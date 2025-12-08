package com.fca.gestionLesiones.data;

public class Terapeuta extends Persona implements ITerapeuta {
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void editarTelefono(String telefono) {

    }

    @Override
    public void editarCorreo(String correo) {

    }

    public void marcarSesionCompletada(ISesion sesion){
        //TODO
    }

    @Override
    public void comentarSesion(ISesion sesion) {

    }
}
