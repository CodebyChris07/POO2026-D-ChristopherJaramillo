/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema5;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numEncuestas = 10;
        try (BufferedWriter encuesta = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\encuesta.txt"))) {
            System.out.println("======= ENCUESTAS ======");
            for (int i = 0; i < numEncuestas; i++) {
                System.out.println("------- Encuesta #" + (i+1) + " ------");
                System.out.println("1. ¿Que edad tiene?");
                String edad = entrada.nextLine();
                System.out.println("2. ¿Usted vive en Loja (si/no)");
                String vive = entrada.nextLine();
                System.out.println("3. Entre, rock, pop, música nacional, otra, ¿qué tipo de música le gusta?");
                String tipo = entrada.nextLine();
                System.out.println("4. ¿A cuántos eventos ha asistido?");
                String eventos = entrada.nextLine();
                String dato = "Encuesta #" + (i + 1) + "\nEdad: " + edad
                        + "\nVive en Loja: " + vive + "\nMusica: " + tipo
                        + "\nEventos asistidos: " + eventos;
                encuesta.write(dato);
                encuesta.newLine();

            }

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");

        }
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\encuesta.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
