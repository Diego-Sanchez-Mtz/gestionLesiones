package com.fca.gestionLesiones.data;

import java.util.List;

public interface IRehabilitacion {
    public abstract void asignarTratamiento(ITratamiento tratamiento);
    public abstract void eliminarTratamiento(ITratamiento tratamiento);
    public abstract List<Tratamiento> obtenerListaTratamientos();
    public abstract void marcarComoCompletada();
    public abstract void estaCompletada();
}
