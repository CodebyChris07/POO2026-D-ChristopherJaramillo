/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosbufferbyte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class ArchivosbufferByte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (BufferedOutputStream mybos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\ASUS\\Desktop\\bufferBb.txt"))) {
            String data = "Esto es un ejercicio usando bufferB1\n";
            byte b[] = data.getBytes();
            mybos.write(b);
            mybos.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }

        try (BufferedInputStream mybis = new BufferedInputStream(new FileInputStream("C:\\Users\\ASUS\\Desktop\\ButterBb.bytes"))) {
            int i;
            while ((i = mybis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error en escribir un archivo");
        }
    }

}
