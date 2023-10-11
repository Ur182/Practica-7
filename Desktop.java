package Productos;

public class Desktop extends Computadora{
    public Desktop (String nombre, double precio, double pantalla, String procesador) {
        super(nombre, precio, pantalla, procesador);
    }
    
    public String getProcesador() {
        return this.procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
  

    
}
