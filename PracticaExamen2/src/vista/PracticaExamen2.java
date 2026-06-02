/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import controlador.GestorDelivery;
import modelo.*;


/**
 *
 * @author ASUS
 */
public class PracticaExamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creamos el objeto
        GestorDelivery gestor = new GestorDelivery();
        
        // creamos repartidores de prueba
        Repartidor re1 = new Repartidor("110011", "Juan Perez");
        Repartidor re2 = new Repartidor("110011", "Juan Perez");
        
        // creamos pedidos de prueba
        Pedido p1 = new Pedido("P-001", "Calle A", 15.5);
        Pedido p2 = new Pedido("P-002", "Calle B", 8);
        Pedido p3 = new Pedido("P-003", "Calle C", 12.25);
        Pedido p4 = new Pedido("P-004", "Calle D", 20);
        Pedido p5 = new Pedido("P-005", "Calle E", 5.5);
        
        
        System.out.println("======= CONTRATADOS ======");
        gestor.contratarRepartidor(re1);
        gestor.contratarRepartidor(re2);
        gestor.contratarRepartidor(re1);
        
        
        System.out.println("======= ASIGNADOR PEDIDO =======");
        gestor.asignarPedido("110011", p1);
        gestor.asignarPedido("110011", p2);
        gestor.asignarPedido("110011", p5);
        
        System.out.println("======= ASIGNAR NUEVO PEDIDO");
        gestor.asignarPedido("110011", p1);
        gestor.asignarPedido("110011", p4);
        
        System.out.println("======= CIERRE DE CAJA =======");
        gestor.generarCierreCajaTXT();
    }
    
}
