package ClasesDTO;

 // @author Kevin Barzola
 
public class Estudiante {
    private String Nombre;
    private String Apellido;
    private float Nota;
    private String Cedula;
    private int Edad; 
    private String Carrera;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public float getNota() {
        return Nota;
    }

    public String getCedula() {
        return Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNota(float Nota) {
        this.Nota = Nota;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
}
