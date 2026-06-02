/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenfinalpractica;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GestorMatricula {

    private ArrayList<Estudiante> listaEstudiantes; // tener en cuenta esto <> sirve para el for

    public GestorMatricula() {
        this.listaEstudiantes = new ArrayList<>(); // importante
    }

    public void registrarEstudiante(Estudiante e) {

        boolean bandera = false;
        
        for (Estudiante alumnoGuardado : listaEstudiantes) {
            if (e.getCedula().equals(alumnoGuardado.getCedula())) {
                bandera = true;
                break;

            }

        }
        if (bandera == true) {
            System.out.println("El Alumno ya existe");

        } else {
            listaEstudiantes.add(e);
            System.out.println("Estudiante registrado en el sistema");

        }

    }

    public void matricularMateria(String cedulaBuscada, Asignatura nuevaMateria) {
        boolean bandera = false;
        Estudiante estudianteEncontrado = null;

        // for(la clase nombre : la arrayList de aca)
        for (Estudiante alumno : listaEstudiantes) {
            if (alumno.getCedula().equals(cedulaBuscada)) {
                bandera = true;
                estudianteEncontrado = alumno;
                break;
            }

        }
        // if(estudianteEncontrado == null)// para no usar una bandera
        if (bandera == false) {
            System.out.println("Alumno no encontrado en el sistema");
            return; // cortamos todo
        }

        for (Asignatura materiaGuardada : estudianteEncontrado.getMateriasTomadas()) {
            if (materiaGuardada.getCodigoMateria().equals(nuevaMateria.getCodigoMateria())) {
                System.out.println("Error el estudiante ya esta matriculado en esa materia");
                return;

            }
        }
        int totalCreditos = 0;
        for (Asignatura materiaGuardada : estudianteEncontrado.getMateriasTomadas()) {
            totalCreditos += materiaGuardada.getCreditos();
        }
        if (totalCreditos + nuevaMateria.getCreditos() > 16) {
            System.out.println("El limite de creditos es de 16");
            return;

        }
        double costoMateria = nuevaMateria.getCreditos() * 25;
        if (estudianteEncontrado.getPresupuesto() < costoMateria) {
            System.out.println("dinero Insuficiente");
            return;
        }
        double nuevoSaldo = estudianteEncontrado.getPresupuesto() - costoMateria;
        estudianteEncontrado.setPresupuesto(nuevoSaldo);
        estudianteEncontrado.getMateriasTomadas().add(nuevaMateria);
        System.out.println("Exito" + nuevaMateria.getNombre() + " Registrada con exito");

    }

    public void retirarMateria(String cedulaBuscada, String codigoBuscado) {
        boolean bandera = false;
        Estudiante estudianteEncontrado = null;

        // for(la clase nombre : la arrayList de aca)
        for (Estudiante alumno : listaEstudiantes) {
            if (alumno.getCedula().equals(cedulaBuscada)) {
                bandera = true;
                estudianteEncontrado = alumno;
                break;
            }

        }
        // if(estudianteEncontrado == null)// para no usar una bandera
        if (bandera == false) {
            System.out.println("Alumno no encontrado en el sistema");
            return; // cortamos todo
        }
        Asignatura eliminar = null;

        for (Asignatura materiaGuardada : estudianteEncontrado.getMateriasTomadas()) {
            if (materiaGuardada.getCodigoMateria().equals(codigoBuscado)) {
                eliminar = materiaGuardada;
                break;

            }
        }
        if(eliminar == null){
            System.out.println("El estudiante no tiene matriculada la materia");
            return;
        
        }
        double dineroDevuelto =  eliminar.getCreditos()* 25;
        double nuevoSueldo = estudianteEncontrado.getPresupuesto() + dineroDevuelto;
        estudianteEncontrado.setPresupuesto(nuevoSueldo);
        estudianteEncontrado.getMateriasTomadas().remove(eliminar); // remove es para eliminar
        System.out.println("Materia eliminada con exito");

    }
}
