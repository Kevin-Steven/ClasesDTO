package ClasesDTO;

 // @author Kevin Barzola
 
public class Cliente {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Cedula;
    private int RUC;
    private String Celular;

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

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

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

    public int getRUC() {
        return RUC;
    }

    public String getCelular() {
        return Celular;
    }
    
    
}
