/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul_
 */
public class VentanaIngresoTicket extends javax.swing.JInternalFrame {
    //private Vehiculo vehiculo;

    private VentanaPrincipal ventanaPrincipal;
    private VentanaVehiculo ventanaVehiculo;

    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    private VentanaCliente ventanaCliente;

    public VentanaIngresoTicket(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo, VentanaPrincipal ventanaPrincipal) throws ParseException {
        initComponents();

        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.ventanaPrincipal = ventanaPrincipal;
        ventanaVehiculo = new VentanaVehiculo(controladorVehiculo, controladorCliente, this.ventanaPrincipal);

        ventanaCliente = new VentanaCliente(this.controladorCliente, this.ventanaPrincipal, this.ventanaVehiculo);
        txtValidarPlaca.setFormatterFactory(
                new javax.swing.text.DefaultFormatterFactory(
                        new javax.swing.text.MaskFormatter("***-####")
                ));

    }

    public void cargartblTickets() {

        DefaultTableModel modelo = (DefaultTableModel) tblIngresoTickets.getModel();
        modelo.setRowCount(0);

        for (Ticket ticket : controladorTicket.ListarTickets()) {
            if (ticket.isEstado() == true) {
                Object[] rowData = {ticket.getNumero(),
                    ticket.getFechaHoraIngreso(),
                    ticket.getVehiculo().getPlaca(),
                    ticket.getVehiculo().getMarca(),
                    ticket.getVehiculo().getModelo(),
                    ticket.getVehiculo().getCliente().getCedula(),
                    ticket.getVehiculo().getCliente().getNombre(),
                    ticket.getVehiculo().getCliente().getDireccion(),
                    ticket.getVehiculo().getCliente().getTelefono()};
                modelo.addRow(rowData);
                tblIngresoTickets.setModel(modelo);
            }
        }

    }

    public void Limpiar() {
        txtValidarPlaca.setValue("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelIngresoTicket = new javax.swing.JPanel();
        lblPLACA = new javax.swing.JLabel();
        btnAsociar = new javax.swing.JButton();
        txtValidarPlaca = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngresoTickets = new javax.swing.JTable();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        PanelIngresoTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Ticket", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblPLACA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPLACA.setText("Placa:");

        btnAsociar.setText("Registrar");
        btnAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarActionPerformed(evt);
            }
        });

        tblIngresoTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Fecha de Ingreso", "Placa", "Marca", "Modelo", "Cedula", "Nombre", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIngresoTickets);

        javax.swing.GroupLayout PanelIngresoTicketLayout = new javax.swing.GroupLayout(PanelIngresoTicket);
        PanelIngresoTicket.setLayout(PanelIngresoTicketLayout);
        PanelIngresoTicketLayout.setHorizontalGroup(
            PanelIngresoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIngresoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIngresoTicketLayout.createSequentialGroup()
                        .addComponent(lblPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(txtValidarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsociar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIngresoTicketLayout.setVerticalGroup(
            PanelIngresoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresoTicketLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelIngresoTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsociar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIngresoTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIngresoTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarActionPerformed

        Calendar cal = Calendar.getInstance();
        Date fechaActual = cal.getTime();
        int desicion;
        if (txtValidarPlaca.getText().length() == 1) {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacio");

        } else {
            Vehiculo vehiculo = controladorVehiculo.buscarVehiculo(txtValidarPlaca.getText());

            if (vehiculo == null) {
                desicion = JOptionPane.showConfirmDialog(this, "No existe un vehiculo registrado con placa "
                        + txtValidarPlaca.getText() + " Desea registrar uno nuevo?");
                if (desicion == JOptionPane.YES_OPTION) {
                    ventanaPrincipal.getDesktopPane().add(ventanaVehiculo);
                    ventanaVehiculo.getTxtPlaca().setText(txtValidarPlaca.getText());
                    ventanaVehiculo.getTxtPlaca().setEnabled(false);
                    this.dispose();
                    ventanaVehiculo.setVisible(true);
                    

                } else {
                    Limpiar();
                }

            } else {

                controladorTicket.crearTicket(controladorTicket.obtenerSiguienteCodigo(), fechaActual, null, 0.0, vehiculo, true,0.0);
                JOptionPane.showMessageDialog(this, "Registro de ticket exitoso");
                cargartblTickets();
            }

        }

    }//GEN-LAST:event_btnAsociarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        if(controladorTicket.ListarTickets().isEmpty()){
      //
        }else{
         cargartblTickets();
        }
       
    }//GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelIngresoTicket;
    private javax.swing.JButton btnAsociar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPLACA;
    private javax.swing.JTable tblIngresoTickets;
    private javax.swing.JFormattedTextField txtValidarPlaca;
    // End of variables declaration//GEN-END:variables

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public VentanaVehiculo getVentanaVehiculo() {
        return ventanaVehiculo;
    }

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public ControladorTicket getControladorTicket() {
        return controladorTicket;
    }

    public ControladorVehiculo getControladorVehiculo() {
        return controladorVehiculo;
    }

    public VentanaCliente getVentanaCliente() {
        return ventanaCliente;
    }

    public JPanel getPanelIngresoTicket() {
        return PanelIngresoTicket;
    }

    public JButton getBtnAsociar() {
        return btnAsociar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLblPLACA() {
        return lblPLACA;
    }

    public JTable getTblIngresoTickets() {
        return tblIngresoTickets;
    }

    public JFormattedTextField getTxtValidarPlaca() {
        return txtValidarPlaca;
    }


}
