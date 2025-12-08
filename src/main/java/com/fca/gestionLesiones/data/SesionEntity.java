package com.fca.gestionLesiones.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tSesion")
public class SesionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamiento;

    @ManyToOne
    @JoinColumn(name = "idTraramiento", nullable = false)
    private TratamientoEntity tratamiento;

    @ManyToOne
    @JoinColumn(name = "idJugadora", nullable = false)
    private JugadoraEntity jugadora;

    @Temporal(TemporalType.DATE)
    private Date fechaSesion;

    @Lob
    private String observaciones;

    private boolean completada;

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public TratamientoEntity getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(TratamientoEntity tratamiento) {
        this.tratamiento = tratamiento;
    }

    public JugadoraEntity getJugadora() {
        return jugadora;
    }

    public void setJugadora(JugadoraEntity jugadora) {
        this.jugadora = jugadora;
    }

    public Date getFechaSesion() {
        return fechaSesion;
    }

    public void setFechaSesion(Date fechaSesion) {
        this.fechaSesion = fechaSesion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
