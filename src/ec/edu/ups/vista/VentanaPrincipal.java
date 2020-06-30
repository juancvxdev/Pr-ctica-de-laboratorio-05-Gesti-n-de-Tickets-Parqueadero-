/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.TicketDao;
import ec.edu.ups.dao.VehiculoDao;
import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author paul_
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaVehiculo ventanaVehiculo;
    private VentanaCliente ventanaCliente;
    private VentanaIngresoTicket ventanaIngresoTicket;
    private VentanaSalida ventanaSalida;
    private VentanaListar ventanaListar;
    private ClienteDao clienteDAO;
    private VehiculoDao vehiculoDAO;
    private TicketDao ticketDAO;
    private ControladorCliente controladorCliente;
    private ControladorVehiculo controladorVehiculo;
    private ControladorTicket controladorTicket;
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() throws ParseException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        clienteDAO = new ClienteDao();
        vehiculoDAO = new VehiculoDao();
        ticketDAO = new TicketDao();
        controladorCliente = new ControladorCliente(clienteDAO, vehiculoDAO);
        controladorVehiculo = new ControladorVehiculo(vehiculoDAO);
        controladorTicket = new ControladorTicket(ticketDAO);
        ventanaVehiculo = new VentanaVehiculo(controladorVehiculo, controladorCliente, this);
        ventanaCliente = new VentanaCliente(controladorCliente, this, ventanaVehiculo);
        ventanaIngresoTicket = new VentanaIngresoTicket(controladorCliente, controladorTicket, controladorVehiculo, this);
        ventanaSalida = new VentanaSalida(controladorCliente, controladorTicket, controladorVehiculo);
        ventanaListar = new VentanaListar(controladorTicket);
        
    }

    public void cambiarIdioma(){
        
        btnMenu.setText(mensajes.getString("btnMenu"));
        btnIngresar.setText(mensajes.getString("btnIngresar"));
        btnRegistrarVehiculo.setText(mensajes.getString("btnRegistrarVehiculo"));
        btnIngresoTicket.setText(mensajes.getString("btnIngresoTicket"));
        btnSalidaTicket.setText(mensajes.getString("btnSalidaTicket"));
        btnListaTickets.setText(mensajes.getString("btnListaTickets"));
        btnSalir.setText(mensajes.getString("btnSalir"));
        btnIdioma.setText(mensajes.getString("btnIdioma"));
        btnEspañol.setText(mensajes.getString("btnEspañol"));
        btnIngles.setText(mensajes.getString("btnIngles"));
        ventanaCliente.getPanelCliente().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("PanelCliente"),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0)));
        ventanaCliente.getLblCedula().setText(mensajes.getString("lblCedula"));
        ventanaCliente.getLblNombre().setText(mensajes.getString("lblNombre"));
        ventanaCliente.getLblDireccion().setText(mensajes.getString("lblDireccion"));
        ventanaCliente.getLblTelefono().setText(mensajes.getString("lblTelefono"));
        ventanaCliente.getBtnCrearCliente().setText(mensajes.getString("btnCrearCliente"));
        ventanaVehiculo.getPanelVehiculo().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("PanelVehiculo"),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0)));
        ventanaVehiculo.getLblCEDULA().setText(mensajes.getString("lblCEDULA"));
        ventanaVehiculo.getLblPlaca().setText(mensajes.getString("lblPlaca"));
        ventanaVehiculo.getLblMarca().setText(mensajes.getString("lblMarca"));
        ventanaVehiculo.getLblModelo().setText(mensajes.getString("lblModelo"));
        ventanaVehiculo.getBtnCrearVehiculo().setText(mensajes.getString("btnCrearVehiculo"));
        ventanaIngresoTicket.getPanelIngresoTicket().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("PanelIngresoTicket"),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0)));
        ventanaIngresoTicket.getLblPLACA().setText(mensajes.getString("lblPlaca"));
        ventanaIngresoTicket.getBtnAsociar().setText(mensajes.getString("btnAsociar"));
        ventanaSalida.getPanelSalida().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("PanelSalida"),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0)));
        ventanaSalida.getLblCodigoSalida().setText(mensajes.getString("lblCodigoSalida"));
        ventanaSalida.getBtnSALIR().setText(mensajes.getString("btnSALIR"));
        ventanaSalida.getBtnSacarVehiculo().setText(mensajes.getString("btnSacarVehiculo"));
        ventanaListar.getPanelLista().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("PanelLista"),
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0)));
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        btnIngresar = new javax.swing.JMenuItem();
        btnRegistrarVehiculo = new javax.swing.JMenuItem();
        btnIngresoTicket = new javax.swing.JMenuItem();
        btnSalidaTicket = new javax.swing.JMenuItem();
        btnListaTickets = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        btnIdioma = new javax.swing.JMenu();
        btnEspañol = new javax.swing.JMenuItem();
        btnIngles = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(desktopPane);

        btnMenu.setMnemonic('f');
        btnMenu.setText("Menu");

        btnIngresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        btnIngresar.setMnemonic('o');
        btnIngresar.setText("Registro Cliente");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnMenu.add(btnIngresar);

        btnRegistrarVehiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        btnRegistrarVehiculo.setText("Registro Vehiculo");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });
        btnMenu.add(btnRegistrarVehiculo);

        btnIngresoTicket.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        btnIngresoTicket.setMnemonic('s');
        btnIngresoTicket.setText("Ingresar Vehiculo");
        btnIngresoTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoTicketActionPerformed(evt);
            }
        });
        btnMenu.add(btnIngresoTicket);

        btnSalidaTicket.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalidaTicket.setText("Retirar Vehiculo");
        btnSalidaTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaTicketActionPerformed(evt);
            }
        });
        btnMenu.add(btnSalidaTicket);

        btnListaTickets.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btnListaTickets.setMnemonic('a');
        btnListaTickets.setText("Lista de Ticktes");
        btnListaTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaTicketsActionPerformed(evt);
            }
        });
        btnMenu.add(btnListaTickets);

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        btnSalir.setMnemonic('x');
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnMenu.add(btnSalir);

        menuBar.add(btnMenu);

        btnIdioma.setText("Idioma");

        btnEspañol.setText("Español");
        btnEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspañolActionPerformed(evt);
            }
        });
        btnIdioma.add(btnEspañol);

        btnIngles.setText("Ingles");
        btnIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInglesActionPerformed(evt);
            }
        });
        btnIdioma.add(btnIngles);

        menuBar.add(btnIdioma);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        desktopPane.add(ventanaCliente);

        ventanaCliente.setVisible(true);
        ventanaIngresoTicket.setVisible(false);
         ventanaSalida.setVisible(false);
        


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresoTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoTicketActionPerformed
        desktopPane.add(ventanaIngresoTicket);
        ventanaIngresoTicket.setVisible(true);
