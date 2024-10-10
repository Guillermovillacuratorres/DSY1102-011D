/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Pedido 
{
    private List<Producto> productos = new ArrayList<>();
    private double total;

    public Pedido() {
    }

    public Pedido(double total)
    {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", total=" + total + '}';
    }
    
    public void calcularTotal()
    {
        for (Producto i: productos)
        {
            this.setTotal(i.getPrecio() + total);
        }
        System.out.println("Su total es de : " + total);
    }
    
    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
        System.out.println(producto +" agregado correctamente.");
    }
}
