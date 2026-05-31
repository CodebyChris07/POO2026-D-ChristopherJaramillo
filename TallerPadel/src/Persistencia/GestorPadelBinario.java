/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import modelo.PartidoPadel;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GestorPadelBinario {

    private String rutaArchivo = "C:\\Users\\ASUS\\Desktop\\partidos.txt";

    public void guardarPartidos(ArrayList<PartidoPadel> lista) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            salida.writeObject(lista);
            System.out.println("Datos guardados en BINARIO (.dat) exitosamente");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo binario: " + e);
        }
    }

    public ArrayList<PartidoPadel> cargarPartidos() {
        ArrayList<PartidoPadel> lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {
            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f))) {
                lista = (ArrayList<PartidoPadel>) entrada.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al leer el archivo binario: " + e);
            }
        }
        return lista;
    }

}
