/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportTrackPro.vista;

import sportTrackPro.controlador.ComponenteDeportivo;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class VistaConsola {

    public void vista() {
        ComponenteDeportivo controlador = new ComponenteDeportivo();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DEPORTIVA ===");
            System.out.println("1. Registrar un Equipo");
            System.out.println("2. Registrar un Jugador");
            System.out.println("3. Programar un Partido");
            System.out.println("4. Cargar Resultado de un Partido");
            System.out.println("5. Listar Jugadores de un Equipo");
            System.out.println("6. Mostrar Historial de Partidos de un Equipo");
            System.out.println("7. Generar Tabla de Posiciones");
            System.out.println("8. Salir del Sistema");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpieza de bufer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRAR NUEVO EQUIPO ---");
                    System.out.print("Ingrese el ID del equipo: ");
                    int idEq = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el Nombre del equipo: ");
                    String nombreEq = entrada.nextLine();
                    controlador.crearEquipo(idEq, nombreEq);
                    break;

                case 2:
                    System.out.println("\n--- REGISTRAR NUEVO JUGADOR ---");
                    System.out.print("Ingrese el ID del jugador: ");
                    int idJug = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el Nombre del jugador: ");
                    String nombreJug = entrada.nextLine();
                    System.out.print("Ingrese el ID del Equipo al que pertenece: ");
                    int idEquipoPertenece = entrada.nextInt();
                    controlador.registrarJugador(idJug, nombreJug, idEquipoPertenece);
                    break;

                case 3:
                    System.out.println("\n--- PROGRAMAR NUEVO PARTIDO ---");
                    System.out.print("Ingrese el ID del partido: ");
                    int idPart = entrada.nextInt();
                    System.out.print("ID del Equipo Local: ");
                    int e1 = entrada.nextInt();
                    System.out.print("ID del Equipo Visitante: ");
                    int e2 = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Fecha (AAAA-MM-DD): ");
                    String fecha = entrada.nextLine();
                    System.out.print("Sede / Lugar: ");
                    String sede = entrada.nextLine();
                    System.out.print("Nombre del Árbitro: ");
                    String arbitro = entrada.nextLine();
                    controlador.registrarPartido(idPart, e1, e2, fecha, sede, arbitro);
                    break;

                case 4:
                    System.out.println("\n--- CARGAR RESULTADO DE PARTIDO ---");
                    System.out.print("Ingrese el ID del Partido: ");
                    int partId = entrada.nextInt();
                    System.out.print("Goles del Equipo Local: ");
                    int m1 = entrada.nextInt();
                    System.out.print("Goles del Equipo Visitante: ");
                    int m2 = entrada.nextInt();
                    controlador.registrarResultado(partId, m1, m2);
                    break;

                case 5:
                    System.out.println("\n--- CONSULTAR JUGADORES POR EQUIPO ---");
                    System.out.print("Ingrese el ID del Equipo que desea consultar: ");
                    int buscarEq = entrada.nextInt();
                    controlador.listarJugadores(buscarEq);
                    break;
                case 6:
                    System.out.println("\n--- HISTORIAL DE PARTIDOS ---");
                    System.out.print("Ingrese el ID del Equipo: ");
                    int histEq = entrada.nextInt();
                    controlador.mostrarHistorial(histEq);
                    break;

                case 7:
                    controlador.tablaPosiciones();
                    break;

                case 8:
                    System.out.println("Saliendo de la aplicación...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");

            }

        } while (opcion != 8);
        entrada.close();

    }

}
