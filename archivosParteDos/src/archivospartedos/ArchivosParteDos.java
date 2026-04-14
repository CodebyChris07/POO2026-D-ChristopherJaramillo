/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivospartedos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author ASUS
 */
public class ArchivosParteDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File myfile = new File("ejemplobyte.txt");
        try {
            // File myfile = new File("C:\\Users\\ASUS\\Desktop\\archivo.txt");
            // File myfile = new File("archivoB1.txt");
            if (myfile.createNewFile()) {
                System.out.println("Archivo creado" + myfile.getName());

            } else {
                System.out.println("El archivo no existe");
                System.out.println("Archivo creado" + myfile.getPath());

            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
