package com.mycompany.solicitud;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Coneccion {

    Connection conectar = null;
    //Esto se lo realiso para que el DRIVER de postgres se pueda conectar, e indicar un mensaje que nos dija que la conexion fue exitosa, y que esta conectada correctamente
    //Con el usuario, la contraseña que se puso al momento que se instalo la base de datos, de postgres, adeñas del nombre de la base de datos que se creo, juntyo con el IP, del programa, con su respectivo puerto

    String usuario = "postgres";
    String contrasenia = "123";
    String db = "SolicitudEquiposTIC";
    String ip = "localhost";
    String Puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + Puerto + "/" + db;
//Aqui se creo un mensaje que se muestre cuando se esta intentando ingresar a la baso de datos para llenar una solicitud y que esta se almacene correctamente, pero siexistio algun error con la conexion se no indicara que la base sufrio un error que no nos permitira entrar y llenar un informe
    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al connectar a la base de datos, error:" + e.toString());
        }
        return conectar;
    }

}
