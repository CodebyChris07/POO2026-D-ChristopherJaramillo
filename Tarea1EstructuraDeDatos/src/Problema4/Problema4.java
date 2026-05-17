/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Cuantas encuestas desea ingresar");
        int n = entrada.nextInt();
        entrada.nextLine();
        String encuesta[][] = new String[n][4];
        informacion(encuesta);
        presentar(encuesta);
        tabularResultados(encuesta);

    }

    public static void informacion(String[][] m) {
        
        for (int i = 0; i < m.length; i++) {
            System.out.println("------- ENCUESTA #" + (i+1) + " -------");
            System.out.println("1. Que edad tiene");
            m[i][0] = entrada.nextLine();
            System.out.println("2. Usted vive en Loja (si/no) ");
            m[i][1] = entrada.nextLine();
            System.out.println("3. Que tipo de musica le gusta (Rock, pop, musica nacional, otra)");
            m[i][2] = entrada.nextLine();
            System.out.println("4. A cuantos eventos ha asistido");
            m[i][3] = entrada.nextLine();
        }

    }

    public static void presentar(String[][] m) {
        System.out.println("--------- DATOS ENCUESTA ---------");
        System.out.println("EDAD\tDONDE VIVE\tTIPO MUSICA\tEVENTOS");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][0] + "\t" + m[i][1] + "\t" + m[i][2] + "\t"
                    + m[i][3] + "\t");

        }

    }

    public static void tabularResultados(String[][] m) {
        int menoresEdad = 0, deLoja = 0, gustaRock = 0, masDe3Eventos = 0;

        for (int i = 0; i < m.length; i++) {
            if (Integer.parseInt(m[i][0]) < 18) {
                menoresEdad++;
            }
            if (m[i][1].equalsIgnoreCase("si")) {
                deLoja++;
            }
            if (m[i][2].equalsIgnoreCase("rock")) {
                gustaRock++;
            }
            if (Integer.parseInt(m[i][3]) > 3) {
                masDe3Eventos++;
            }
        }

        System.out.println("\n--- RESULTADOS DE TABULACIÓN ---");
        System.out.println("1) Menores de edad: " + menoresEdad);
        System.out.println("2) Personas de Loja: " + deLoja);
        System.out.println("3) Les gusta el rock: " + gustaRock);
        System.out.println("4) Han asistido a más de 3 eventos: " + masDe3Eventos);
    }

}
