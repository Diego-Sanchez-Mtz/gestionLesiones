package com.fca.gestionLesiones.data;

public enum TipoLesion {
    FRACTURA("Fractura"),
    ESGUINCE("Esguince"),
    SOBRECARGA_MUSCULAR("Sobrecarga muscular"),
    TENDINITIS("Tendinitis"),
    HIPEREXTENSION("Hiperextensión"),
    DESGARRE_MUSCULAR("Desgare muscular"),
    ROTURA_DE_LIGAMENTO("Rotura de ligamiento"),
    CONTUSION("Contusión");

    private final String descripcion;

    TipoLesion(String descripcion) {
        this.descripcion = descripcion;
    }
}
