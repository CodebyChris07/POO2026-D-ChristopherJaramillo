package sportTrackPro.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ComponenteDeportivo {

    private static final String URL = "jdbc:sqlite:db/SportTrack.db";

    private Connection obtenerConexion() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        crearTabla(conn);
        return conn;
    }

    private void crearTabla(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS EventosDeportivos ("
                + "id INTEGER, "
                + "tipo_entidad TEXT NOT NULL, "
                + "nombre TEXT, "
                + "equipo_id INTEGER, "
                + "equipo1_id INTEGER, "
                + "equipo2_id INTEGER, "
                + "fecha TEXT, "
                + "sede TEXT, "
                + "arbitro TEXT, "
                + "marcador_equipo1 INTEGER DEFAULT 0, "
                + "marcador_equipo2 INTEGER DEFAULT 0, "
                + "estado TEXT DEFAULT 'pendiente')";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    public void registrarJugador(int id, String nombre, int equipoId) {
        String sql = "INSERT INTO EventosDeportivos (id, tipo_entidad, nombre, equipo_id) "
                + "VALUES (?, 'JUGADOR', ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setInt(3, equipoId);
            pstmt.executeUpdate();
            System.out.println("¡Jugador registrado con éxito en tu base de datos!");
        } catch (SQLException e) {
            System.out.println("Error al registrar Jugador: " + e.getMessage());
        }
    }

    public void crearEquipo(int id, String nombre) {
        String sql = "INSERT INTO EventosDeportivos (id, tipo_entidad, nombre) "
                + "VALUES (?, 'EQUIPO', ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.executeUpdate();
            System.out.println("¡Equipo registrado con éxito en tu base de datos!");
        } catch (SQLException e) {
            System.out.println("Error al registrar equipo: " + e.getMessage());
        }
    }

    public void registrarPartido(int id, int eq1, int eq2, String fecha, String sede, String arbitro) {
        String sql = "INSERT INTO EventosDeportivos (id, tipo_entidad, equipo1_id, equipo2_id, fecha, sede, arbitro, estado) "
                + "VALUES (?, 'PARTIDO', ?, ?, ?, ?, ?, 'pendiente')";
        try (Connection conn = obtenerConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setInt(2, eq1);
            pstmt.setInt(3, eq2);
            pstmt.setString(4, fecha);
            pstmt.setString(5, sede);
            pstmt.setString(6, arbitro);
            pstmt.executeUpdate();
            System.out.println("¡Partido registrado con éxito en tu base de datos!");
        } catch (SQLException e) {
            System.out.println("Error al registrar Partido: " + e.getMessage());
        }
    }

    public void registrarResultado(int partidoId, int marcadorE1, int marcadorE2) {
        String sql = "UPDATE EventosDeportivos SET marcador_equipo1 = ?, marcador_equipo2 = ?, estado = 'FINALIZADO' "
                + "WHERE id = ? AND tipo_entidad = 'PARTIDO'";

        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, marcadorE1);
            pstmt.setInt(2, marcadorE2);
            pstmt.setInt(3, partidoId);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("¡Marcador actualizado y partido finalizado con éxito!");
            } else {
                System.out.println("No se encontró ningún partido registrado con el ID: " + partidoId);
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar el resultado: " + e.getMessage());
        }
    }

    public void listarJugadores(int equipoId) {
        String sql = "SELECT id, nombre FROM EventosDeportivos WHERE tipo_entidad = 'JUGADOR' AND equipo_id = ?";

        try (Connection conn = obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, equipoId);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n--- JUGADORES DEL EQUIPO (ID: " + equipoId + ") ---");
            boolean tieneJugadores = false;

            while (rs.next()) {
                int idJug = rs.getInt("id");
                String nombreJug = rs.getString("nombre");
                System.out.println("ID: " + idJug + " | Nombre: " + nombreJug);
                tieneJugadores = true;
            }

            if (!tieneJugadores) {
                System.out.println("No se encontraron jugadores registrados para este equipo.");
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar los jugadores: " + e.getMessage());
        }
    }

    public void mostrarHistorial(int equipoId) {
        Map<Integer, String> nombresEquipos = new HashMap<>();

        String sqlEquipos = "SELECT id, nombre FROM EventosDeportivos WHERE tipo_entidad = 'EQUIPO'";
        String sqlPartidos = "SELECT * FROM EventosDeportivos WHERE tipo_entidad = 'PARTIDO' AND (equipo1_id = ? OR equipo2_id = ?)";

        try (Connection conn = obtenerConexion()) {
            try (Statement stmt = conn.createStatement(); ResultSet rsEq = stmt.executeQuery(sqlEquipos)) {
                while (rsEq.next()) {
                    nombresEquipos.put(rsEq.getInt("id"), rsEq.getString("nombre"));
                }
            }

            try (PreparedStatement pstmt = conn.prepareStatement(sqlPartidos)) {
                pstmt.setInt(1, equipoId);
                pstmt.setInt(2, equipoId);

                try (ResultSet rs = pstmt.executeQuery()) {
                    System.out.println("\n--- HISTORIAL DE ENCUENTROS ---");
                    boolean tienePartidos = false;

                    while (rs.next()) {
                        int e1 = rs.getInt("equipo1_id");
                        int e2 = rs.getInt("equipo2_id");

                        String nombreLocal = nombresEquipos.getOrDefault(e1, "Equipo " + e1);
                        String nombreVisitante = nombresEquipos.getOrDefault(e2, "Equipo " + e2);

                        System.out.println("Partido ID: " + rs.getInt("id")
                                + " | Local: " + nombreLocal + " [" + rs.getInt("marcador_equipo1") + "] "
                                + "vs Visitante: " + nombreVisitante + " [" + rs.getInt("marcador_equipo2") + "] "
                                + " | Estado: " + rs.getString("estado"));
                        tienePartidos = true;
                    }

                    if (!tienePartidos) {
                        System.out.println("Este equipo aún no tiene partidos programados o jugados.");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el historial: " + e.getMessage());
        }
    }

    public void tablaPosiciones() {
        Map<Integer, String> nombresEquipos = new HashMap<>();
        Map<Integer, Integer> puntos = new HashMap<>();

        try (Connection conn = obtenerConexion()) {
            Statement stmt = conn.createStatement();

            ResultSet rsEq = stmt.executeQuery("SELECT id, nombre FROM EventosDeportivos WHERE tipo_entidad = 'EQUIPO'");
            while (rsEq.next()) {
                int id = rsEq.getInt("id");
                nombresEquipos.put(id, rsEq.getString("nombre"));
                puntos.put(id, 0);
            }

            ResultSet rsPart = stmt.executeQuery(
                    "SELECT equipo1_id, equipo2_id, marcador_equipo1, marcador_equipo2 "
                    + "FROM EventosDeportivos WHERE tipo_entidad = 'PARTIDO' AND estado = 'FINALIZADO'");

            while (rsPart.next()) {
                int e1 = rsPart.getInt("equipo1_id");
                int e2 = rsPart.getInt("equipo2_id");
                int m1 = rsPart.getInt("marcador_equipo1");
                int m2 = rsPart.getInt("marcador_equipo2");

                if (m1 > m2) {
                    puntos.put(e1, puntos.getOrDefault(e1, 0) + 3);
                } else if (m2 > m1) {
                    puntos.put(e2, puntos.getOrDefault(e2, 0) + 3);
                } else {
                    puntos.put(e1, puntos.getOrDefault(e1, 0) + 1);
                    puntos.put(e2, puntos.getOrDefault(e2, 0) + 1);
                }
            }

            System.out.println("\n--- TABLA DE CLASIFICACIÓN ---");
            System.out.printf("%-20s | %-6s\n", "Equipo", "Puntos");
            System.out.println("---------------------------------");

            puntos.entrySet().stream()
                    .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                    .forEach(entry -> {
                        String nombreEq = nombresEquipos.getOrDefault(entry.getKey(), "Equipo ID " + entry.getKey());
                        System.out.printf("%-20s | %-6d\n", nombreEq, entry.getValue());
                    });

        } catch (SQLException e) {
            System.out.println("Error al generar la tabla de posiciones: " + e.getMessage());
        }
    }
}
