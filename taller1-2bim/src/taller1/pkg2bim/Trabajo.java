/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.pkg2bim;

/**
 *
 * @author ASUS
 */
public class Trabajo {

    protected static int contador = 0;
    protected int id;
    protected String descripcion;
    protected int horas;
    protected boolean finalizado;
    protected double costeMaterial; 

    public Trabajo(String descripcion) {
        this.id = contador++;
        this.descripcion = descripcion;
        this.horas = 0;
        this.finalizado = false;
        this.costeMaterial = 0;
    }

    // Métodos para todos
    public void aumentarHoras(int h) {
        if (!finalizado) {
            horas += h;
        }
    }

    public void aumentarMaterial(double m) {
        if (!finalizado) {
            costeMaterial += m;
        }
    }

    public void finalizar() {
        finalizado = true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getHoras() {
        return horas;
    }

    public double getCosteMaterial() {
        return costeMaterial;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

}
