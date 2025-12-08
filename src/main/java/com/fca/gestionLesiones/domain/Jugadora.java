package com.fca.gestionLesiones.domain;

import java.util.List;

public class Jugadora extends Persona implements IJugadora {
    private String posicion;
    private List<ILesion> lesiones;
    private IRehabilitacion rehabilitacion;

    public List<ILesion> getLesiones() { return lesiones; }

    public void setLesiones(List<ILesion> lesiones) { this.lesiones = lesiones; }

    public String getPosicion() { return posicion; }

    public void setPosicion(String posicion) { this.posicion = posicion; }

    public IRehabilitacion getRehabilitacion() { return rehabilitacion; }

    public void setRehabilitacion(IRehabilitacion rehabilitacion) { this.rehabilitacion = rehabilitacion; }


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
