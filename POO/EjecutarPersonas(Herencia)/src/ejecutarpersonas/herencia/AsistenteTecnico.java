/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarpersonas.herencia;

/**
 *
 * @author ASUS
 */
public class AsistenteTecnico extends Personas{
    private String tipoAsistente;

    public AsistenteTecnico(String tipoAsistente, String cedula, String nombres) {
        super(cedula, nombres);
        this.tipoAsistente = tipoAsistente;
    }

    public String getTipoAsistente() {
        return tipoAsistente;
    }

    public void setTipoAsistente(String tipoAsistente) {
        this.tipoAsistente = tipoAsistente;
    }
    public void apoyarEntrenamiento(){
        System.out.println("El asistente tecnico ayuda con sesiones de fuerza "
                + "para fortalecer los musculos de los jugadores");
        
    }
    
}
