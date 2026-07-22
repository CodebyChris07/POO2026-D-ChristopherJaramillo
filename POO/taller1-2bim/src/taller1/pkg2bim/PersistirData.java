/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.pkg2bim;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class PersistirData {
     private static final String ARCHIVO = "garaje.dat";
    private static final String RESPALDO = "garaje_antiguo.dat";
    public static void mostrar(ArrayList<Trabajo> trabajos){
        try {
            File archivo = new File(ARCHIVO);
            if (archivo.exists()) {
                File respaldo = new File(RESPALDO);
                if (respaldo.exists()) {
                    respaldo.delete();
                }
            archivo.renameTo(respaldo);
            }
            ObjectOutputStream very = new ObjectOutputStream(new FileOutputStream(ARCHIVO));

            very.writeObject(trabajos);
            very.close();

            System.out.println("Datos alamcenados");
        } catch (IOException e) {
            System.out.println("Error en creacion");
        }
    }
    
}
