package com.fca.gestionLesiones.data;

public interface ILesion{
    public abstract void asignarRehabilitacion(IRehabilitacion rehabilitacion);
    public abstract void actualizarSemanasRecuperacion();
    public abstract void darDeAlta();
    public abstract void estaActiva();
}
