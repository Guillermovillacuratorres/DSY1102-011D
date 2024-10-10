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
public class Cliente {
    private String idcliente, nombre;
    private List<Pedido> pedidosRealizados = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String idcliente, String nombre) {
        this.idcliente = idcliente;
        this.nombre = nombre;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombre=" + nombre + ", pedidosRealizados=" + pedidosRealizados + '}';
    }
    
    public void agregarPedidos(Pedido parpedido){
        pedidosRealizados.add(parpedido);
        System.out.println("Pedido agregado correctamente :D ❤ 😒😍");
    }
    
    
    
}
