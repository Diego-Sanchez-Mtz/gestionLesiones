package com.fca.gestionLesiones.data;

import com.fca.gestionLesiones.domain.TipoLesion;
import com.fca.gestionLesiones.domain.ZonaLesion;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tlesion")
public class LesionEntity {
    // ------- ID -------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLesion;

    // ------ FK's ------
    @ManyToOne
    @JoinColumn(name = "idJugadora", nullable = false)
    private JugadoraEntity jugadora;

    @ManyToOne
    @JoinColumn(name = "idDoctor", nullable = false)
    private DoctorEntity doctor;

    // ------ Columnas ------
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaAlta;

    private Integer semanasRecuperacion;

    @Column(nullable = false)
    private boolean estado;

    @Enumerated(EnumType.STRING)
    private TipoLesion tipoLesion;

    @Enumerated(EnumType.STRING)
    private ZonaLesion zonaLesion;

    public int getIdLesion() {
        return idLesion;
    }

    public void setIdLesion(int idLesion) {
        this.idLesion = idLesion;
    }

    public JugadoraEntity getJugadora() {
        return jugadora;
    }

    public void setJugadora(JugadoraEntity jugadora) {
        this.jugadora = jugadora;
    }

    public DoctorEntity getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorEntity doctor) {
        this.doctor = doctor;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getSemanasRecuperacion() {
        return semanasRecuperacion;
    }

    public void setSemanasRecuperacion(Integer semanasRecuperacion) {
        this.semanasRecuperacion = semanasRecuperacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TipoLesion getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(TipoLesion tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public ZonaLesion getZonaLesion() {
        return zonaLesion;
    }

    public void setZonaLesion(ZonaLesion zonaLesion) {
        this.zonaLesion = zonaLesion;
    }
}
