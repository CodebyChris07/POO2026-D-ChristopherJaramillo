/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos.controlador;

import basedatos.modelo.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ControlE {

    private static final String URL = "jdbc:sqlite:db/becas.db";

    private Connection obtenerConexion() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        crearTabla(conn);
        return conn;
    }
    // "CREATE TABLE IF NOT EXISTS --> ( personasbecas si trabajamos en una 
    // ya existente y est si queremos crear una nueva

    private void crearTabla(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS personasbecas ("
                + "cedula TEXT NOT NULL, "
                + "nombre TEXT, "
                + "edad INTEGER, "
                + "id_becas TEXT, "
                + "nombre_beca TEXT, "
                + "monto REAL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    public boolean insertar(Estudiante estudiante) {
        String sql = "INSERT INTO estudiante (cedula, nombre, edad,idBecas,"
                + "nombreBeca, monto) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, estudiante.getCedula());
            pstmt.setString(2, estudiante.getNombre());
            pstmt.setInt(3, estudiante.getEdad());
            pstmt.setString(4, estudiante.getIdBecas());
            pstmt.setString(5, estudiante.getNombreBeca());
            pstmt.setDouble(6, estudiante.getMonto());
            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Estudiante> listar() {
        ArrayList<Estudiante> lista = new ArrayList<>();
        String sql = "SELECT cedula, nombre, edad, idBecas, nombreBeca, pago FROM personasbecas";

        try (Connection conn = obtenerConexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(mapearEstudiante(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }

        return lista;
    }
}
