/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1.pkg2bim;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Taller12bim {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Trabajo> garaje = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("===== Gestor de Taller =====");
        int opcion;
        do {
            System.out.println("1.Registrar Trabajo");
            System.out.println("2.Guardar y Realizar Respaldo");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    registrarTrabajo();
                    break;
                case 2:
                    PersistirData.mostrar(garaje);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

            }

        } while (opcion != 3);

    }

    public static void registrarTrabajo() {
        System.out.println("Registrando Trabajo");
        System.out.println("Descripcion:");
        String descripcion = entrada.nextLine();
        System.out.println("Elige Tipo: \n1. Mecanica\n2. Chapas\n3.Revision");
        int tipo = entrada.nextInt();

        if (tipo == 1) {
            garaje.add(new ReparacionMecanica(descripcion));
        } else if (tipo == 2) {
            garaje.add(new ReparacionChapaPintura(0, descripcion));
        } else {
            garaje.add(new Revision(descripcion));
        }

        System.out.println("Trabajo registrado con éxito.");
    }

}
