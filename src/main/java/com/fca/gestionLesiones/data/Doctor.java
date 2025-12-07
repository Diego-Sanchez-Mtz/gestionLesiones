package com.fca.gestionLesiones.data;

public class Doctor extends Persona{
    private String cedulaProfesional;

    public String getCedulaProfesional() {
        return cedulaProfesional;
    }

    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }

    @Override
    public void editarTelefono(String telefono) {
        //TODO
    }

    @Override
    public void editarCorreo(String correo) {
        //TODO
    }

    //Método para asignar lesión a jugadora
    public void diagnosticarLesion(Jugadora jugadora, ILesion lesion){
        //TODO
    }

    public void asignarRehabilitacionALesion(ILesion lesion, IRehabilitacion rehabilitacion){
        //TODO
    }

    //Método para asignar tratamiento a un plan de rehabilitación
    public void asignarTratamientoARehabilitacion(IRehabilitacion rehabilitacion, ITratamiento tratamiento){
        //TODO
    }

}
