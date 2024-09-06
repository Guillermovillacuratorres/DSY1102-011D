/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Persona pCliente = new Persona();
        Cliente clienteUno = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        
        
        int opcion = 0;  
      
      while(opcion != 5){
        System.out.println("*******Menu*******");
        System.out.println("[1] - Agregar cliente");
        System.out.println("[2] - Agregar vendedor");
        System.out.println("[3] - Agregar vehiculo");
        System.out.println("[4] - Generar venta");
        System.out.println("[5] - Salir");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                entrada.nextLine();
                String run = "";
                while(true){
                    System.out.println("Ingrese el run del cliente:");
                    run = entrada.nextLine();
                    if(run.isEmpty()){
                        System.out.println("Debe ingresar un run.");
                    }else{
                        pCliente.setRun(run);
                        break;
                    }
                }
                
                
                
                
                System.out.println("Ingrese el nombre del cliente:");
                pCliente.setNombre(entrada.next());
                
                int anio,mes,dia;
                
                System.out.println("Ingrese el año de nacimiento");
                anio = entrada.nextInt();
                
                System.out.println("Ingrese el mes de nacimiento");
                mes = entrada.nextInt();
                
                System.out.println("Ingrese el dia de nacimiento");
                dia = entrada.nextInt();
                
                
                LocalDate  fecha_ingresada;
                fecha_ingresada = LocalDate.of(anio,mes,dia);
                
                if(LocalDate.now().isAfter(fecha_ingresada)){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
                //01-11-2024
                //05-09-2024
                
                
                
                pCliente.setFecha_nacimiento(LocalDate.of(anio, mes, dia));
                
                System.out.println("Ingrese el telefono del cliente:");        
                pCliente.setTelefono(entrada.nextInt());
                
                System.out.println("Ingrese la altura del cliente:");
                pCliente.setAltura(entrada.nextDouble());
                
                System.out.println("Ingrese si el cliente esta casado: ");
                pCliente.setCasado(entrada.nextBoolean());
                
                
                clienteUno.setId_cliente(1);
                clienteUno.setPersona(pCliente);
                
                
                
                
                
                        
                        
                
                
                System.out.println(clienteUno);              
                break;
            case 2:
                vehiculo.setPrecio(3000);
                vehiculo.calcularIvaVehiculo();
                vehiculo.recibirAlgo(1,"Pedro",pCliente);
                
                break;
            case 3:
                System.out.println("opcion 3");
                break;
            case 4:
                System.out.println("opcion 4");
                break;
            case 5:
                System.out.println("Saliendo...!!!!");
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        } 
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
