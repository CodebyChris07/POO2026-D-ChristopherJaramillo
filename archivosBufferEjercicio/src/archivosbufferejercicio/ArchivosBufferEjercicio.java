/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosbufferejercicio;

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
public class ArchivosBufferEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        try (BufferedOutputStream mybos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\ASUS\\Desktop\\flujoDeCaracteres.txt"))) {
            System.out.println("Cual es tu nombre");
            String data = entrada.nextLine() + "\n";
            byte b[] = data.getBytes();
            
            System.out.println("Donde estudias");
            String respuesta = entrada.nextLine();
            byte c[] = respuesta.getBytes();
            mybos.write(b);
            mybos.write(c);
            mybos.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }

        try (BufferedInputStream mybis = new BufferedInputStream(new FileInputStream("C:\\Users\\ASUS\\Desktop\\flujoDeCaracteres.txt"))) {
            int i;
            while ((i = mybis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error en escribir un archivo");
        }
    }
}


