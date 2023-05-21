package ClasesDTO;

 // @author Kevin Barzola
 
public class Profesor {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Cedula;
    private String Profesion;
    private String Celular;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getProfesion() {
        return Profesion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    

}
