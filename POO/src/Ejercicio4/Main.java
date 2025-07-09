package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        ArrayList<Cita> citas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Agendar cita");
            System.out.println("4. Ver citas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    System.out.println("Tipo (1-Familiar, 2-Amigo, 3-Compañero): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Parentesco: ");
                        String par = sc.nextLine();
                        contactos.add(new Familiar(nombre, tel, par));
                    } else if (tipo == 2) {
                        System.out.print("Apodo: ");
                        String apodo = sc.nextLine();
                        contactos.add(new Amigo(nombre, tel, apodo));
                    } else if (tipo == 3) {
                        System.out.print("Empresa: ");
                        String empresa = sc.nextLine();
                        contactos.add(new Companero(nombre, tel, empresa));
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- CONTACTOS ---");
                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        contactos.get(i).mostrarInfo();
                    }
                    break;

                case 3:
                    if (contactos.isEmpty()) {
                        System.out.println("Primero debe agregar al menos un contacto.");
                        break;
                    }
                    System.out.println("Seleccione contacto:");
                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.println((i + 1) + ". " + contactos.get(i).getNombre());
                    }
                    int idx = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idx >= 0 && idx < contactos.size()) {
                        System.out.print("Fecha (ej: 2025-07-10): ");
                        String fecha = sc.nextLine();
                        System.out.print("Descripción: ");
                        String desc = sc.nextLine();
                        citas.add(new Cita(contactos.get(idx), fecha, desc));
                        System.out.println("Cita agendada.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- CITAS ---");
                    for (Cita c : citas) {
                        c.mostrarCita();
                        System.out.println();
                    }
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}

