package com.fca.gestionLesiones.data;

public enum ZonaLesion {
    // Extremidades inferiores
    TOBILLO("Tobillo"),
    PIE("Pie"),
    RODILLA("Rodilla"),
    PIERNA("Pierna"),
    MUSLO("Muslo"),
    CADERA("Cadera"),
    DEDO_DEL_PIE("Dedo del pie"),

    // Extremidades superiores
    HOMBRO("Hombro"),
    BRAZO("Brazo"),
    CODO("Codo"),
    ANTEBRAZO("Antebrazo"),
    MUNIECA("Muñeca"),
    MANO("Mano"),
    DEDO_DE_LA_MANO("Dedo de la mano"),

    // Tronco
    CUELLO("Cuello"),
    ESPALDA_ALTA("Espalda alta"),
    ESPALDA_BAJA("Espalda baja"),
    ABDOMEN("Abdomen"),;

    private final String descripcion;

    ZonaLesion(String descripcion) {
        this.descripcion = descripcion;
    }

}
