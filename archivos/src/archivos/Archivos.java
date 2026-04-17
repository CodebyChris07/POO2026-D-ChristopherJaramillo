/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author ASUS
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File myfile = new File("C:\\Users\\ASUS\\Desktop\\archivo.txt");
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
        try (FileWriter myWriter = new FileWriter("C:\\Users\\ASUS\\Desktop\\archivo.txt")) {
            // el true sirve para seguir anadiendo texto 
            myWriter.write("Ejemplo1 usando write con caracteres\n");
            myWriter.write("Ejemplo2 usando write con caracteres\n");
            myWriter.close();
            System.out.println("El archivo ha sido escrito");
        } catch (IOException e) {
            System.out.println("error de escritura");

        }
        try (FileReader myReader = new FileReader("C:\\Users\\ASUS\\Desktop\\archivo.txt")) {
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
                // System.out.print(i);

            }

        } catch (IOException e) {
            System.out.println("error de lectura");

        }
        

    }

}
