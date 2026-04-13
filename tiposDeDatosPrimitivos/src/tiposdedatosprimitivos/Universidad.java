/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatosprimitivos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Universidad {
 public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre = "La #Universidad Tecnica Particular de Loja# tiene dos "
            + "modalidades de estudio";
    int primerHash = nombre.indexOf("#", 0);
    int segundoHash = nombre.indexOf("#", primerHash + 1);
     System.out.println(primerHash);

 }

}
