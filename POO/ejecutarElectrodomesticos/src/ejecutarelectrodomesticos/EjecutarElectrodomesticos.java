/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutarelectrodomesticos;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EjecutarElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear objetos que usen los atributos y comportamientos de 
        Scanner entrada = new Scanner(System.in);
        tv tv = new tv(65, "OLED", "887765544", "4k", "Negro");
        System.out.println("Ingresa el tiempo que estuvo encendido el tv");
        int t = entrada.nextInt();
        // heredados
        tv.encender();
        tv.consumoenergia();
        

    }

}
