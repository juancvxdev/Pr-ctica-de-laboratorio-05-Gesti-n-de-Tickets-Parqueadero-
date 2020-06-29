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
import java.util.Date;
import javax.swing.JOptionPane;
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
   
  private Vehiculo vehiculo;
  private Cliente cliente;
  private Ticket ticket;
    public VentanaIngresoTicket(ControladorCliente controladorCliente,ControladorTicket controladorTicket,ControladorVehiculo controladorVehiculo, VentanaPrincipal ventanaPrincipal) throws ParseException {
        initComponents();
             
        this.controladorCliente=controladorCliente;
        this.controladorTicket=controladorTicket;
        this.controladorVehiculo=controladorVehiculo;
         this.ventanaPrincipal=ventanaPrincipal;
         ventanaVehiculo=new VentanaVehiculo(controladorVehiculo,controladorCliente);
             
        ventanaCliente= new VentanaCliente(this.controladorCliente,this.ventanaPrincipal,this.ventanaVehiculo,txtValidarPlaca.getText());
           
      txtValidarPlaca.setFormatterFactory(
         new javax.swing.text.DefaultFormatterFactory(
          new javax.swing.text.MaskFormatter("***-####")
                 
                 
         ));  
      
      
       
    }
   
    public void cargartblTickets(){ 
        
       
     DefaultTableModel modelo = (DefaultTableModel) tblIngresoTickets.getModel();
     modelo.setRowCount(0);

  for (Ticket ticket: controladorTicket.ListarTickets()){
  Object[] rowData ={ticket.getNumero(),ticket.getFechaHoraIngreso(),vehiculo.getPlaca(),vehiculo.getMarca(),
      vehiculo.getModelo(),cliente.getCedula(),cliente.getNombre(),cliente.getDireccion(),cliente.getTelefono()};
   modelo.addRow(rowData);
   tblIngresoTickets.setModel(modelo);
  }
    
    }
    public void Limpiar(){
        txtValidarPlaca.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Ticket", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Placa:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValidarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAsociar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidarPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsociar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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
   
    private void btnAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarActionPerformed
      Date fechaActual = new Date();
       vehiculo=controladorVehiculo.buscarVehiculo(txtValidarPlaca.getText());
            cliente=controladorCliente.buscarCliente(txtValidarPlaca.getText());
            ticket=controladorTicket.buscarTicket(txtValidarPlaca.getText());
      
        controladorTicket.crearTicket(controladorTicket.obtenerSiguienteCodigo(),fechaActual , null, null, vehiculo);
         cargartblTickets();
       
 
        
      
         
         
      //if (cliente==null && vehiculo==null){
          
             /*int desicion =JOptionPane.showConfirmDialog(this,"No existe un vehiculo registrado con placa "+txtValidarPlaca.getText()+" Desea registrar uno nuevo?");
  if(desicion==JOptionPane.YES_OPTION){
      ventanaPrincipal.getDesktopPane().add(ventanaCliente);
      ventanaCliente.setVisible(true);
        } else if(desicion==JOptionPane.NO_OPTION)
  Limpiar();
  }
        }else{
        
        }*/
   
    
    }//GEN-LAST:event_btnAsociarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //cargartblTickets();
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsociar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngresoTickets;
    private javax.swing.JFormattedTextField txtValidarPlaca;
    // End of variables declaration//GEN-END:variables
}
