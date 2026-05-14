/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicadetaller5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PracticaDeTaller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        CarritoDeCompras carrito = new CarritoDeCompras();

        while (bandera) {
            System.out.println("Menu de opciones del carrito");
            System.out.println("1. agregar un producto al carrito");
            System.out.println("2. Realizar el pago");
            System.out.println("3. Detalles de la compra");
            System.out.println("4. Salir");
            int opcion1 = entrada.nextInt();

            switch (opcion1) {
                case 1:
                    // mostar productos
                    carrito.mostrarProductos();
                    System.out.println("Seleccione un producto");
                    int opcion = entrada.nextInt();
                    System.out.println("Ingrese la cantidad");
                    int cantidad = entrada.nextInt();
                    carrito.agregarProducto(opcion, cantidad);
                    carrito.realizarPago(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a pagar:");
                    double monto = entrada.nextDouble();

                    carrito.realizarPago(monto);
                    break;
                case 3:

                    carrito.detallesCompra();
                    break;
                case 4:
                    bandera = false;
                    break;
            }
        }
    }

}
