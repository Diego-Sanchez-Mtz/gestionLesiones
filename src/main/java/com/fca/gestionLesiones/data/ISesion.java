package com.fca.gestionLesiones.data;

import java.util.Date;

public interface ISesion {
    public void marcarComoCompletada();

    public void modificarFecha(Date fecha);

    public void agregarObservaciones(String observaciones);

}
