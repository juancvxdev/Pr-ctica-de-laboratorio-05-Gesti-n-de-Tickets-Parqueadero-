/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IClienteDao;
import ec.edu.ups.idao.ITicketDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;


public class TicketDao implements ITicketDao  {
    private List<Ticket> tickets;
    private IClienteDao clienteDAO;
    public TicketDao() {
        tickets= new ArrayList<>();
    }
    
    @Override
    public void create(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public Ticket read(String placa ) {
       
        for (Ticket t  : tickets) {
            if (t.getVehiculo().getPlaca().equals(placa)){
                return  t;
            }
        }
        
            
        return null;
      
    }

    @Override
    public void update(Ticket ticket) {
        
    }

    @Override
    public void delete(Ticket ticket) {
        
    }

    @Override
    public List<Ticket> ListaTickets() {
        return null;
        
    }
    
}
