package com.fca.gestionLesiones.data;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public interface IRehabilitacion {
    public abstract void asignarTratamiento(ITratamiento tratamiento);
    public abstract void eliminarTratamiento(ITratamiento tratamiento);
    public abstract List<Tratamiento> obtenerListaTratamientos();
    public abstract void marcarComoCompletada();
    public abstract void estaCompletada();
}
