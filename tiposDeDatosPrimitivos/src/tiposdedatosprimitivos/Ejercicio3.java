/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatosprimitivos;

/**
 *
 * @author ASUS
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        String usuario = "juan.perez@utpl.edu.ec";
        int posicionArroba = usuario.indexOf("@",0);
        String primerHash = usuario.substring(0, posicionArroba);      
        String segundoHash = usuario.substring(posicionArroba + 1);
        System.out.println(primerHash);
        System.out.println(segundoHash);

    }
}
