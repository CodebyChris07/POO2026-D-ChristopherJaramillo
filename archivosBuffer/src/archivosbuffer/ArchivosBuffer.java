/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosbuffer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class ArchivosBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try (BufferedWriter mybw = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\bufferBc.txt", true))) {
            mybw.write("Esto es un ejercicio usando buffer1\n");
            mybw.write("Esto es un ejercicio usando buffer2\n");

        } catch (IOException e) {
            System.out.println("Error al escribir archivo");

        }
        try (BufferedReader mybr = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\bufferBc.txt"))) {
            String line = mybr.readLine();
            while (line != null) {
                System.out.println(line);
                line = mybr.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo");
        }
    }

}
