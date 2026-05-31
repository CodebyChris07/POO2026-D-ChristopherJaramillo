/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejetelevisor;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class EjeTelevisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Televisor> tv = new ArrayList<>();
        Televisor t = new Televisor("001", 55, 650, "OLED");
        tv.add(t);
        // otra forma de anadir
        tv.add(new Televisor("002", 45,500,"xxx"));
        tv.add(new Televisor("003", 75,900,"yyy"));
        // imprimir precio
        
        System.out.println("El precio del tv es : " + tv.get(0).getPrecio());
        System.out.println("El precio del tv es : " + tv.get(1).getPrecio());
        System.out.println("El precio del tv es : " + tv.get(2).getPrecio());
        
    }
    
}
