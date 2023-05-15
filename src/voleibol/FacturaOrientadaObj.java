package voleibol;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class FacturaOrientadaObj {

    static Scanner scanner = new Scanner(System.in);
    static Producto producto;
    static double cambio;
    static double contadorclientes;
    static double iva;
    static double pago;
    static double precio;
    static int cantidad;
    static String nombreproducto;
    static String respuestacli;
    static String respuestaprod;
    static double subtotal;
    static double total;
    static double totalventas;
    static double totalventasdia;
    static double subtotalventa = 0;

    public static void generarTotal() {

        while (contadorclientes < 3) {
            System.out.println("---------------------------------------");
            contadorclientes = contadorclientes + 1;
            double ventacliente = 0;
            respuestaprod = "si";
            System.out.println("Tomar la compra del cliente " + contadorclientes + "  ");
            do {
                System.out.println("Ingrese el nombre del Producto");
                Producto producto = new Producto(nombreproducto, precio, cantidad);
                nombreproducto = scanner.nextLine();
                producto.setNombreProducto(nombreproducto);
                System.out.println("Ingrese el precio del producto");
                precio = scanner.nextDouble();
                producto.setPrecio(precio);
                System.out.println("Ingrese la cantidad de productos");
                cantidad = scanner.nextInt();
                producto.setCantidad(cantidad);
                subtotal = producto.getPrecio() * producto.getCantidad();
                subtotalventa = subtotalventa + subtotal;
                iva = subtotalventa * 0.19;
                total = subtotalventa + iva;
                ventacliente = total;
                System.out.println("------ CONTINUAR -------");
                System.out.println("¿Desea capturar otro producto? (si/no)");
                scanner.nextLine(); // Consumir el salto de línea pendiente
                respuestaprod = scanner.nextLine();
            } while (!respuestaprod.equals("no"));
            System.out.println("CLIENTE " + contadorclientes + "     ");
            System.out.println("Subtotal: $ " + subtotalventa);
            System.out.println("IVA : $" + iva);
            System.out.println("Total: $ " + ventacliente);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("   ");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("   ");
            System.out.println("Ingrese el monto de pago del cliente " + contadorclientes);
            System.out.println("Debe ser mayor o igual al total a pagar ($ " + ventacliente + ")");
            pago = scanner.nextDouble();
            cambio = pago - ventacliente;
            System.out.println("----------------------------------------------");
            System.out.println("El cambio que se le dará al cliente " + contadorclientes + " es de $ " + cambio);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("  ");
            System.out.println("  ");
            totalventasdia = totalventasdia + ventacliente;

        }
    }
}
