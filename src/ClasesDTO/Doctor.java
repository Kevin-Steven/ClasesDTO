package ClasesDTO;

 // @author Kevin Barzola
 
public class Doctor {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Cedula;
    private String Pais;
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

    public String getPais() {
        return Pais;
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

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    

}
