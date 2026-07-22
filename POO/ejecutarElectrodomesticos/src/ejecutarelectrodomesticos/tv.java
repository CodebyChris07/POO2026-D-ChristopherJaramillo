/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarelectrodomesticos;

/**
 *
 * @author ASUS
 */
public class tv extends Electrodomesticos {

    private int tamanio;
    private String tipoPanel;

    public tv(int tamanio, String tipoPanel, String numSerie, String modelo, String color) {
        super(numSerie, modelo, color);
        this.tamanio = tamanio;
        this.tipoPanel = tipoPanel;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipoPanel() {
        return tipoPanel;
    }

    public void setTipoPanel(String tipoPanel) {
        this.tipoPanel = tipoPanel;
    }

    public void cambiarCanal() {
        System.out.println("El tv cambia de canal usando control remoto con las "
                + "flechas arriba y abajo");

    }

    public void subirVolumen() {
        System.out.println("El tv aumenta de volumen usando control remoto con las "
                + "flechas hacia la derecha");

    }

    public double calcularTiempoPelicula() {
        // metodo para calcular el tiempo de ver peliculas en la semana
        double sumaPeli = 0;
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("El lunes sumaste 2 horas en la pelicula de Avatar");
                sumaPeli += 2;

            } else if (i == 1) {
                System.out.println("El Martes sumaste 3.3 horas en la pelicula de Toy Story");
                sumaPeli += 3.3;

            } else if (i == 2) {
                System.out.println("El Miercoles sumaste 2.5 horas de x pelicula");
                sumaPeli += 2.5;

            } else if (i == 3) {
                System.out.println("El Jueves sumaste 3 horas en la pelicula de Madagascar");
                sumaPeli += 3;

            } else if (i == 4) {
                System.out.println("El Viernes no sumaste horas en peliculas");
                sumaPeli += 0;

            } else if (i == 5) {
                System.out.println("El Sabado sumaste 5.7 horas en la pelicula de Avengers");
                sumaPeli += 5.7;

            } else if (i == 6) {
                System.out.println("El Domingo sumaste 3 horas en la pelicula de Proyecto Hail Mary");
                sumaPeli += 3;

            }

        }
        return sumaPeli;

    }

}
