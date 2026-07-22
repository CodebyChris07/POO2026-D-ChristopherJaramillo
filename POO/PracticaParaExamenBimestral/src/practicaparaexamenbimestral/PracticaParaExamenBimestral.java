/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaparaexamenbimestral;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

        
        


/**
 *
 * @author ASUS
 */
public class PracticaParaExamenBimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un nombre para el inventario");
        String nombreInve = entrada.nextLine();
        Inventario miInventario = new Inventario(nombreInve);
        System.out.println("======== " + nombreInve + " ========");
        System.out.println("Ingresa el nombre del articulo");
        String nombreArt = entrada.nextLine();
        System.out.println("Ingresa el tipo (arma, posicion, etc)");
        String tipo = entrada.nextLine();
        System.out.println("Ingresa el id del arma");
        int id = entrada.nextInt();
        Articulo item = new Articulo(nombreArt, tipo, id);
        miInventario.recogerArticulo(item);
        
        Articulo item2 = new Articulo("Amuleto Maldito", "Magia", id);
        miInventario.recogerArticulo(item2);
        
        System.out.println("======= Guardando Partida =======");
        try{
        // creamos el archivo en el disco duro
        FileOutputStream tubo = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Inventario.dat");
        // preparamos el traductor de bytes
        ObjectOutputStream traductor = new ObjectOutputStream(tubo);
        // Escribimos nuestro inventario completo en el archivo
        traductor.writeObject(miInventario);
        // 4. Cerramos el traductor (¡muy importante para que el archivo se guarde bien!)
        traductor.close();
            System.out.println("Partida guardada con exito");
        }catch(IOException e){
            System.out.println("Hubo un problema al guardar el archivo" + e.getMessage());
        
        
        }
    }
    
}
