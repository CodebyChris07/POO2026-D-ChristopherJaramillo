/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejpagos;

/**
 *
 * @author ASUS
 */
public class EjPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Efectivo e = new Efectivo("1", "Juan", "Pago en linea", 2.5, 3, 0, 20);
        Tarjeta t = new Tarjeta("Maria","Visa", "100340", 444, "12-2034","2", "Maria", "Pago en Linea", 450.5, 3, 30);
        Transferencia tr = new Transferencia("3", "Pedro", "Pago en linea", 7, 9, 0, "Macahala");
        
        double pagoEfectivo = e.calcularPago();
        double pagoTarjeta = t.calcularPago();
        double pagoTransferencia = tr.calcularPago();
        
        System.out.println("--------------------------------------------------");
        System.out.println("El " + e.getTipo() + " de " + e.getNombre() + ", le corresponde pagar $" + e.getPago());
        System.out.println("--------------------------------------------------");
        if(pagoTarjeta > 0){
            System.out.println("El"+ t.getTipo() + " de " + t.getNombre() + ", le corresponde pagar $" + t.getPago());
            System.out.println("----------------------------------------------");
        
        }else{
            System.out.println("Fondos insuficientes");
        
        }
        System.out.println("--------------------------------------------------");
        System.out.println("El"+ tr.getTipo() + " de " + tr.getNombre() + ", le corresponde pagar $" + tr.getPago());
        
     
        
    }
    
}
