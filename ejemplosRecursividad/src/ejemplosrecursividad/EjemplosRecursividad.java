/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosrecursividad;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjemplosRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para factorial");
        int num = entrada.nextInt();
        int m = factorial(num);
        System.out.println("Ingrese un numero para suma");
        int suma = entrada.nextInt();
        int s = suma(suma);
        System.out.println("Ingrese primer numero para suma");
        int s1 = entrada.nextInt();
        System.out.println("Ingrese segundo numero para suma");
        int s2 = entrada.nextInt();
        int suma23 = suma2(s1, s2);
        System.out.println(m + "\n" + s + "\n" + suma23);
        entrada.nextLine();// limpieza de buffer
      

      

    }

    public static int factorial(int n) {
        if (n == 1) {

            return 1;

        } else {

            return (n * factorial(n - 1));
        }

    }

    public static int suma(int n) {
        if (n == 1) {

            return 1;

        } else {

            return (n + suma(n - 1));
        }

    }

    public static int suma2(int start, int end) {

        if (start < end) {

            return start;

        } else {

            return (start + suma2(start + 1, end));

        }

    }

    public static boolean palindromeCheck(String s) {

        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {

            // System.out.println(s.charAt(0) + " " + s.charAt(s.length()-1));
            return palindromeCheck(s.substring(1, s.length() - 1));// desde donde inicia 1, 
                                                                   // y el final sin tomar en cuenta el 8 (1,8)
                                                                   

        }
        return false;
    }
}
