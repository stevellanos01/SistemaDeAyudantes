package modelo;

import java.util.ArrayList;

public class Facultad {

    private String nombre;
    private int id;
    private ArrayList<Carrera> carreras = new ArrayList<Carrera>();

    public Facultad(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public ArrayList<Carrera> agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
        return this.carreras;
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

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString(){
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", listaCarreras='" + carreras + '\'' +
                '}';
    }
}
