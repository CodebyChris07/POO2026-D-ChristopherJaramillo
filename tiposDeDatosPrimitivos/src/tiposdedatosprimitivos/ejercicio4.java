/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatosprimitivos;

/**
 *
 * @author ASUS
 */
public class ejercicio4 {

    public static void main(String[] args) {
        String usuario = "08/04/2026";
        int posicionArroba = usuario.indexOf("/", 0);
        int posicionSlash = usuario.indexOf("/", posicionArroba+1);
        String primerHash = usuario.substring(0, posicionArroba);
        String segundoHash = usuario.substring(posicionArroba + 1,posicionSlash);
        String tercerHash = usuario.substring(posicionSlash + 1);
        System.out.println(primerHash);
        System.out.println(segundoHash);
        System.out.println(tercerHash);

    }
}
