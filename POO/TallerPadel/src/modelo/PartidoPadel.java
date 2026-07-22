/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class PartidoPadel implements Serializable {

    private String pareja1;
    private String pareja2;
    private String marcador;

    public PartidoPadel(String pareja1, String pareja2, String marcador) {
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.marcador = marcador;
    }

    public String obtenerPareja1() {
        return pareja1;
    }

    public String obtenerPareja2() {
        return pareja2;
    }

    public String obtenerMarcador() {
        return marcador;
    }

    @Override
    public String toString() {
        return String.format("%s vs %s | Marcador: %s", pareja1, pareja2, marcador);
    }

}
