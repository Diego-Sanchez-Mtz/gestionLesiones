package com.fca.gestionLesiones.data;

import java.util.Date;
import java.util.List;

public class Rehabilitacion implements IRehabilitacion{
    private int idRehabilitacion;
    private int sesionesRealizadas;
    private List<Tratamiento> tratamientos;
    private Date fechaInicio;
    private Date fechaFinal;
    private boolean completada;

    @Override
    public void asignarTratamiento(ITratamiento tratamiento) {


    }

    @Override
    public void eliminarTratamiento(ITratamiento tratamiento) {

    }

    @Override
    public List<Tratamiento> obtenerListaTratamientos() {
        return List.of();
    }

    @Override
    public void marcarComoCompletada() {

    }

    @Override
    public void estaCompletada() {

    }
}
