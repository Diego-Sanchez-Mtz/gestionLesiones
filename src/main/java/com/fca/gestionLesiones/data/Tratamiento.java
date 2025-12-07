package com.fca.gestionLesiones.data;

import java.util.Date;

public class Tratamiento implements ITratamiento {
    private int idTratamiento;
    private String nombreTratamiento;
    private String DescripcionTratamiento;
    private Date fechaInicio;
    private Date fechaFin;
    private int sesionesRequeridas;

    @Override
    public void asignarTerapeuta() {
        //TODO
    }
}
