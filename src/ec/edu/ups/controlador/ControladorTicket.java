/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TicketDao;
import ec.edu.ups.idao.ITicketDao;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;


/**
 *
 * @author Juanc
 */
public class ControladorTicket {
    private Ticket ticket;
    private ITicketDao ticketDAO;

    public ControladorTicket(TicketDao ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
    
    public void crearTicket(int numero, Date fechaHoraIngreso, Date fechaHoraSalida, Double total, Vehiculo vehiculo){
        ticket= new Ticket( numero, fechaHoraIngreso, fechaHoraSalida, total, vehiculo);
        
        ticketDAO.create(ticket);
    }
    public void buscarTicket(String placa){
    
    ticketDAO.read(placa);
    }
    public void eliminarTicket(String placa){
   ticket= ticketDAO.read(placa);
   
}   
  
    
}
