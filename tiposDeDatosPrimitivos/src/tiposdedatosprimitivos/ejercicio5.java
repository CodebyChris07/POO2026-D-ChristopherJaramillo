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
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        int inicio;
        int longitud;

        System.out.println("Ingrese una frase");
        frase = entrada.nextLine();

        do {
            System.out.println("Ingrese la posicion de inicio");
            inicio = entrada.nextInt();
            System.out.println("Ingrese una cantidad de caracteres a extraer");
            longitud = entrada.nextInt();

            if (inicio < 0 || inicio >= frase.length() || longitud < 0 || 
                    (inicio + longitud) > frase.length()) {
                System.out.println("Valor fuera de rango");
            } else {
                break;
            }
        } while (true);

        String subcadena = frase.substring(inicio, inicio + longitud);
        System.out.println("La subcadena obtenida es: " + subcadena);
    }
}

