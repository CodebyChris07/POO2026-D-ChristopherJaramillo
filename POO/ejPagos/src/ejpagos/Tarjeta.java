/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejpagos;

/**
 *
 * @author ASUS
 */
public class Tarjeta extends Pagos {

    private String titular;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private int codigo;
    private String fechaCaducidad;

    public Tarjeta(String titular, String tipoTarjeta, String numeroTarjeta, int codigo, String fechaCaducidad, String id, String nombre, String tipo, double valor, int cantidad, double descuento) {
        super(id, nombre, tipo, valor, cantidad, descuento);
        this.titular = titular;
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.codigo = codigo;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularPago() {

        if (tipoTarjeta.equals("Visa")) {
            // 20%
            descuento = (valor * cantidad) * 0.2;
        } else if (tipoTarjeta.equals("Mastercard")) {
            // 17%
            descuento = (valor * cantidad) * 0.17;
        } else if (tipoTarjeta.equals("Diners")) {
            // 8%
            descuento = (valor * cantidad) * 0.08;
        }
        
        double fondos = 1000;
        pago = (valor * cantidad) - descuento;
        if(fondos > pago){
        return pago;
        }else{
        
        return 0;
        }
        
       

    }

}
