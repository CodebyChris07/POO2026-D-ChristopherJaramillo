/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosbufferejerciciocaracteres;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArchivosBufferEjercicioCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\flujoDeCaracteres2.txt"))) {
            System.out.println("Cual es tu nombre");
            String nombre = entrada.nextLine();

            System.out.println("Donde estudias");
            String estudio = entrada.nextLine();

            writer.write(nombre);
            writer.newLine();
            writer.write(estudio);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\flujoDeCaracteres2.txt"))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

}
