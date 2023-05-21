package ClasesDTO;

 // @author Kevin Barzola
 
public class Moto {
    private String Nombre;
    private String Color;
    private String Serie;
    private String motor;
    private int Precio;
    private String TipoEscape;

    public String getNombre() {
        return Nombre;
    }

    public String getColor() {
        return Color;
    }

    public String getSerie() {
        return Serie;
    }

    public String getMotor() {
        return motor;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getTipoEscape() {
        return TipoEscape;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setTipoEscape(String TipoEscape) {
        this.TipoEscape = TipoEscape;
    }
    
    

}
