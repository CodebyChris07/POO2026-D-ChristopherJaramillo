/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import modelo.PartidoPadel;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Ejecutor {

    public static void main(String[] args) {
        // 1. Creación de datos para una prueba
        ArrayList<PartidoPadel> torneo = new ArrayList<>();
        torneo.add(new PartidoPadel("Lebron/Curry", "Messi/Ronaldo", "6-4, 4-6, 7-5"));
        torneo.add(new PartidoPadel("Di Caprio/Will Smith", "Ozuna/Bad Bunny", "6-2, 6-3"));

        // 2. Instanciar gestores
        
        GestorPadelTexto gestorTexto = new GestorPadelTexto();
        GestorPadelBinario gestorBinario = new GestorPadelBinario();

        System.out.println("--- GUARDANDO DATOS ---");
        gestorTexto.guardarPartidos(torneo);
        gestorBinario.guardarPartidos(torneo);

        System.out.println("\n--- CARGANDO DESDE TXT ---");
        ArrayList<PartidoPadel> cargadosTxt = gestorTexto.cargarPartidos();
        for (PartidoPadel p : cargadosTxt) {
            System.out.println(p.toString());
        }

        System.out.println("\n--- CARGANDO DESDE DAT (BINARIO) ---");
        ArrayList<PartidoPadel> cargadosBin = gestorBinario.cargarPartidos();
        for (PartidoPadel p : cargadosBin) {
            System.out.println(p.toString());
        }
    }
}
