/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicadetaller5;

/**
 *
 * @author ASUS
 */
public class CarritoDeCompras {

    // arreglo de producto que hay en la tienda
    Producto producto[] = new Producto[5];
    // arreglo para los prodcutos comprados
    Producto carrito[] = new Producto[5];
    int contadorCarrito = 0;

    public CarritoDeCompras() {
        producto[0] = new Producto("Laptop", 800, 10);
        producto[1] = new Producto("Mouse", 25, 20);
        producto[2] = new Producto("Teclado", 50, 15);
        producto[3] = new Producto("Monitor", 300, 8);
        producto[4] = new Producto("Audifonos", 100, 12);

    }

    public void mostrarProductos() {
        System.out.println("======= Productos disponibles =======");
        for (int i = 0; i < producto.length; i++) {
            System.out.println((i + 1) + ". " + producto[i].getNombre() + " - $"
                    + producto[i].getPrecio() + " STOCK: " + producto[i].getCantidad());

        }

    }

    public void agregarProducto(int opcion, int cantidad) {
        int i = opcion - 1;

        if (i >= 0 && i < producto.length) {
            if (producto[i].getCantidad() >= cantidad) {
                carrito[contadorCarrito] = new Producto(producto[i].getNombre(),
                        producto[i].getPrecio(), cantidad);
                producto[i].setCantidad(producto[i].getCantidad() - cantidad);

                contadorCarrito++;
                System.out.println("Producto agregado");

            } else {
                System.out.println("No hay suficiente stock");

            }
        } else {
            System.out.println("Opcion invalida");
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorCarrito; i++) {
            total += (carrito[i].getPrecio() * carrito[i].getCantidad());
        }
        return total;
    }

    public void realizarPago(double montoPagado) {
        double total = calcularTotal();
        // aplicar un descuento si
        if (total > 1000) {
            double descuento = total * 0.10; // 10%
            total = total - descuento;
            System.out.println("Se aplico un descuento del 10%");

        }
        System.out.println("Total a pagar" + total);
        if (montoPagado >= total) {
            double cambio = montoPagado - total;
            System.out.println("Pago realizado con exito");
            System.out.println("cambio $: " + cambio);


            System.out.println("Gracias por su compra");
        } else {
            double faltante = total - montoPagado;

            System.out.println("Dinero insuficiente");
            System.out.println("Faltan: $" + faltante);
        }
    }

    public void detallesCompra() {
        System.out.println("==== Detalles de la compra ====");
        for (int i = 0; i < contadorCarrito; i++) {
            System.out.println("Producto :" + carrito[i].getNombre()
                    + " | cantidad: " + carrito[i].getCantidad() + " | precio : "
                    + carrito[i].getPrecio());

        }
        System.out.println("TOTAL: $" + calcularTotal());
    }
}
