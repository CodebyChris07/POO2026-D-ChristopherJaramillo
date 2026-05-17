/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        Scanner entrada = new Scanner(System.in);

        cola cola1 = new cola(20);

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insertar ticket");
            System.out.println("2. Eliminar ticket");
            System.out.println("3. Cantidad de tickets");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:

                    cola.InsertarCola();
                    break;

                case 2:

                    cola.EliminarCola();
                    break;

                case 3:

                    cola.CantidadTickets();
                    break;

                case 4:

                    cola.MostrarCola();
                    break;

                case 5:

                    System.out.println("Programa finalizado");
                    break;

                default:

                    System.out.println("Opcion incorrecta");

            }

        } while (opcion != 5);

    }

}
    }
    

