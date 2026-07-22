/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Formatter;
import modelo.Repartidor;
import modelo.Pedido;
import java.io.*;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class GestorDelivery {

    private ArrayList<Repartidor> listaRepartidor;

    public GestorDelivery() {
        this.listaRepartidor = new ArrayList<>();
    }
    

    public void contratarRepartidor(Repartidor r) {
        boolean bandera = false;
        for (Repartidor contratar : listaRepartidor) {
            if (r.getCedula().equals(contratar.getCedula())) {
                bandera = true;
                break;
            }
        }
        if (bandera == true) {
            System.out.println("Repartidor ya contratado");
        } else {
            listaRepartidor.add(r);
            System.out.println("Repartidor contratado");
        }

    }

    public void asignarPedido(String cedulaBuscada, Pedido nuevoPedido) {
        Repartidor repartidor = null;
        for (Repartidor pedido : listaRepartidor) {
            if (pedido.getCedula().equals(cedulaBuscada)) {
                repartidor = pedido;
                break;

            }

        }
        if (repartidor == null) {
            System.out.println("No se encontro al repartidor en el sistema");
            return;
        }

        for (Pedido pedido : repartidor.getPedidosEnruta()) {
            if (pedido.getCodigoPedido().equals(nuevoPedido.getCodigoPedido())) {
                System.out.println("Error el pedido ya esta registrado");
                return;

            }
        }
        if (repartidor.getPedidosEnruta().size() >= 3) {
            System.out.println("El repartidor ha alcancazado el limite de pedidos");
            return;
        }

        repartidor.getPedidosEnruta().add(nuevoPedido);
        double nuevoSaldo = repartidor.getGananciasDelDia() + 2.5;
        repartidor.setGananciasDelDia(nuevoSaldo);

    }

    public void generarCierreCajaTXT() {

        try {
            Formatter archivo = new Formatter("C:\\Users\\ASUS\\Desktop\\Cierre_repartidores.txt");
            archivo.format("=== REPORTE DE PAGOS ===\n");
            for (Repartidor repartidor : listaRepartidor) {
                String nombre = repartidor.getNombre();
                double pago = repartidor.getGananciasDelDia();
                archivo.format("Repartidor: " + nombre + " | Ganancia: $" + pago + "\n");                  
            }
            archivo.close();
            System.out.println("Archivo generado con exito");

        } catch (IOException e) {
            System.out.println("Erroa al generar el archivo" + e.getMessage());

        }
    }

}
