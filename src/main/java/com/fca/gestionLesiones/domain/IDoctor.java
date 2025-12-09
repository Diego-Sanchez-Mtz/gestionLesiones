package com.fca.gestionLesiones.domain;

import java.util.Date;

public interface IDoctor {
    //Método para asignar lesión a jugadora
    public void diagnosticarLesion(IJugadora jugadora, ILesion lesion);

    public void asignarRehabilitacionALesion(ILesion lesion, IRehabilitacion rehabilitacion);

    //Método para asignar tratamiento a un plan de rehabilitación
    public void asignarTratamientoARehabilitacion(IRehabilitacion rehabilitacion, ITratamiento tratamiento);

    //Método para asignar terapeuta a un tratamiento
    public void asignarTerapeutaATratamiento(ITratamiento tratamiento, ITerapeuta terapeuta);

    public void agendarSesion(
            IJugadora jugadora,
            ITerapeuta terapeuta,
            ITratamiento tratamiento,
            Date fechaSesion
    );
}
