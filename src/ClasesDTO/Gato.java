package ClasesDTO;

 // @author Kevin Barzola
 
public class Gato {
    private String Nombre;
    private int Edad;
    private String TipoPelaje;
    private String Raza;
    private int Tamaño;
    private String Procedencia;

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getTipoPelaje() {
        return TipoPelaje;
    }

    public String getRaza() {
        return Raza;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public String getProcedencia() {
        return Procedencia;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTipoPelaje(String TipoPelaje) {
        this.TipoPelaje = TipoPelaje;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }
    
    

}
