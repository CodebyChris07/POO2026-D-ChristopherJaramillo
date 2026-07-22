/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconexionclases.controlador;

import ejemploconexionclases.modelo.*;

public class controladorCarro{

    private carro car;

    public controladorCarro() {
        car = new carro();
    }
   public void hola(){
       car.calcularPrecio(0);
}
    

}
