package principal;

import modelo.*;

import java.util.Date;

/**
 * @author Esteban Llanos
 */
public class Main {

    public static void main(String [] args){

        Universidad u = new Universidad("UFRO", "12345678", "F.Salazar",200); // se crea la universidad
        Facultad facu = new Facultad("Ingenieria y Ciencias" , 4);  // se crea la facultad
        Carrera carrera = new Carrera(1, "Ingenieria Informatica"); // se crea la carrera
        Asignatura asignatura = new Asignatura("Programacion", 133); // se crea la asignatura

        u.agregarFacultad(facu);  // se agrega la facultad a la universidad
        facu.agregarCarrera(carrera);  // se agrega la carrera a la facultad
        carrera.agregarAsignatura(asignatura);  // se agrega asignatura a la carrera

        Alumno alumno1 = new Alumno("Esteban","Llanos", "19231805k","19231805k20",new Date(96,2,8));
        Alumno alumno2 = new Alumno("Andres", "Sanchez", "123456789", "12345678921", new Date(97,5,20));
        Alumno alumno3 = new Alumno("Juan", "Alvarez", "123098191", "12309819121", new Date(97,8,2));
        Alumno alumno4 = new Alumno("Felipe","Gonzalez", "987654321k","987654321k20",new Date(95,20,13));

        Ayudante ayudante1 = alumno4.postularAyudante(true);  // un alumno postula para ser ayudante

        asignatura.agregarAlumno(alumno1);              //se agrega alumno a la asignatura
        asignatura.agregarAlumno(alumno2);              //se agrega alumno a la asignatura
        asignatura.agregarAlumno(alumno3);              //se agrega alumno a la asignatura
        asignatura.agregarAyudante(ayudante1);          //se agrega ayudante a la asignatura
        asignatura.agregarAsignaturaAlumno(asignatura); //se agrega la asignatura a todos los alumnos

        asignatura.agregarHora(new Date(121,9,28 ,11,30 ));              // se agrega una hora de clases
        ayudante1.crearTutoria("Repaso conceptos de herencia", 2, ayudante1, asignatura);           // el ayudante crea una tutoria
        ayudante1.asignarHoraTutoria(new Date(121,9,28 ,14,30 ));


        //System.out.println(u.toString());
        //System.out.println(facu.toString());
        //System.out.println(carrera.toString());
        System.out.println(asignatura.toString());


        System.out.println(alumno1.buscarTutoria("Programacion"));
        System.out.println(alumno1.buscarAyudante("Programacion"));

        System.out.println(ayudante1.getTutoria());
        System.out.println(alumno1.getAsignaturas().get(0).getNombre());
    }
}
