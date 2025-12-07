package com.fca.gestionLesiones.data;

import java.util.List;

public class Jugadora {
    private String posicion;
    private List<Lesion> lesiones;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public List<Lesion> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<Lesion> lesiones) {
        this.lesiones = lesiones;
    }

    //Este método registra una lesión en la lista del atributo lesiones
    public Lesion guardarLesion(TipoLesion tl, ZonaLesion zl, int semanasRecuperacion) {
        //TODO
        return new Lesion();
    }

    //Este método lista las lesiones cuyo atributo sea activo = true
    public List<Lesion> getLesionesActivas() {
        //TODO
        return lesiones;
    }

    //Este método calcula la edad de la jugadora
    public int calcularEdad(){
        //TODO
        return 0;
    }

}
