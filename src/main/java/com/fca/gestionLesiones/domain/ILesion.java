package com.fca.gestionLesiones.domain;

public interface ILesion{
    public void asignarRehabilitacion(IRehabilitacion rehabilitacion);
    public void actualizarSemanasRecuperacion();
    public void darDeAlta();
    public boolean estaActiva();
}
