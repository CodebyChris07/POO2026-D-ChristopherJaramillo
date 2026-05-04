
package repasopruebaparcialpoo;


public class Vendedor {
    private String nombre;
    private int edad;
    private double salarioMinimo;
    private int numAutos;
    private double pagoMensual;

    public Vendedor(String nombre, int edad, double salarioMinimo, int numAutos) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioMinimo = salarioMinimo;
        this.numAutos = numAutos;
        // cuando pones un constructor no es necesario usar los setts pero no esta
        // de mas dejarlos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public int getNumAutos() {
        return numAutos;
    }

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void calcularPagoMensual() {
        pagoMensual = salarioMinimo + (150 * numAutos);
    }
    
    
}
