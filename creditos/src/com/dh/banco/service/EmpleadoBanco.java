package com.dh.banco.service;

public abstract class EmpleadoBanco {

    //Properties
    protected EmpleadoBanco sigEmpleadoBanco;

    //Methods
    public abstract void procesarSolicitud(Double monto);

    public EmpleadoBanco setSigEmpleadoBanco(EmpleadoBanco sigEmpleadoBanco) {
        this.sigEmpleadoBanco = sigEmpleadoBanco;
        return this;
    }
}
