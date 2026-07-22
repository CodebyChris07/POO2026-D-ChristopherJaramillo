/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejetelevisor;

/**
 *
 * @author ASUS
 */
public class Televisor {
    private String numSerie;

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Televisor(String numSerie, int tamanio, double precio, String modelo) {
        this.numSerie = numSerie;
        this.tamanio = tamanio;
        this.precio = precio;
        this.modelo = modelo;
    }
    private int tamanio;
    private double precio;
    private String modelo;
    
    
}
