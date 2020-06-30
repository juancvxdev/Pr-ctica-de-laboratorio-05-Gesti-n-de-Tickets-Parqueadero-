/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IVehiculoDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author Juanc
 */
public class ControladorVehiculo {

    private IVehiculoDao vehiculoDAO;

    public ControladorVehiculo(IVehiculoDao vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
    }

    public void crearVehiculo(Vehiculo vehiculo) {

        vehiculoDAO.create(vehiculo);
    }

    public void actualizarVehiculo(Vehiculo vehiculo) {

        vehiculoDAO.update(vehiculo);
    }

    public Vehiculo buscarVehiculo(String placa) {
        Vehiculo vehiculo = vehiculoDAO.read(placa);
        return vehiculo;
    }

    public void eliminarVehiculo(String placa) {
        Vehiculo vehiculo = vehiculoDAO.read(placa);
        vehiculoDAO.delete(vehiculo);
    }

}
