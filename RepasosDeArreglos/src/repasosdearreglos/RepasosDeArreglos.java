/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasosdearreglos;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class RepasosDeArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int tamanio = entrada.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese un numero para la posicion [" + i + "]");
            numeros[i] = entrada.nextInt();
        }
        try (BufferedOutputStream bos = new BufferedOutputStream
        (new FileOutputStream("C:\\Users\\ASUS\\Desktop\\ParesOImpares.txt"))) {
            for (int i = 0; i < numeros.length; i++) {
                int num = numeros[i];

                if (num % 2 == 0) {
                    String dato = "NUMEROS PARES" + num + "\n";
                    byte[] b = dato.getBytes();
                    bos.write(b);

                } else {
                    String dato = "NUMEROS IMPARES" + num + "\n";
                }
            }
            System.out.println("Archivo guardado con éxito.");
        } catch (IOException e) {
            System.out.println("\nValores del archivo leidos\n");

        }
        try (BufferedInputStream bis = new BufferedInputStream
        (new FileInputStream("C:\\Users\\ASUS\\Desktop\\ParesOImpares.txt"))) {
            int i;

            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: ");
        }
    }

}
