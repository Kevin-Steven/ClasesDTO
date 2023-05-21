package ClasesDTO;

 // @author Kevin Barzola
 
public class Laptop {
    private String Nombre;
    private String TamañoPantalla;
    private int Precio;
    private String Marca;
    private String Procesador;
    private String Almacenamiento;

    public String getNombre() {
        return Nombre;
    }

    public String getTamañoPantalla() {
        return TamañoPantalla;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public String getProcesador() {
        return Procesador;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTamañoPantalla(String TamañoPantalla) {
        this.TamañoPantalla = TamañoPantalla;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }
    
    
}
