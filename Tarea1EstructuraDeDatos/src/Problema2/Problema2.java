/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int col = entrada.nextInt();
        entrada.nextLine();
        String matriz[][] = new String[filas][col];
        ingresarDatos(matriz);
        System.out.println("------ MATRIZ ORIGINAL ------");
        presentar(matriz);
        // invocamos al metodo para ordenar la matriz
        ordenarMatriz(matriz);
        System.out.println("------ MATRIZ ORDENADA ------");
        presentar(matriz);

    }

    public static void ingresarDatos(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingresa una palabra para la posicion [" + (i + 1) + "] [" + (j + 1) + "]");
                m[i][j] = entrada.nextLine();

            }

        }

    }

    public static void presentar(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ordenarMatriz(String[][] m) {
        int filas = m.length;
        int cols = m[0].length;
        String[] temp = new String[filas * cols];

        int k = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                temp[k++] = m[i][j];
            }
        }
        // Ordenamiento Burbuja para Strings
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j].compareToIgnoreCase(temp[j + 1]) > 0) {
                    String aux = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = aux;
                }
            }
        }
        k = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = temp[k++];
            }
        }
    }
}
