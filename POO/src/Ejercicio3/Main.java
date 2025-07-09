package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Productos disponibles
        Mueble silla = new Mueble("Silla de Madera", 40.0, 10, "Madera");
        Electrodomestico refri = new Electrodomestico("Refrigeradora", 350.0, 5, 600);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Vender producto");
            System.out.println("3. Devolver producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- PRODUCTOS ---");
                    System.out.print("1. ");
                    silla.mostrarInfo();
                    System.out.print("2. ");
                    refri.mostrarInfo();
                    break;

                case 2:
                    System.out.println("\n--- VENTA ---");
                    System.out.print("Seleccione producto (1-Silla, 2-Refri): ");
                    int ventaProd = sc.nextInt();
                    System.out.print("Cantidad a vender: ");
                    int cantidadVenta = sc.nextInt();

                    if (ventaProd == 1) {
                        silla.vender(cantidadVenta);
                    } else if (ventaProd == 2) {
                        refri.vender(cantidadVenta);
                    } else {
                        System.out.println("Producto no válido.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- DEVOLUCIÓN ---");
                    System.out.print("Seleccione producto (1-Silla, 2-Refri): ");
                    int devolProd = sc.nextInt();
                    System.out.print("Cantidad a devolver: ");
                    int cantidadDevol = sc.nextInt();

                    if (devolProd == 1) {
                        silla.devolver(cantidadDevol);
                    } else if (devolProd == 2) {
                        refri.devolver(cantidadDevol);
                    } else {
                        System.out.println("Producto no válido.");
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}

