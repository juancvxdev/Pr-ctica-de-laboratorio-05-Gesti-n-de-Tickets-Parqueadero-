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

    public void crearTicket(int numero, Date fechaHoraIngreso, Date fechaHoraSalida, Double total, Vehiculo vehiculo, Boolean estado,double fraccion) {
        ticket = new Ticket(numero, fechaHoraIngreso, fechaHoraSalida, total, vehiculo, estado, fraccion);

        ticketDAO.create(ticket);
    }

    public Ticket buscarTicket(int numero) {

        ticket = ticketDAO.read(numero);
        return ticket;
    }

    public Ticket buscarTicketPlaca(String placa) {

        ticket = ticketDAO.readPlaca(placa);

        return ticket;

    }

    public void actualizarTicket(int numero, Date fechaHoraIngreso, Date fechaHoraSalida, Double total, Vehiculo vehiculo, Boolean estado,double fraccion) {
        ticket = new Ticket(numero, fechaHoraIngreso, fechaHoraSalida, total, vehiculo, estado,fraccion);
        ticketDAO.update(ticket);
    }

    public void eliminarTicket(int numero) {
        ticket = ticketDAO.read(numero);
        ticketDAO.delete(ticket);
    }

    public List<Ticket> ListarTickets() {
        return ticketDAO.ListaTickets();

    }

    public int obtenerSiguienteCodigo() {
        int codigo = ticketDAO.obtenerCodigo();

        return codigo;

    }

}
