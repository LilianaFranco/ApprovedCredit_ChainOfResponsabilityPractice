package com.dh.banco.service.impl;

import com.dh.banco.service.EmpleadoBanco;

public class Director extends EmpleadoBanco {

    //Methods
    @Override
    public void procesarSolicitud(Double monto) {
        if (monto > 200000.00)
            System.out.println("Yo me encargo de gestionarlo. Director");
        else if (this.sigEmpleadoBanco != null)
            this.sigEmpleadoBanco.procesarSolicitud(monto);
    }
}
