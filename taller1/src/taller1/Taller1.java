/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;




/**
 *
 * @author ASUS
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamano = entrada.nextInt();
        int[] numeros = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor para la posición " + i + ":");
            numeros[i] = entrada.nextInt();
        }

        
        String ruta = "C:\\Users\\ASUS\\Desktop\\Pares.txt";

        
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(ruta))) {
            
            for (int num : numeros) {
                if (num % 2 == 0) {
                    
                    String dato = "NUMEROS PARES " + num + "\n";
                   
                    byte[] b = dato.getBytes();
                    bos.write(b);
                }else{
                String dato = "NUMEROS IMPARES " + num + "\n";
                byte[] b = dato.getBytes();
                bos.write(b);
                
                }
            }
           
            System.out.println("Archivo guardado con éxito.");
            
        } catch (IOException e) {
            System.out.println("Error al escribir: ");
        }

        
        System.out.println("\n--- Valores leídos del archivo ---");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(ruta))) {
            int i;
            
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " );
        }
    }
}


