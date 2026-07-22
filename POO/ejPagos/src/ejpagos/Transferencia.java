/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejpagos;

/**
 *
 * @author ASUS
 */
public class Transferencia extends Pagos {

    private String banco;
    private double comision;

    public Transferencia(String id, String nombre, String tipo, double valor, int cantidad, double descuento, String banco) {
        super(id, nombre, tipo, valor, cantidad, descuento);
        this.banco = banco;
        this.comision = 0;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public double calcularPago() {
        if (banco.equals("Loja")) {
            comision = 0;
        } else {
            comision = 0.5;
        }
        pago = (valor * cantidad) + comision;
        return pago;

    }
    

}
