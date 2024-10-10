/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadecomercioelectronico;

import cl.duoc.models.Electronico;
import cl.duoc.models.Pedido;
import cl.duoc.models.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class SistemaDeComercioElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Electronico> listadoProducto = new ArrayList<>(); 
        Pedido pedidoUno = new Pedido();
        int opcion = 0;
        
        JOptionPane.showInputDialog("Hooola soy un mensaje!!!");
        
        while(opcion != 7){
            System.out.println("********MENU********");
            System.out.println("[1] - Agregar producto");
            System.out.println("[2] - Listar productos");
            System.out.println("[3] - Agregar productos al pedido");
            System.out.println("[4] - Listar productos del pedido");
            System.out.println("[5] - Agregar pedidos al cliente");
            System.out.println("[6] - Listar pedidos del cliente");
            System.out.println("[7] - Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1 :
                    Electronico nuevoElectronico = new Electronico();
                    
                    System.out.println("Ingrese la marca:");
                    nuevoElectronico.setMarca(entrada.next());
                    
                    System.out.println("Ingrese la garantia:");
                    nuevoElectronico.setGarantiaMeses(entrada.nextInt());
                    
                    System.out.println("ingrese el id del producto:");
                    nuevoElectronico.setIdProducto(entrada.next());
                    
                    System.out.println("Ingrese el nombre del producto:");
                    nuevoElectronico.setNombre(entrada.next());
                    
                    System.out.println("Ingrese el precio del producto:");
                    nuevoElectronico.setPrecio(entrada.nextDouble());
                    
                    listadoProducto.add(nuevoElectronico);
                    break;
                
                    
                case 2:
                    if(listadoProducto.isEmpty()){
                        System.out.println("No hay productos electronicos registrados.");
                    }else{
                        System.out.println("LISTADO DE PRODUCTOS: ");
                        for(Electronico i : listadoProducto){
                        System.out.println("ID: " + i.getIdProducto() + 
                                " NOMBRE: " + i.getNombre()  + 
                                " PRECIO: " + i.getPrecio());
                        }
                    }
                    break;
                    
                case 3:
                    for(Electronico i : listadoProducto){
                        System.out.println("ID: " + i.getIdProducto() + 
                                " NOMBRE: " + i.getNombre()  + 
                                " PRECIO: " + i.getPrecio());
                        }
                    
                    String idProductousuario = "";
                    System.out.println("Ingresa el id del producto que "
                            + "desea agregar al pedido: ");
                    idProductousuario = entrada.next();
                    
                    for(Electronico i : listadoProducto){
                        if(i.getIdProducto().equals(idProductousuario)){
                            pedidoUno.agregarProducto(i);
                            System.out.println("producto agregado al pedido.");
                        }
                        
                    }
                    break;
                    
                    
                    
                case 4:
                    System.out.println("LISTADO PRODUCTOS PEDIDO:");
                    for(Producto i : pedidoUno.getProductos()){
                        System.out.println("ID: " + i.getIdProducto() + 
                                " NOMBRE: " + i.getNombre());
                    }
                    break;
            }
            
            
            
        }
            
            
    }
    
}
