/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosrecursividad;

/**
 *
 * @author ASUS
 */
public class EjemFactorial {

    public static int factorial(int n) {
        if (n == 1) {

            return 1;

        } else {

            return (n * factorial(n - 1));
        }

    }

}
