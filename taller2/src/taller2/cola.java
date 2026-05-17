/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */


public class cola {

    String[] cola;
    int TOPE, MAX;
    Scanner entrada = new Scanner(System.in);

    public cola(int MAX) {

        this.MAX = MAX;
        this.cola = new String[this.MAX];
        this.TOPE = -1;

    }

    public boolean ColaLlena() {

        return this.TOPE == this.MAX - 1;

    }

    public boolean ColaVacia() {

        return this.TOPE == -1;

    }

    public void InsertarCola() {

        if (this.ColaLlena()) {

            System.out.println("La cola esta llena");

        } else {

            String ticket;

            System.out.println("Ingrese el codigo del ticket:");
            ticket = entrada.next();

            this.TOPE++;
            this.cola[this.TOPE] = ticket;

            System.out.println("Ticket insertado correctamente");

        }

    }

    public void EliminarCola() {

        if (this.ColaVacia()) {

            System.out.println("La cola esta vacia");

        } else {

            String ticket = this.cola[0];

            System.out.println("Ingreso el niño con ticket: " + ticket);

            if (this.TOPE == 0) {

                this.TOPE = -1;

            } else {

                for (int i = 0; i < this.TOPE; i++) {

                    this.cola[i] = this.cola[i + 1];

                }

                this.TOPE--;

            }

        }

    }

    public void CantidadTickets() {

        int cantidad = this.TOPE + 1;

        System.out.println("Cantidad de tickets: " + cantidad);

    }

    public void MostrarCola() {

        if (this.ColaVacia()) {

            System.out.println("La cola esta vacia");

        } else {

            System.out.println("Tickets en la cola:");

            for (int i = 0; i <= this.TOPE; i++) {

                System.out.println(this.cola[i]);

            }

        }

    }
    
}
