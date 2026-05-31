/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglomatrices;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArregloMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][3];

        leerArreglo(matriz);
        print2D(matriz);
        

        diagonalPrincipal(matriz);
        diagonalSecundaria(matriz);
        transpuesta(matriz);
        resultante();
        
        repaso(matriz);

        //  matriz[2][2] = 2;
    }

    public static void leerArreglo(int mat[][]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("\nDato [" + i + "] [" + j + "]:");
                mat[i][j] = entrada.nextInt();

            }

        }

    }

    public static void print2D(int mat[][]) {
        System.out.println("---- presentacion del arreglo ------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + "\t");

            }
            System.out.println();
        }

    }

    public static void diagonalPrincipal(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + "\t");

        }
        System.out.println();

    }

    public static void diagonalSecundaria(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][mat.length - 1 - i] + "\t");

        }
        System.out.println();
    }

    public static void transpuesta(int mat[][]) {
        System.out.println("---- presentacion de la transpuesta ------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + "\t");

            }
            System.out.println();
        }

    }

    public static void resultante() {
        int[][] mat = {{12, 45, 8, 11},
        {56, 7, 33, 97},
        {9, 11, 22, 36},
        {14, 31, 54, 6}};
        int[][] result = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                result[i][j] = mat[mat.length - 1 - j][mat.length - 1 - i];
            }
        }
        System.out.println("---- Matriz Resultante ------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void repaso(int[][] m) {
        
       
        

        // diagonal principal pero los demas terminos en 0
        /*
        int[][] b = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            b[i][i] = m[i][i];

        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
         */
    }

}
