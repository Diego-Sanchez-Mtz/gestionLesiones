package com.fca.gestionLesiones.data;

import java.util.List;

public class Jugadora extends Persona implements IJugadora{
    private String posicion;
    private List<ILesion> lesiones;
    private Rehabilitacion rehabilitacion;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<ILesion> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<ILesion> lesiones) {
        this.lesiones = lesiones;
    }

    public Rehabilitacion getRehabilitacion() {
        return rehabilitacion;
    }

    public void setRehabilitacion(Rehabilitacion rehabilitacion) {
        this.rehabilitacion = rehabilitacion;
    }

    @Override
    public Lesion guardarLesion(TipoLesion tl, ZonaLesion zl, int semanasRecuperacion) {
        return null;
    }

    @Override
    public List<ILesion> getLesionesActivas() {
        return List.of();
    }

    @Override
    public int calcularEdad() {
        return 0;
    }

    @Override
    public void editarTelefono(String telefono) {

    }

    @Override
    public void editarCorreo(String correo) {

    }
}
