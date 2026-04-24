/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

/**
 *
 * @author ASUS
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {8,3,7,2,4};
        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j<array.length-i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}


