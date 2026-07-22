/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.pkg2bim;

/**
 *
 * @author ASUS
 */
public class ReparacionChapaPintura extends Trabajo{
    private int diasTranscurridos;

    public ReparacionChapaPintura(int diasTranscurridos, String descripcion) {
        super(descripcion);
        this.diasTranscurridos = diasTranscurridos;
    }

    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public void setDiasTranscurridos(int diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }
     public void aumentarMaterial(double valor) {
        costeMaterial += valor;
    }

    public void aumentarDias(int dias) {
        diasTranscurridos += dias;
    }

    public double calcularPrecio() {
        return (horas * 30) + (costeMaterial * 1.3);
    }

    public int getPlazoMaximo() {
        return 21;
    }

    public boolean estaFueraDePlazo() {
        return diasTranscurridos > getPlazoMaximo();
    }
     public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Horas: " + horas);
        System.out.println("Material: $" + costeMaterial);
        System.out.println("Dias: " + diasTranscurridos);
        System.out.println("Precio: $" + calcularPrecio());
    }
    
}
