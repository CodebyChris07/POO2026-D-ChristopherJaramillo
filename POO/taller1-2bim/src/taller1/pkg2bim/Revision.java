/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.pkg2bim;

/**
 *
 * @author ASUS
 */
public class Revision extends Trabajo {
public Revision(String descripcion) {
        super(descripcion);
        this.costeMaterial = 0; 
    }

   
    public void intentarAumentarMaterial(double cantidad) {
        System.out.println("Operación no permitida: Las revisiones no tienen coste de material.");
    }

   
    public double calcularPrecioRevision() {
        return (horas * 30) + 20; 
    }
}


    
    

