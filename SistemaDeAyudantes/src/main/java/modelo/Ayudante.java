package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Ayudante extends Alumno{

    private Tutoria tutoria;
    private ArrayList<Date> horarioAyudante = new ArrayList<Date>();

    public Ayudante(String nombres, String apellidos, String rut, String matricula, Date fecha_nacimiento) {
        super(nombres, apellidos, rut, matricula, fecha_nacimiento);
    }

    public Tutoria crearTutoria(String tema, int id, Ayudante ayudante, Asignatura asignatura){
        this.tutoria = new Tutoria(tema, id, ayudante, asignatura);
        return this.tutoria;
    }

    public ArrayList<Date> agregarHorario(Date hora){
        horarioAyudante.add(hora);
        return this.horarioAyudante;
    }

    public void asignarHoraTutoria(Date hora){
        this.tutoria.agregarHora(hora);
    }

    public Tutoria getTutoria() {
        return tutoria;
    }

    public void setTutoria(Tutoria tutoria) {
        this.tutoria = tutoria;
    }

    public ArrayList<Date> getHorarioAyudante() {
        return horarioAyudante;
    }

    public void setHorarioAyudante(ArrayList<Date> horarioAyudante) {
        this.horarioAyudante = horarioAyudante;
    }

    @Override
    public String toString() {
        return "Ayudante{" +
                super.toString() +
                '}';
    }

}
