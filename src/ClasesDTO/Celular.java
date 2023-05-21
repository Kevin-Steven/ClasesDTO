package ClasesDTO;

 // @author Kevin Barzola
 
public class Celular {
    private String Nombre;
    private String Marca;
    private String TipoBateria;
    private String TipoPantalla;
    private int Precio;
    private int MpxCamara;

    public String getNombre() {
        return Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public String getTipoBateria() {
        return TipoBateria;
    }

    public String getTipoPantalla() {
        return TipoPantalla;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getMpxCamara() {
        return MpxCamara;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setTipoBateria(String TipoBateria) {
        this.TipoBateria = TipoBateria;
    }

    public void setTipoPantalla(String TipoPantalla) {
        this.TipoPantalla = TipoPantalla;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setMpxCamara(int MpxCamara) {
        this.MpxCamara = MpxCamara;
    }
    
    
}
