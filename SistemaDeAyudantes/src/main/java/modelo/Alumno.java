package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Alumno {

    private String nombres;
    private String apellidos;
    private String rut;
    private String matricula;
    private Date fecha_nacimiento;
    private int puntosAsistencia;
    private ArrayList<Date> horarioAlumno = new ArrayList<Date>();
    private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

    public Alumno(String nombres, String apellidos, String rut, String matricula, Date fecha_nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.matricula = matricula;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Date> agregarHorario(Date hora){
        horarioAlumno.add(hora);
        return this.horarioAlumno;
    }

    public ArrayList<Asignatura> agregarAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
        return asignaturas;
    }

    public Ayudante postularAyudante(boolean resultado){
        Ayudante nuevo = null;
        if (resultado == true){
            nuevo = new Ayudante(getNombres(),getApellidos(),getRut(),getMatricula(),getFecha_nacimiento());
            return nuevo;
        }else {
            return nuevo;
        }
    }

    public Tutoria buscarTutoria(String asignatura){
        Tutoria resultado = null;
        System.out.println("BUSCAR TUTORIA:");
        for(int i = 0; i<asignaturas.size(); i++){
            if(asignaturas.get(i).getNombre() == asignatura){
                resultado = asignaturas.get(i).getListaAyudantes().get(i).getTutoria();
            }
        }
        return resultado;
    }

    public Ayudante buscarAyudante(String asignatura){
        System.out.println("BUSCAR AYUDANTES:");
        Ayudante resultado = null;
        for(int i = 0; i<asignaturas.size(); i++){
            if(asignaturas.get(i).getNombre() == asignatura){
                resultado = asignaturas.get(i).getListaAyudantes().get(i);
            }
        }
        return resultado;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getPuntosAsistencia() {
        return puntosAsistencia;
    }

    public void setPuntosAsistencia(int puntosAsistencia) {
        this.puntosAsistencia = puntosAsistencia;
    }

    public ArrayList<Date> getHorarioAlumno() {
        return horarioAlumno;
    }

    public void setHorarioAlumno(ArrayList<Date> horarioAlumno) {
        this.horarioAlumno = horarioAlumno;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