ventanaSalida.setVisible(false);
    }//GEN-LAST:event_btnIngresoTicketActionPerformed

    private void btnSalidaTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaTicketActionPerformed
        desktopPane.add(ventanaSalida);
        ventanaSalida.setVisible(true);
         ventanaIngresoTicket.setVisible(false);

    }//GEN-LAST:event_btnSalidaTicketActionPerformed

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        desktopPane.add(ventanaVehiculo);
        ventanaVehiculo.setVisible(true);
         ventanaIngresoTicket.setVisible(false);
         ventanaSalida.setVisible(false);
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void btnListaTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaTicketsActionPerformed
   desktopPane.add(ventanaListar);
   ventanaListar.setVisible(true);
    }//GEN-LAST:event_btnListaTicketsActionPerformed

    private void btnEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspañolActionPerformed
        localizacion = new Locale("es", "EC");
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_btnEspañolActionPerformed

    private void btnInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInglesActionPerformed
        localizacion = new Locale("en", "UK");
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_btnInglesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEspañol;
    private javax.swing.JMenu btnIdioma;
    private javax.swing.JMenuItem btnIngles;
    private javax.swing.JMenuItem btnIngresar;
    private javax.swing.JMenuItem btnIngresoTicket;
    private javax.swing.JMenuItem btnListaTickets;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenuItem btnRegistrarVehiculo;
    private javax.swing.JMenuItem btnSalidaTicket;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    public VentanaVehiculo getVentanaVehiculo() {
        return ventanaVehiculo;
    }

    public VentanaCliente getVentanaCliente() {
        return ventanaCliente;
    }

    public VentanaIngresoTicket getVentanaIngresoTicket() {
        return ventanaIngresoTicket;
    }

    public VentanaSalida getVentanaSalida() {
        return ventanaSalida;
    }

    public VentanaListar getVentanaListar() {
        return ventanaListar;
    }

    public ClienteDao getClienteDAO() {
        return clienteDAO;
    }

    public VehiculoDao getVehiculoDAO() {
        return vehiculoDAO;
    }

    public TicketDao getTicketDAO() {
        return ticketDAO;
    }

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public ControladorVehiculo getControladorVehiculo() {
        return controladorVehiculo;
    }

    public ControladorTicket getControladorTicket() {
        return controladorTicket;
    }

    public Locale getLocalizacion() {
        return localizacion;
    }

    public ResourceBundle getMensajes() {
        return mensajes;
    }

    public JMenuItem getBtnEspañol() {
        return btnEspañol;
    }

    public JMenu getBtnIdioma() {
        return btnIdioma;
    }

    public JMenuItem getBtnIngles() {
        return btnIngles;
    }

    public JMenuItem getBtnIngresar() {
        return btnIngresar;
    }

    public JMenuItem getBtnIngresoTicket() {
        return btnIngresoTicket;
    }

    public JMenuItem getBtnListaTickets() {
        return btnListaTickets;
    }

    public JMenu getBtnMenu() {
        return btnMenu;
    }

    public JMenuItem getBtnRegistrarVehiculo() {
        return btnRegistrarVehiculo;
    }

    public JMenuItem getBtnSalidaTicket() {
        return btnSalidaTicket;
    }

    public JMenuItem getBtnSalir() {
        return btnSalir;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public JMenu getjMenu4() {
        return jMenu4;
    }

    public JMenu getjMenu5() {
        return jMenu5;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

}
