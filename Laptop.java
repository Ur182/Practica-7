package Productos;

public class Laptop extends Computadora{
    public Laptop(String nombre, double precio, double pantalla, String procesador) {
        super(nombre, precio, pantalla, procesador);
    }

    public String getProcesador() {
        return this.procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
  

    
}
