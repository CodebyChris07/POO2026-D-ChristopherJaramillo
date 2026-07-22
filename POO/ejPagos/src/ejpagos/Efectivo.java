/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejpagos;

/**
 *
 * @author ASUS
 */
public class Efectivo extends Pagos{
    private double valorPagar;
    private double cambio;

    public Efectivo(String id, String nombre, String tipo, double valor, int cantidad, double descuento, double valorPagar) {
        super(id, nombre, tipo, valor, cantidad, descuento);
        this.valorPagar = valorPagar;
        this.cambio = 0;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getCambio() {
        return cambio;
    }

    @Override
    public double calcularPago() {
        // calcular cuanto debo pagar
        pago = (valor * cantidad) - descuento;
        cambio = valorPagar - pago;
        return pago;
         }
    
    
}
