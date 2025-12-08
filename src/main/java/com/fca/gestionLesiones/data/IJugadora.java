package com.fca.gestionLesiones.data;

import java.util.List;

public interface IJugadora {
    //Este método registra una lesión en la lista del atributo lesiones
    public Lesion guardarLesion(TipoLesion tl, ZonaLesion zl, int semanasRecuperacion);

    //Este método lista las lesiones cuyo atributo sea activo == true
    public List<ILesion> getLesionesActivas();

    //Este método calcula la edad de la jugadora
    public int calcularEdad();
}
