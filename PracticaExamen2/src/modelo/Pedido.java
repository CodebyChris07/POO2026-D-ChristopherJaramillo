/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;


/**
 *
 * @author ASUS
 */
public class Pedido implements Serializable {
    private String codigoPedido;
    private String direccionCliente;
    private double precioComida;

    public Pedido(String codigoPedido, String direccionCliente, double precioComida) {
        this.codigoPedido = codigoPedido;
        this.direccionCliente = direccionCliente;
        this.precioComida = precioComida;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public double getPrecioComida() {
        return precioComida;
    }

    public void setPrecioComida(double precioComida) {
        this.precioComida = precioComida;
    }
    
    
    
}
