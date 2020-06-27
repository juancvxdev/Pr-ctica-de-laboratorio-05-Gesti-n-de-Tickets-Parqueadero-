/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Ticket;

import java.util.List;

/**
 *
 * @author Juanc
 */
public interface ITicketDao {

 public void create(Ticket ticket);

 public Ticket read(String placa);

 public void update(Ticket ticket);

 public void delete(Ticket ticket);
    
 public List<Ticket> ListaTickets();
    
}


