package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Tutoria {

    private String tema;
    private int id;
    private Ayudante ayudante;
    private Asignatura asignatura;
    private ArrayList<Date> horario = new ArrayList<Date>();

    public Tutoria (String tema, int id, Ayudante ayudante, Asignatura asignatura) {
        this.tema = tema;
        this.id = id;
        this.ayudante = ayudante;
        this.asignatura = asignatura;
    }

    public Tutoria(String tema, int id, Ayudante ayudante, Asignatura asignatura, ArrayList<Date> horario) {
        this.tema = tema;
        this.id = id;
        this.ayudante = ayudante;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    public ArrayList<Date> agregarHora(Date hora){
        horario.add(hora);
        ayudante.agregarHorario(hora);
        return this.horario;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ayudante getAyudante() {
        return ayudante;
    }

    public void setAyudante(Ayudante ayudante) {
        this.ayudante = ayudante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Date> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Date> horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Tutoria{" +
                "tema='" + tema + '\'' +
                ", id='" + id + '\'' +
                ", ayudante='" + ayudante + '\'' +
                ", horario tutoria='" + horario + '\'' +
                '}';
    }
}
