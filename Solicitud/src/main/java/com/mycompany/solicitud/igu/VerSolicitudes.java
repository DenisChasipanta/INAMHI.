/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.solicitud.igu;

import com.mycompany.solicitud.Coneccion;
import com.mycompany.solicitud.logica.Controladora;
import com.mycompany.solicitud.logica.Solicitud;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sistemas
 */
public class VerSolicitudes extends javax.swing.JFrame {

    Controladora control = null;
    DefaultListModel modelo = new DefaultListModel();
    Coneccion con = null;
    Statement st = null;
    ResultSet rs = null;
    DefaultTableModel tablaBuscar = new DefaultTableModel();

    /**
     * Creates new form VerSolicitudes
     */
    public VerSolicitudes() {
        control = new Controladora();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sistemas\\Downloads\\12.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("LISTADO DE SOLICITUDES GENERADAS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("EDITAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ELIMINAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REGRESAR AL INICIO");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 23375, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(558, 558, 558)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(10233, 10233, 10233))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10558, 10558, 10558))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getRowCount() > 0) {
            if (jTable1.getSelectedRow() != -1) {
                int num_codigo = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                control.borrarSolicitud(num_codigo);

                mostrarMensaje("Solicitud eliminada correctamente", "Info", "Borrado Exitoso");
                cargarTabla();
            } else {
                mostrarMensaje("No selecciono ninguna solicitud", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code heremcn:
        if (jTable1.getRowCount() > 0) {
            if (jTable1.getSelectedRow() != -1) {
                int num_codigo = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                ModificarSolicitud pantallaMo = new ModificarSolicitud(num_codigo);
                pantallaMo.setVisible(true);
                pantallaMo.setLocationRelativeTo(null);
                this.dispose();

            } else {
                mostrarMensaje("No selecciono ninguna solicitud", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar", "Error", "Error al editar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code heremcn:
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Número de registro", "Código", "Nombre del funcionario", "Direccion", "E-mail", "Tipo de registro", "Fecha", "Tipo de equipo", "Sistema operativo", "Procesador", "Tipo de disco", "Ram", "Capacidad de Disco", "Marca del Disco Duro/SSD", "Modelo del Disco Duro/SSD", "Serie del Disco Duro/SSD", "Estado del Disco Duro/SSD", "Observacion del Disco Duro/SSD", "Marca Case", "Modelo Case", "Serie Case", "Estado case", "Observacion Case", "Marca Monitor", "Modelo Monitor", "Serie Monitor", "Estado Monitor", "Observacion Monitor", "Marca Teclado", "Modelo Teclado", "Serie Teclado", "Estado Teclado", "Observacion Teclado", "Marca Mouse", "Modelo Mouse", "Serie Mouse", "Estado Mouse", "Observacion Mouse", "Marca UPS", "Modelo UPS", "Serie UPS", "Estado UPS", "Observacion UPS", "Marca Parlantes", "Modelo Parlantes", "Serie Parlantes", "Estado Parlantes", "Observacion Parlantes", "Marca Memoria Ram", "Modelo Memoria Ram", "Serie Memoria Ram", "Estado Memoria Ram", "Observacion Memoria Ram", "Marca Camara", "Modelo Camara", "Serie Camara", "Estado Camara", "Observacion Camara", "Marca Bateria", "Modelo Bateria", "Serie Bateria", "Estado Bateria", "Observacion Bateria", "Marca Cargador Portatil", "Modelo Cargador Portatil", "Serie Cragador Portatil", "Estado Cargador Portatil", "Observacion Cargador Portatil", "Marca Micrófono", "Modelo Micrófono", "Serie Micrófono", "Estado Micrófono", "Observacion Micrófono", "Marca Tarjeta Red", "Modelo Tarjeta Red", "Serie Tarjeta Red", "Estado Tarjeta Red", "Observacion Tarjeta Red", "Funciona Cable del Monitor", "Observacion Cable del Monitor", "Funciona Touchpad", "Observacion Touchpad", "Funciona Lector CD/DVD", "Observacion Lector CD/DVD", "Funciona Lector de tarjetas", "Observacion Lector de Tarjetas", "Funciona Puerto Ethernet", "Observacion Puerto Ethernet", "Funciona Puerto HDMI", "Observacion Puerto HDMI", "Funciona Puerto VGA", "Observacion Puerto VGA", "Funciona Indicadores Luminosos", "Observacion Indicadores Luminosos", "Funciona Salida de Audio", "Observacion Salida de Audio", "Funciona Wifi", "Observacion Wifi", "Mantenimiento Realizado/Realizar", "Revisado Por:", "Cargo", "Recibido Por:", "Cargo"};
        tabla.setColumnIdentifiers(titulos);
        List<Solicitud> listaSolicitudes = control.traerSolicitud();

        if (listaSolicitudes != null) {
            for (Solicitud soli : listaSolicitudes) {
                Object[] objeto = {soli.getNum_codigo(), soli.getCodigo(), soli.getUnPersona().getNombre(), soli.getDireccion(), soli.getEmail(), soli.getTipo_registro(), soli.getFecha(), soli.getTipo_equipo(), soli.getSistema_operativo(), soli.getProcesador(), soli.getTipo_disco(), soli.getRam(), soli.getCapacidad_disco(), soli.getMarca_discoDuro(), soli.getModelo_discoDuro(), soli.getSerie_discoDuro(), soli.getEstado_discoDuro(), soli.getObservacion_dicoDuro(), soli.getMarca_case(), soli.getModelo_case(), soli.getSerie_case(), soli.getEstado_case(), soli.getObservacion_case(), soli.getMarca_monitor(), soli.getModelo_monitor(), soli.getSerie_monitor(), soli.getEstado_monitor(), soli.getObservacion_monitor(), soli.getMarca_teclado(), soli.getModelo_teclado(), soli.getSerie_teclado(), soli.getEstado_teclado(), soli.getObservacion_teclado(), soli.getMarca_mouse(), soli.getModelo_mouse(), soli.getSerie_mouse(), soli.getEstado_mouse(), soli.getObservacion_mouse(), soli.getMarca_ups(), soli.getModelo_ups(), soli.getSerie_ups(), soli.getEstado_ups(), soli.getObservacion_ups(), soli.getMarca_parlantes(), soli.getModelo_parlantes(), soli.getSerie_parlantes(), soli.getEstado_parlantes(), soli.getObservacion_parlantes(), soli.getMarca_memoriaRam(), soli.getModelo_memoriaRam(), soli.getSerie_memoriaRam(), soli.getEstado_memoriaRam(), soli.getObservacion_memoriaRam(), soli.getMarca_camara(), soli.getModelo_camara(), soli.getSerie_camara(), soli.getEstado_camara(), soli.getObservacion_camara(), soli.getMarca_bateria(), soli.getModelo_bateria(), soli.getSerie_bateria(), soli.getEstado_bateria(), soli.getObservacion_bateria(), soli.getMarca_cargadorPortatil(), soli.getModelo_cargadorPortatil(), soli.getSerie_cargadorPortatil(), soli.getEstado_cargadorPortatil(), soli.getObservacion_cargadorPortatil(), soli.getMarca_microfono(), soli.getModelo_microfono(), soli.getSerie_microfono(), soli.getEstado_microfono(), soli.getObservacion_microfono(), soli.getMarca_tarjetaRed(), soli.getModelo_tarjetaRed(), soli.getSerie_cargadorPortatil(), soli.getEstado_tarjetaRed(), soli.getObservacion_tarjetaRed(), soli.getFunciona_cableEnergia(), soli.getObservacion_cableEnergia(), soli.getFunciona_touchpad(), soli.getObservacion_touchpad(), soli.getFunciona_lector(), soli.getObservacion_lector(), soli.getFunciona_lectorTarjetas(), soli.getObservacion_lectorTarjetas(), soli.getFunciona_puertoEthernet(), soli.getObservacion_puertoEthernet(), soli.getFunciona_puertoHDMI(), soli.getObservacion_puertoHDMI(), soli.getFunciona_puertoVGA(), soli.getObservacion_puertoVGA(), soli.getFunciona_indicadoresLuminosos(), soli.getObservacion_indicadoresLuminosos(), soli.getFunciona_salidaAudio(), soli.getObservacion_salidaAudio(), soli.getFunicona_wifi(), soli.getObservacion_wifi(), soli.getMantenimiento(), soli.getRevisadoPor(), soli.getCargoRevisado(), soli.getRecibidoPor(), soli.getCargoRecibido()};
                tabla.addRow(objeto);
            }
        }
        jTable1.setModel(tabla);

    }

}
