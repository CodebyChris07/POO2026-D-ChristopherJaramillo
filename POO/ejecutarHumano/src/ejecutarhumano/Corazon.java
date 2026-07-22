/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarhumano;

public class Corazon {
private String tamanio;
private String color;
private String idCorazon;
private double peso;
private String estado;

// get y set

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdCorazon() {
        return idCorazon;
    }

    public void setIdCorazon(String idCorazon) {
        this.idCorazon = idCorazon;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void latir(){
        System.out.println("El corazon realiza 80 latidos/minuto");
    
    }



}
