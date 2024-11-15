/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import models.Producto;

/**
 *
 * @author Cetecom
 */
public class ProductoController {
    private static List<Producto> productos = new ArrayList<>();
    private static int idProducto = 1;
    HelperController helper = new HelperController();
    
    
    public void agregarProducto(String nombre,double precio, int cantidad){

            Producto productoNuevo = new Producto(idProducto++, nombre, precio, cantidad);
            productos.add(productoNuevo);
            helper.showInformation("Producto agregado.");
        
    }
    
    public Producto buscarProducto(int idProducto){
        for(Producto i : productos){
            if(i.getId() == idProducto){
                return i;
            }
        }
        return null;
    }
    
    public void actualizarProducto(int id, String nombre,double precio, int cantidad){
        Producto productoEncontrado = buscarProducto(id);
        if(productoEncontrado != null){
            productoEncontrado.setNombre(nombre);
            productoEncontrado.setPrecio(precio);
            productoEncontrado.setCantidad(cantidad);
            helper.showInformation("Producto actualizado.");
        }
    }
    
    
    public void eliminarProducto(int id){
        Producto productoEncontrado = buscarProducto(id);
        if(productoEncontrado != null){
            productos.remove(productoEncontrado);
            helper.showInformation("Producto eliminado.");
        }else{
            helper.showError("Producto no encontrado.");
        }
    }
    
    
    public List<Producto> obtenerProductos(){
        return productos;                 
    }
    
}
