package modelo;

import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private String telefono;
    private String direccion;
    private int id;
    private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

    public Universidad(String nombre, String telefono, String direccion, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;
    }

    public ArrayList<Facultad> agregarFacultad(Facultad facultad){
        this.facultades.add(facultad);
        return this.facultades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", listaFacultades='" + facultades + '\'' +
                '}';
    }

}
