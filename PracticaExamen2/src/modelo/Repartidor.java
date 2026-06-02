/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Repartidor implements Serializable {
 private String cedula;
 private String nombre;
 private ArrayList<Pedido> pedidosEnruta;
 private double gananciasDelDia;

    public Repartidor(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.gananciasDelDia = 0.0;
        this.pedidosEnruta = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidosEnruta() {
        return pedidosEnruta;
    }

    public void setPedidosEnruta(ArrayList<Pedido> pedidosEnruta) {
        this.pedidosEnruta = pedidosEnruta;
    }

    public double getGananciasDelDia() {
        return gananciasDelDia;
    }

    public void setGananciasDelDia(double gananciasDelDia) {
        this.gananciasDelDia = gananciasDelDia;
    }
 
 
 
}

