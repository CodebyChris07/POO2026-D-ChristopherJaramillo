/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutartriangulos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjecutarTriangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 2. crear objetos 
        Triangulo objUno = new Triangulo();

        // variables para pasar esos datos 
        System.out.println("Ingrese la base");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = entrada.nextDouble();
        // enviar datos al objeto
        objUno.setBase(base);
        objUno.setAltura(altura);
        // invocar a metodo para calcular el area
        double area = objUno.calcularArea();
        objUno.setArea(area);
        // imprimir los valores
        System.out.println("El area de un triangulo es = " + objUno.getArea());
        // objeto dos
         Triangulo objDos = new Triangulo();
         
         base = 6;
         altura = 8;
         // setear
         objDos.setBase(base);
         objDos.setAltura(altura);
         area = objDos.calcularArea();
         objDos.setArea(area);
         System.out.println("El area de un triangulo es = " + objDos.getArea());
    }
}
