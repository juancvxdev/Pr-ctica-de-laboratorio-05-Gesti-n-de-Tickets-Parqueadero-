/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IClienteDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juanc
 */
public class ClienteDao implements IClienteDao {

    private List<Cliente> clientes;
    Vehiculo vehiculo;

    public ClienteDao() {
        clientes = new ArrayList<>();
    }

    @Override
    public void create(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;

            }
        }

        return null;

    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getCedula().equals(cliente.getCedula())) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCedula().equals(cliente.getCedula())) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cliente> ListaClientes() {

        return clientes;

    }

}
