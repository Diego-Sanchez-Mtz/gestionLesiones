package com.fca.gestionLesiones.domain;

public interface ITratamiento {
    public void asignarTerapeuta(ITerapeuta terapeuta);
    public void asignarSesion(ISesion sesion);
}
