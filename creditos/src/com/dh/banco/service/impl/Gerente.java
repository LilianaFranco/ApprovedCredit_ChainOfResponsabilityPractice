package com.dh.banco.service.impl;

import com.dh.banco.service.EmpleadoBanco;

public class Gerente extends EmpleadoBanco {

    //Methods
    @Override
    public void procesarSolicitud(Double monto) {
        if (monto >= 60000.00 && monto <= 200000.00)
            System.out.println("Yo me encargo de gestionarlo. Gerente");
        else if (this.sigEmpleadoBanco != null)
            this.sigEmpleadoBanco.procesarSolicitud(monto);


    }
}
