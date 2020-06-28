/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITicketDao;

import ec.edu.ups.modelo.Ticket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicketDao implements ITicketDao {

    private List<Ticket> tickets;
    private int codigo;

    public TicketDao() {
        tickets = new ArrayList<>();
        this.codigo = 0;
    }
    
    @Override
    public void create(Ticket ticket) {
        ticket.setNumero(++codigo);
        tickets.add(ticket);
    }
    
    @Override
    public Ticket read(String placa) {
        
        for (Ticket t : tickets) {
            if (t.getVehiculo().getPlaca().equals(placa)) {
                return t;
            }
        }
        
        return null;
        
    }
    
    @Override
    public void update(Ticket ticket) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket t = tickets.get(i);
            if (t.getNumero() == ticket.getNumero()) {
                tickets.set(i, ticket);
                break;
            }
        }
    }
    
    @Override
    public void delete(Ticket ticket) {
        Iterator<Ticket> it = tickets.iterator();
        while (it.hasNext()) {
            Ticket t = it.next();
            if (t.getNumero() == ticket.getNumero()) {
                it.remove();
                break;
            }
        }
    }
    
    @Override
    public List<Ticket> ListaTickets() {
        return tickets;
        
    }
    
    @Override
    public int obtenerCodigo() {
        return codigo;
    }
    
}
