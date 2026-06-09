/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarelectrodomesticos;

/**
 *
 * @author ASUS
 */
public class lavadora extends Electrodomesticos{
    private String capacidad;
    private String cronometro;
    private String tipoLavado;

    public lavadora(String capacidad, String cronometro, String tipoLavado, String numSerie, String modelo, String color, double precio) {
        super(numSerie, modelo, color);
        this.capacidad = capacidad;
        this.cronometro = cronometro;
        this.tipoLavado = tipoLavado;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCronometro() {
        return cronometro;
    }

    public void setCronometro(String cronometro) {
        this.cronometro = cronometro;
    }

    public String getTipoLavado() {
        return tipoLavado;
    }

    public void setTipoLavado(String tipoLavado) {
        this.tipoLavado = tipoLavado;
    }
    
    public String lavar(){
        System.out.println("La lavadora esta comenzando a lavar");
        System.out.println("La lavadora esta comenzando a mojar la ropa");
        remojar();
        enjuagar();
        centrifugar();
        System.out.println("La lavadora termino de lavar");
        
        
    
    }
    
    public void remojar(){
        System.out.println("Comenzando a mojar la ropa");
    
    }
    
    public void enjuagar(){
        System.out.println("La lavadora esta enjuagando");
    
    }
    
    public void centrifugar(){
        System.out.println("La lavadora esta centrifugando");
    
    }
    
}
