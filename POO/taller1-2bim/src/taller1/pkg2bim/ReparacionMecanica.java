/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.pkg2bim;

/**
 *
 * @author ASUS
 */
public class ReparacionMecanica extends Trabajo{
     private double precioMaterial;
    private int diasTranscurridos;

    public ReparacionMecanica(String descripcion) {
        super(descripcion);
        this.precioMaterial = 0;
        this.diasTranscurridos = 0;
    }

    public void aumentarMaterial(double valor) {
        precioMaterial += valor;
    }

    public void aumentarDias(int dias) {
        diasTranscurridos += dias;
    }

    public double calcularPrecio() {
        return (horas * 30) + (precioMaterial * 1.1);
    }

    public int getPlazoMaximo() {
        return 14;
    }

    public boolean estaFueraDePlazo() {
        return diasTranscurridos > getPlazoMaximo();
    }

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Horas: " + horas);
        System.out.println("Material: $" + precioMaterial);
        System.out.println("Dias: " + diasTranscurridos);
        System.out.println("Precio: $" + calcularPrecio());
    }
    
}
