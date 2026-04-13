/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdedatosprimitivos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TiposDeDatosPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su peso en kilos");
        peso = entrada.nextDouble();
        System.out.println("Ingrese su altura en metros");
        altura = entrada.nextDouble();
        double altura2 = Math.pow(altura, 2);
        double imc = peso / altura2;
        System.out.println(nombre + " su IMC es " + imc);

    }

   
   
}
