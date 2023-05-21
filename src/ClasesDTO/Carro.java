package ClasesDTO;

 // @author Kevin Barzola
 
public class Carro {
    private String Nombre;
    private String Serie;
    private int Tamaño;
    private String color;
    private String Motor;
    private int NumeroPuertas;

    public String getNombre() {
        return Nombre;
    }

    public String getSerie() {
        return Serie;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getMotor() {
        return Motor;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    
    

}
