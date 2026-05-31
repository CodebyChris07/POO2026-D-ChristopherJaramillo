/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estudiantes = 20;
        int materias = 4;
        double notas[][] = new double[estudiantes][materias];
        System.out.println("========= Ingrese notas de los Estudiantes =========");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota de las asignatura " + (j + 1));
                notas[i][j] = entrada.nextDouble();

            }

        }
        media(notas);
        mediaAsignatura(notas);
        mediaClase(notas);

    }

    public static void media(double[][] notas) {
        System.out.println("\n--- Media de cada alumno ---");
        int numAlumnos = notas.length;
        int numAsignaturas = notas[0].length;
        for (int i = 0; i < numAlumnos; i++) {
            double sumaAlumno = 0;
            for (int j = 0; j < numAsignaturas; j++) {
                sumaAlumno += notas[i][j];

            }
            double media = sumaAlumno / numAsignaturas;
            System.out.printf("La media del alumno " + (i + 1) + " es: %.2f\n", media);

        }

    }

    public static void mediaAsignatura(double[][] notas) {
        System.out.println("\n--- Media de cada Asignatura ---");
        int numAlumnos = notas.length;
        int numAsignaturas = notas[0].length;
        for (int j = 0; j < numAsignaturas; j++) {
            double mediaAsig = 0;
            for (int i = 0; i < numAlumnos; i++) {
                mediaAsig += notas[i][j];

            }
            double media = mediaAsig / numAlumnos;
            System.out.printf("La media de la asignatura " + (j + 1) + " es: %.2f\n", media);

        }

    }

    public static void mediaClase(double[][] notas) {
        System.out.println("\n--- Media de la Clase ---");
        int numAlumnos = notas.length;
        int numAsignaturas = notas[0].length;
        double suma = 0;
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numAsignaturas; j++) {
                suma += notas[i][j];

            }
        }
        double media = suma / (numAlumnos * numAsignaturas);
        System.out.printf("La media de la clase es: %.2f\n", media);

    }

}
