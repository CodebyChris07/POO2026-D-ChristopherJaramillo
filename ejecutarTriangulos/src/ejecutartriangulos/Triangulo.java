/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutartriangulos;

/**
 *
 * @author ASUS
 */
public class Triangulo {

    // listar atributos
    private double area;
    private double altura;
    private double base;
    private double perimetro;
    private double lUno;
    private double lDos;
    private double lTres;
    
    
    // get y set
    // al area no necesito el set porque no vamos a preguntar sino guardar

    public double getArea() {
        return area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcularArea() {

        return (base * altura) / 2;
    }

    public void setArea(double area) {
        this.area = area;

    }

    public double getlUno() {
        return lUno;
    }

    public void setlUno(double lUno) {
        this.lUno = lUno;
    }

    public double getlDos() {
        return lDos;
    }

    public void setlDos(double lDos) {
        this.lDos = lDos;
    }

    public double getlTres() {
        return lTres;
    }

    public void setlTres(double lTres) {
        this.lTres = lTres;
    }
    
     public double getPerimetro() {
        return (lUno + lDos + lTres);
    }
}
