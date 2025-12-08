package com.fca.gestionLesiones.data;

import java.util.List;

public interface IRehabilitacion {
    public void asignarTratamiento(ITratamiento tratamiento);
    public void eliminarTratamiento(ITratamiento tratamiento);
    public List<Tratamiento> obtenerListaTratamientos();
    public void marcarComoCompletada();
    public void estaCompletada();
}
