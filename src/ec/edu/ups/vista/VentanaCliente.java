/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author paul_
 */
public class VentanaCliente extends javax.swing.JInternalFrame {

    private VentanaVehiculo ventanaVehiculo;
    private VentanaPrincipal ventanaPrincipal;
    private ControladorCliente controladorCliente;
    private String cedula;
    private String placa;

    public VentanaCliente(ControladorCliente controladorCliente, VentanaPrincipal ventanaPrincipal, VentanaVehiculo ventanaVehiculo) {
        initComponents();

        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorCliente = controladorCliente;
        this.ventanaVehiculo = ventanaVehiculo;
        this.placa = placa;
        txtCedula.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCedula.setText("CEDULA:");

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDireccion.setText("Direccion:");

        lblTelefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTelefono.setText("Telefono:");

        btnCrearCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCrearCliente.setText("CREAR");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblNombre)
                            .addComponent(lblDireccion)
                            .addComponent(lblTelefono))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnCrearCliente)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCrearCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        int desicion;
        cedula = txtCedula.getText();
        if (txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        } else {
            controladorCliente.registrarCliente(cedula, txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText());
            JOptionPane.showMessageDialog(this, "Registro de cliente existoso");
            Limpiar();
            Cliente cliente = controladorCliente.buscarCliente(cedula);
            if (cliente.ListarVehiculos().isEmpty()) {
                desicion = JOptionPane.showConfirmDialog(this, "Desea registrar un vehiculo a este cliente?");
            } else {
                desicion = JOptionPane.showConfirmDialog(this, "Desea registrar otro vehiculo a este cliente?");
            }

            if (desicion == JOptionPane.YES_OPTION) {

                ventanaPrincipal.getDesktopPane().add(ventanaVehiculo);
                ventanaVehiculo.getTxtCedula().setText(cedula);
                ventanaVehiculo.getTxtCedula().setEnabled(false);
                Limpiar();
                this.dispose();
                ventanaVehiculo.setVisible(true);
            } else if (desicion == JOptionPane.NO_OPTION) {
                Limpiar();
                this.dispose();
            }

        }

    }//GEN-LAST:event_btnCrearClienteActionPerformed
    public void Limpiar() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
