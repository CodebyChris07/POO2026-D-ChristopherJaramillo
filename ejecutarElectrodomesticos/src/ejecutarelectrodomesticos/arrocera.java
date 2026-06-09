/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarelectrodomesticos;

/**
 *
 * @author ASUS
 */
public class arrocera extends Electrodomesticos {

    private double capacidad;
    private String tiempoCoccion;

    public arrocera(double capacidad, String tiempoCoccion, String numSerie, String modelo, String color, double precio) {
        super(numSerie, modelo, color);
        this.capacidad = capacidad;
        this.tiempoCoccion = tiempoCoccion;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(String tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public void haccerArroz() {
        System.out.println("En la arrocera sale un arroz delicicioso");
        if (tiempoCoccion.equals("Baja")) {
            System.out.println("El arroz sale crudo");

        } else if (tiempoCoccion.equals("Medio")) {
            System.out.println("El arroz sale graneado");

        } else if (tiempoCoccion.equals("Alto")) {
            System.out.println("El arroz sale cocolon");

        }
    }

}
