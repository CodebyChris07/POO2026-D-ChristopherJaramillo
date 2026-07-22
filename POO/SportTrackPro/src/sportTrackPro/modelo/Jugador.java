/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportTrackPro.modelo;

/**
 *
 * @author ASUS
 */
public class Jugador {

    private int id;
    private String nombre;
    private int equipoId;

    public Jugador(int equipoId, int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.equipoId = equipoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

}
