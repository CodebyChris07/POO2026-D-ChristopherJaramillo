/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = entrada.nextInt();
        int arreglo[] = new int[tamanio];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero para la posicion [" + (i + 1) + "]");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("-------- MENU --------");
        System.out.println("Ingrese una opcion de Ordenamiento");
        System.out.println("1. Burbuja");
        System.out.println("2. Insercion");
        System.out.println("3. Seleccion");
        System.out.println("4. QuickSort");
        System.out.println("Eliga una opcion:");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                burbuja(arreglo);
                break;
            case 2:
                seleccion(arreglo);
                break;
            case 3:
                insersion(arreglo);
                break;
            case 4:
                quickSort(arreglo, 0, arreglo.length - 1);
                break;
            default:
                System.out.println("Opcion no valida");

        }
        System.out.println("------ ARREGLO ORDENADO ------");
        for(int num : arreglo){
            System.out.println(num + " ");
        
        }

    }

    public static void burbuja(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void seleccion(int[] a) {
        int i, j, k, aux;
        for (i = 0; i < a.length - 1; i++) {
            k = i;
            for (j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (k != i) {
                aux = a[k];
                a[k] = a[i];
                a[i] = aux;
            }
        }
    }

    public static void insersion(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int j = i;
            for (; j > 0 && aux < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = aux;
        }
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

}
