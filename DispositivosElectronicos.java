package Productos;

public class DispositivosElectronicos {
        private String nombre;
        private double precio;
        private double pantalla; 
    
        public DispositivosElectronicos(String nombre, double precio, double pantalla) {
            this.nombre = nombre;
            this.precio = precio;
            this.pantalla = pantalla; 
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return this.precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double getPantalla() {
            return this.pantalla;
        }

        public void setPantalla(double pantalla) {
            this.pantalla = pantalla;
        }

}