package modelo;

import java.util.ArrayList;

public class Carrera {

    private int codCarrera;
    private String nombreCarrera;
    private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

    public Carrera(int codCarrera, String nombreCarrera) {
        this.codCarrera = codCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public ArrayList<Asignatura> agregarAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
        return this.asignaturas;
    }

    public int getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(int codCarrera) {
        this.codCarrera = codCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "codCarrera='" + codCarrera + '\'' +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                ", asignaturas='" + asignaturas + '\'' +
                '}';
    }
}
