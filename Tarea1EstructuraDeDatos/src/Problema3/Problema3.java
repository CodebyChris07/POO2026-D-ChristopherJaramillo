/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Problema3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner sc = new Scanner(System.in);

        System.out.println("Arreglo: " + Arrays.toString(array));
        System.out.print("Ingrese el número a buscar: ");
        int objetivo = sc.nextInt();

        int resultado = busquedaBinaria(array, objetivo);

        if (resultado == -1) {
            System.out.println("El elemento no se ha encontrado.");
        } else {
            System.out.println("El elemento se ha encontrado en el índice: " + resultado);
        }
    }

    public static int busquedaBinaria(int[] array, int objetivo) {
        int izquierdo = 0; // Índice inicial del bloque
        int derecho = array.length - 1; // Índice final del bloque

        // Mientras el índice izquierdo sea más pequeño o igual que el derecho
        // (Significa que los índices no se han cruzado y seguimos buscando)
        while (izquierdo <= derecho) {

            // Calculamos el punto medio para evitar desbordamientos de memoria
            int mitad = izquierdo + (derecho - izquierdo) / 2;

            // 1. Comprobamos si el valor del medio es el que buscamos
            if (array[mitad] == objetivo) {
                return mitad; // Objetivo cumplido, devolvemos la posición
            }

            // 2. Si el valor de la mitad es menor que el objetivo, 
            // significa que debemos buscar hacia la derecha e ignorar la parte izquierda.
            if (array[mitad] < objetivo) {
                izquierdo = mitad + 1; // Movemos el índice izquierdo
            } // 3. Si el valor de la mitad es mayor, 
            // significa que debemos buscar hacia la izquierda e ignorar la derecha.
            else {
                derecho = mitad - 1; // Movemos el índice derecho
            }
        }

        // Si el bucle termina y no retornó nada, el elemento no existe
        return -1;
    }

}
