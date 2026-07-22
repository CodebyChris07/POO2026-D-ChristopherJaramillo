/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import modelo.PartidoPadel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GestorPadelTexto {
    private String rutaArchivo = "C:\\Users\\ASUS\\Desktop\\partidos.txt";

    // Guarda una lista de partidos en un archivo de texto 
    public void guardarPartidos(ArrayList<PartidoPadel> lista) {
        try {
            Formatter salidaArchivo = new Formatter(rutaArchivo);
            for (PartidoPadel p : lista) {
                // Formateo usando punto y coma como delimitador
                String cadenaRegistro = String.format("%s;%s;%s", 
                        p.obtenerPareja1(), p.obtenerPareja2(), p.obtenerMarcador());
                salidaArchivo.format("%s\n", cadenaRegistro);
            }
            salidaArchivo.close();
            System.out.println("Datos guardados en TXT exitosamente");
        } catch (FileNotFoundException e) {
            System.err.println("Error al crear el archivo de texto: " + e);
        }
    }

    // Lee el archivo de texto y reconstruye los objetos
    public ArrayList<PartidoPadel> cargarPartidos() {
        ArrayList<PartidoPadel> lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {
            try {
                Scanner entrada = new Scanner(f);
                while (entrada.hasNext()) {
                    String linea = entrada.nextLine();
                    // Separar la línea usando el delimitador
                    ArrayList<String> linea_partes = new ArrayList<>(Arrays.asList(linea.split(";")));
                    
                    PartidoPadel p = new PartidoPadel(
                            linea_partes.get(0), 
                            linea_partes.get(1), 
                            linea_partes.get(2)
                    );
                    lista.add(p);
                }
                entrada.close();
            } catch (FileNotFoundException e) {
                System.err.println("Error al leer el archivo de texto: " + e);
            }
        }
        return lista;
    }
    
}
