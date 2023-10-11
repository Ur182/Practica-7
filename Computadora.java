package Productos;

public class Computadora extends DispositivosElectronicos{
    
    public String procesador; 

    public Computadora(String nombre, double precio, double pantalla, String procesador) {
        super(nombre, precio, pantalla);
        this.procesador = procesador; 
    }

    public String getProcesador() {
        return this.procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
  
}
