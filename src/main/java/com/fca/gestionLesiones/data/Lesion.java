package com.fca.gestionLesiones.data;

import java.util.Date;

public class Lesion implements ILesion{
    private int idLesion;
    private Date fechaInicio;
    private Date fechaAlta;
    private int semanasRecuperacion;
    private boolean estado;
    private TipoLesion tipoLesion;
    private ZonaLesion zonaLesion;

    @Override
    public void asignarRehabilitacion(IRehabilitacion rehabilitacion) {

    }

    @Override
    public void actualizarSemanasRecuperacion() {

    }

    @Override
    public void darDeAlta() {

    }

    @Override
    public boolean estaActiva() {
        return false;
    }
}
