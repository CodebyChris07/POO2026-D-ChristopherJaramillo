/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarpersonas.herencia;

/**
 *
 * @author ASUS
 */
public class DirectorTecnico extends Personas{
    private String CarnetProfesional;

    public DirectorTecnico( String cedula, String nombres, String CarnetProfesional) {
        super(cedula, nombres);
        this.CarnetProfesional = CarnetProfesional;
    }

    public String getCarnetProfesional() {
        return CarnetProfesional;
    }

    public void setCarnetProfesional(String CarnetProfesional) {
        this.CarnetProfesional = CarnetProfesional;
    }
    public void entrenar(){
        System.out.println("El entrenador entrena a sus jugadores todas la mananas");
    
    }
    public void dirigir(){
        System.out.println("EL entrenador dirige dos equipos a la semana");
    
    }
    public void crearAlineaciones(){
        System.out.println("El entrenador crea alineaciones segun el formato 4-3-3");
    
    }
    public void generarConvocatoria(){
        System.out.println("El entrenador convoca a 26 jugadores para un partido");
    
    }
    
}
