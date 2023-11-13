package com.mycompany.solicitud;

import com.mycompany.solicitud.igu.Login;

public class Solicitud {

    public static void main(String[] args) {
        Login princ = new Login();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

        Coneccion objetoConexion = new Coneccion();
        objetoConexion.establecerConexion();

    }
}
