/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sportTrackPro.modelo;

/**
 *
 * @author ASUS
 */
public class Partido {

    private int id;
    private int equipo1Id;
    private int equipo2Id;
    private String fecha;
    private String sede;
    private String arbitro;

    public Partido(int id, int equipo1Id, int equipo2Id, String fecha, String sede, String arbitro) {
        this.id = id;
        this.equipo1Id = equipo1Id;
        this.equipo2Id = equipo2Id;
        this.fecha = fecha;
        this.sede = sede;
        this.arbitro = arbitro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipo1Id() {
        return equipo1Id;
    }

    public void setEquipo1Id(int equipo1Id) {
        this.equipo1Id = equipo1Id;
    }

    public int getEquipo2Id() {
        return equipo2Id;
    }

    public void setEquipo2Id(int equipo2Id) {
        this.equipo2Id = equipo2Id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

}
