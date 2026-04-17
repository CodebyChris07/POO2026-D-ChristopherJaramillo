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
        try (FileOutputStream fos = new FileOutputStream(myfile, true)) {
            String data = " Esto es un archivo usando stream \n";
            byte b[] = data.getBytes();// trabaja con bytes y no con texto puro,
                                      // conviertes el String en un arreglo de bytes
                                      
            fos.write(b); // Enviamos el arreglo de bytes al archivo a través del stream
            
            fos.close(); // cerramos el flujo manualmente 
            System.out.println("Se ha escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
        try (FileInputStream fis = new FileInputStream(myfile)) {
            int i;
            while ((i = fis.read()) != -1) { // lee el siguiente byte del archivo.
                                            // Cuando llega al final del archivo y 
                                            // ya no hay nada más que leer, devuelve -1. 
                                            // Por eso el ciclo se repite mientras i no sea -1.
                System.out.println((char) i);// Aqui imprimimos la varibale una vez salida del
                                            // bucle 

            }
        } catch (IOException e) {
            System.out.println("Error de escritura");

        }
        try (FileInputStream fis = new FileInputStream(myfile)) {// creamos un input y le damos
                                                                 // los parametros de myfile
            int i;
            while ((i = fis.read()) != -1) { //entramos en un ciclo donde leemos la variable i
                                             // y se va a leer hasta que ya no quede nd y se le
                                             // asigna el valor de -1
                System.out.print((char) i);

            }

        } catch (IOException e) {
            System.out.println("Error de lectura");

        }
    }
}
