/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaparaexamenbimestral;
import java.io.Serializable;
/**
 *
 * @author ASUS
 */
public class Articulo implements Serializable{

    private String nombre;
    private String tipo;
    private int id;

    public Articulo(String nombre, String tipo, int id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
