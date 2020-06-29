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
import java.util.List;


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
    public Ticket buscarTicket(String placa){
   
    ticket =ticketDAO.read(placa);
    return ticket;
    }
   
    public void agregarVehiculo(){
    
    
    }
  public List<Ticket> ListarTickets(){
        return ticketDAO.ListaTickets();
   
   }
        public int obtenerSiguienteCodigo(){
        int codigo = ticketDAO.obtenerCodigo();
        
        return codigo;
        
        
}
        public Ticket buscaTicketActualizar(int numero){
            
            ticket=ticketDAO.buscarTicket(numero);
        return ticket;
        
        }
        public void agregarSalida(Ticket ticket){
        ticketDAO.agregarSalida(ticket);
        }
        public void eliminarTicket(Ticket ticket){
        ticketDAO.delete(ticket);
        }
        
        public List <Ticket> ListarSalidas(){
        return ticketDAO.ListaSalidas();
        
        }
}
