package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Asignatura {

    private  String nombre;
    private  int id;
    private ArrayList<Date> horario = new ArrayList<Date>();
    private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    private ArrayList<Ayudante> listaAyudantes = new ArrayList<Ayudante>();

    public Asignatura(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public ArrayList<Alumno> agregarAlumno(Alumno alumno){
        this.listaAlumnos.add(alumno);
        return this.listaAlumnos;
    }

    public ArrayList<Ayudante> agregarAyudante(Ayudante ayudante){
        this.listaAyudantes.add(ayudante);
        return this.listaAyudantes;
    }

    public void agregarAsignaturaAlumno(Asignatura asignatura){
        for(int i = 0; i<listaAlumnos.size(); i++){
            listaAlumnos.get(i).agregarAsignatura(asignatura);
        }
    }

    public ArrayList<Date> agregarHora(Date hora){
        horario.add(hora);
        for(int i = 0; i<listaAlumnos.size(); i++){
            getListaAlumnos().get(i).agregarHorario(hora);
        }
        return this.horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Date> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Date> horario) {
        this.horario = horario;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Ayudante> getListaAyudantes() {
        return listaAyudantes;
    }

    public void setListaAyudantes(ArrayList<Ayudante> listaAyudantes) {
        this.listaAyudantes = listaAyudantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", horario='" + horario + '\'' +
                ", listaAlumnos='" + listaAlumnos + '\'' +
                ", listaAyudantes='" + listaAyudantes + '\'' +
                '}';
    }
}
