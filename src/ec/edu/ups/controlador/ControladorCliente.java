/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.VehiculoDao;
import ec.edu.ups.idao.IClienteDao;
import ec.edu.ups.idao.IVehiculoDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.List;

/**
 *
 * @author Juanc
 */
public class ControladorCliente {
    private IClienteDao clienteDAO;
    private IVehiculoDao vehiculoDAO;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public ControladorCliente(ClienteDao clienteDAO, VehiculoDao vehiculoDao) {
        this.clienteDAO=clienteDAO;
        this.vehiculoDAO=vehiculoDao;
        
      
    }
      public void registrarCliente (String cedula, String nombre, String direccion, String telefono){
        cliente= new Cliente (cedula,nombre,direccion,telefono);
         clienteDAO.create(cliente);
        }
     
      public void actualizarCliente(String cedula, String nombre, String direccion, String telefono){
      cliente= new Cliente (cedula,nombre,direccion,telefono);
      clienteDAO.update(cliente);
      }
      
      public void eliminarCliente(String cedula){
      cliente= clienteDAO.read(cedula);
      clienteDAO.delete(cliente);
      }
    public void buscarCliente(String cedula){
    clienteDAO.read(cedula);
   }
     public void agregarVehiculo(String placa, String marca, String modelo){
     vehiculo = new Vehiculo(placa,marca, modelo);
    vehiculoDAO.create(vehiculo);
    cliente.agregarVehiculo(vehiculo);
    clienteDAO.update(cliente);
 
    }
        
    public void actualizarVehiculo(String placa, String marca, String modelo){
    vehiculo = new Vehiculo( placa,marca, modelo);
    vehiculoDAO.update(vehiculo);
    cliente.agregarVehiculo(vehiculo);
    clienteDAO.update(cliente);
    
   
    }
    public void eliminarVehiculo(String placa){
       vehiculo=vehiculoDAO.read(placa);
       vehiculoDAO.delete(vehiculo);
       cliente.eliminarVehiculo(placa);
    }
     public List<Vehiculo> listarVehiculos(){
        return cliente.getVehiculos();
    
    }
    
}
