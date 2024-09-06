/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Venta {
    private int id_venta;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private LocalDate fecha_venta;

    public Venta() {
    }

    public Venta(int id_venta, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, LocalDate fecha_venta) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.fecha_venta = fecha_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", cliente=" + cliente.getPersona().getNombre() + ", vendedor=" + vendedor + ", vehiculo=" + vehiculo + ", fecha_venta=" + fecha_venta + '}';
    }


    
    
}
