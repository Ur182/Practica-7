import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Productos.DispositivosElectronicos;
public class TiendaTecnologia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Seleccione el tipo de comprador (VIP/Estudiante/Socio): ");
        String tipoCliente = scanner.nextLine();

        Comprador cliente;
        if (tipoCliente.equalsIgnoreCase("VIP")) {
            cliente = new ClienteVip(nombreCliente);
        } else if (tipoCliente.equalsIgnoreCase("Estudiante")) {
            cliente = new Estudiante(nombreCliente);
        } else tipoCliente.equalsIgnoreCase("Socio"); {
            cliente = new Socio(nombreCliente);
        }
        List<DispositivosElectronicos> catalogo = new ArrayList<>();
        catalogo.add(new DispositivosElectronicos("iPhone 13", 999, 14));
        catalogo.add(new DispositivosElectronicos("Samsung Galaxy S21", 899, 17));
        catalogo.add(new DispositivosElectronicos("Laptop HP", 799, 13));
        catalogo.add(new DispositivosElectronicos("PC Gaming", 1499, 14));
        catalogo.add(new DispositivosElectronicos("Tablet Samsung", 299, 11));
        catalogo.add(new DispositivosElectronicos("Smart TV LG", 599, 14));
        cliente.verCatalogo(catalogo);
            int opc;
            do{
                System.out.println("\n__Menu Tienda Usuario___"); 
                System.out.println("1. Agregar Producto"); 
                System.out.println("2. Ver Carrito"); 
                System.out.println("3. Pagar en caja"); 
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción \n > ");
                opc = scanner.nextInt();
                scanner.nextLine();
                switch (opc) {
                    case 1: 
                        System.out.println("Agregar producto");
                        System.out.print("Ingrese el nombre del producto que desea agregar al carrito: ");
                            String productoSeleccionado = scanner.nextLine();
                            for (DispositivosElectronicos producto : catalogo) {
                                if (producto.getNombre().equalsIgnoreCase(productoSeleccionado)) {
                                    cliente.agregarAlCarrito(producto);
                                }
                            }
                        break; 
                    case 2:
                        System.out.println("Ver Carrito"); 
                        cliente.verCarrito();
                        break; 
                    case 3: 
                    System.out.println("Pagar en caja");
                    //Pagar en caja
                    break; 
                    case 4:
                    System.out.println("Saliendo");
                    break;
                        }
             }while (opc != 4);
}
}
