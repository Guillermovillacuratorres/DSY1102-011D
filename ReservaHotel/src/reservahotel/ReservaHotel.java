/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import cl.duoc.models.Cliente;
import cl.duoc.models.Habitacion;
import cl.duoc.models.Hotel;
import cl.duoc.models.Reserva;

/**
 *
 * @author Cetecom
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Hotel hotelUno = new Hotel("H001", "Trivago");
        hotelUno.agregarHabitacion(new Habitacion("HA001", 50000));
        hotelUno.agregarHabitacion(new Habitacion("HA002",60000));
        
        Cliente clienteUno = new Cliente("C001", "Pedro Fernandez");
        
        
        
        System.out.println(hotelUno);
        
        
        hotelUno.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteUno);

        
        System.out.println("Reservas del cliente : " );
        for(Reserva iteradorReserva : clienteUno.getReservasRealizadas()){
            System.out.println("Hotel: " + iteradorReserva.getHotel().getNombreHotel() + 
                                " - Habitacion: " + iteradorReserva.getHabitacion().getNumeroHabitacion() +
                                " - Cliente: " + clienteUno.getNombreCliente()
                                );
        }
        
        
    }
    
}
