/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenfinalpractica;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PracticaExamenFinalPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorMatricula gestor = new GestorMatricula();
        // 2. Creamos las asignaturas de prueba
        Asignatura prog = new Asignatura("PRG1", "Programación", 6); // Cuesta: $150
        Asignatura edd = new Asignatura("EDD1", "Estructuras de Datos", 5); // Cuesta: $125
        Asignatura fis = new Asignatura("FIS1", "Física", 6); // Cuesta: $150
        // 3. Creamos al estudiante con un presupuesto de $300
        Estudiante alumno = new Estudiante("Christopher", "1101234567",  300.0);

        System.out.println("========== FASE 1: REGISTRO ==========");
        gestor.registrarEstudiante(alumno); // Éxito
        gestor.registrarEstudiante(alumno); // ERROR: El alumno ya existe

        System.out.println("\n========== FASE 2: MATRÍCULAS ==========");
        // Intento 1: Todo en orden
        gestor.matricularMateria("1101234567", prog); 
        // Saldo actual: $150. Créditos: 6.
        
        // Intento 2: Materia repetida
        gestor.matricularMateria("1101234567", prog); 
        // ERROR: Ya está matriculado en esa materia

        // Intento 3: Todo en orden
        gestor.matricularMateria("1101234567", edd); 
        // Saldo actual: $25. Créditos: 11.

        System.out.println("\n========== FASE 3: LÍMITES Y ERRORES ==========");
        // Intento 4: Intentar meter Física (Cuesta $150 pero solo le quedan $25)
        gestor.matricularMateria("1101234567", fis); 
        // ERROR: Dinero Insuficiente

        System.out.println("\n========== FASE 4: RETIROS Y REEMBOLSOS ==========");
        // Retiramos Programación para recuperar dinero
        gestor.retirarMateria("1101234567", "PRG1"); 
        // Devuelve $150. Saldo actual: $175. Créditos bajan a 5.

        // Intento 5: Ahora que tiene $175, volvemos a intentar meter Física
        gestor.matricularMateria("1101234567", fis); 
        // ¡ÉXITO! Se registra correctamente.
        
    }
    
}
