package repasopruebaparcialpoo;

import java.util.Scanner;

public class RepasoPruebaParcialPOO {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // declarar variables para guardar datos

        String n;
        double salario;
        int edad, autos;
        boolean opcion = true;
        String op;
        // caso base - 1 vendedor 

        do {
            // pedir datos por teclado
            System.out.println("-----------------------------------------");
            System.out.println("Ingrese los siguientes datos:");
            System.out.println("Nombre del vendedor:");
            n = entrada.nextLine();
            System.out.println("Edad del vendedor:");
            edad = entrada.nextInt();
            System.out.println("Salario Minimo $:");
            salario = entrada.nextDouble();
            System.out.println("Cantidad de autos vendidos");
            autos = entrada.nextInt();

            // crear el objeto
            Vendedor ven = new Vendedor(n, edad, salario, autos);
            /*
        Vendedor ven = new Vendedor();
        ven.setNombre(n);
        ven.setEdad(edad);
        ven.setNumAutos(autos);
        ven.setSalarioMinimo(salario);
             */

            // invocar al metodo para calcular pago mensual
            ven.calcularPagoMensual();

            // imprimir resultados
            System.out.println("-----------------------------------");
            System.out.println("El vendedor " + ven.getNombre() + " vendio," + ven.getNumAutos()
                    + " autos en este mes y su pago mensual es " + ven.getPagoMensual());
            entrada.nextLine(); // limpieza de buffer
            System.out.println("Quiere seguir calculando el salario del vendedor, presione S o N");
            op = entrada.toString();
            if (op.equals("N")) {
                opcion = false;

            }
        } while (opcion);
    }

}
