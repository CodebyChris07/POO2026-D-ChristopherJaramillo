/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutarhumano;

/**
 *
 * @author ASUS
 */
public class EjecutarHumano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un corazon
        Corazon c1 = new Corazon();
        Corazon c2 = new Corazon();

        // Crear objeto humano
        Humano h1 = new Humano();
        Humano h2 = new Humano();
        
        // asignar valores a corazon
        c1.setTamanio("20 x 10");
        c1.setColor("Rojo");
        c1.setIdCorazon("001");
        c1.setPeso(2);
        c1.setEstado("Sano");
        
        c2.setTamanio("30 x 10");
        c2.setColor("Azul");
        c2.setIdCorazon("002");
        c2.setPeso(4);
        c2.setEstado("No sano");
        
        // asignar valores a humano
        h1.setCedula("110605");
        h1.setNombres("Juan Garcia");
        h1.setEdad(30);
        h1.setC(c1);
        
        h2.setCedula("0101245");
        h2.setNombres("Luis Miguel");
        h2.setEdad(20);
        h2.setC(c2);
        
        
        // imprimir resultados del tamano del corazon
        System.out.println("El tamano del corazon de " + h1.getNombres() + "es = " 
                + h1.getC().getTamanio());
        System.out.println("El tamano de corazon de " + h2.getNombres() + "es = " + h2.getC().getTamanio());
        
        
    }
    
}
