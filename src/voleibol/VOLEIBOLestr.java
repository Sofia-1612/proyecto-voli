import java.util.Scanner;

public class VOLEIBOLestr {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double cambio;
        double cantidad;
        double contadorclientes;
        double iva;
        String nombreproducto;
        double pago;
        double precio;
        String respuestacli;
        String respuestaprod;
        double subtotal;
        double subtotalventa = 0; // Inicializar la variable subtotalventa con 0
        double total;
        double totalventas;
        double totalventasdia;
        totalventasdia = 0;
        contadorclientes = 0;
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::: MENU DE IMPLEMENTOS ::::::::::::::::::::::::::::::: ");
        System.out.println("- RODILLERAS VOLEIBOL: $50.000");
        System.out.println("- CAMISAS VOLEIBOL: $30.000");
        System.out.println("- ZAPATILLAS VOLEIBOL: $280.000");
        System.out.println("- PANTALON O SHORT DE LICRA: $35.000");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        while (contadorclientes < 3) {
            System.out.println("---------------------------------------");
            contadorclientes = contadorclientes + 1;
            double ventacliente = 0;
            respuestaprod = "si";
            System.out.println("Tomar la compra del cliente " + contadorclientes + "  ");
            do {
                System.out.println("Ingrese el nombre del Producto");
                nombreproducto = scanner.nextLine();
                System.out.println("Ingrese el precio del producto");
                precio = scanner.nextDouble();
                System.out.println("Ingrese la cantidad de productos");
                cantidad = scanner.nextDouble();
                subtotal = precio * cantidad;
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
            subtotalventa = 0;
        }
        System.out.println("El total de las ventas en el día fue de: $ " + totalventasdia);
        scanner.close();
    }
}