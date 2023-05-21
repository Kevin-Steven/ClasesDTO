package ClasesDTO;

 // @author Kevin Barzola
 
public class Empleado {
    private String Nombre;
    private String Apellido;
    private String celular;
    private String cedula;
    private int Edad;
    private String Area;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public String getArea() {
        return Area;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    
    

}
