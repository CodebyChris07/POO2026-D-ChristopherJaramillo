/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutarpersonas.herencia;

/**
 *
 * @author ASUS
 */
public class EjecutarPersonasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugadores j1 = new Jugadores("1106043", "Moises Caicedo", "Mediocampista", 23);
        Jugadores j2 = new Jugadores("110605434", "Enner Valencia", "Delantero", 13);
        DirectorTecnico dt = new DirectorTecnico("110345667", "Beccacese", "877554");
        AsistenteTecnico at = new AsistenteTecnico("Asistente Fisico", "77777", "Juan");
        // invocar al metodo heredado
        System.out.println("========== Lista de Jugadores ==========");
        System.out.println("El jugador " + j1.getNombres());
        j1.cobrarSueldo();
        j1.jugar();
        System.out.println("El jugador " + j2.getNombres());
        j2.cobrarSueldo();
        j2.entrenar();
        System.out.println("==============================================");
        System.out.println("========== Lista de Directores Tecnicos ==========");
        System.out.println("El Director Tecnico " + dt.getNombres());
        dt.cobrarSueldo();
        dt.crearAlineaciones();
        dt.entrenar();
        dt.generarConvocatoria();
        System.out.println("==============================================");
         System.out.println("========== Lista de Asistentes Tecnicos ==========");
        System.out.println("El Asistente Tecnico " + at.getNombres());
        at.cobrarSueldo();
        at.apoyarEntrenamiento();
        
        
        
    }
    
}
