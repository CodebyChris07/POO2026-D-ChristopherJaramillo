/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaparaexamenbimestral;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author ASUS
 */
public class Inventario implements Serializable{
   private String nomJugador;
   ArrayList<Articulo> inve = new ArrayList();

    public Inventario(String nomJugador) {
        this.nomJugador = nomJugador;
    }
    
   public void recogerArticulo(Articulo articuloNuevo){
       // for (TipoDeMolde variableTemporal : nombreDeTuColeccion)
       boolean bandera = false;
       for(Articulo artEnCaja : inve){
       if(articuloNuevo.getId() == artEnCaja.getId()){
           bandera = true;
           break;
       }
       
       }
       if (bandera == true) { 
        System.out.println("El artículo ya está en tu inventario");
    } else {
           // para anadir el nuevo articulo
        inve.add(articuloNuevo);
        System.out.println("Artículo guardado con éxito");
    }
   
   
   }
   
    
    
}
