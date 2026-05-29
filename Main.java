/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaDoble listaDoble = new ListaDoble();
        ListaCircular listaCircular = new ListaCircular();

        int opcion;
        int dato;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Insertar en Lista Doble");
            System.out.println("2. Eliminar en Lista Doble");
            System.out.println("3. Mostrar Lista Doble");
            System.out.println("4. Insertar en Lista Circular");
            System.out.println("5. Eliminar en Lista Circular");
            System.out.println("6. Mostrar Lista Circular");
            System.out.println("7. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                // =====================================
                // LISTA DOBLE
                // =====================================

                case 1:

                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();

                    listaDoble.insertar(dato);

                    break;

                case 2:

                    System.out.print("Ingrese dato a eliminar: ");
                    dato = sc.nextInt();

                    listaDoble.eliminar(dato);

                    break;

                case 3:

                    listaDoble.mostrarAdelante();
                    listaDoble.mostrarAtras();

                    break;

                // =====================================
                // LISTA CIRCULAR
                // =====================================

                case 4:

                    System.out.print("Ingrese dato: ");
                    dato = sc.nextInt();

                    listaCircular.insertar(dato);

                    break;

                case 5:

                    System.out.print("Ingrese dato a eliminar: ");
                    dato = sc.nextInt();

                    listaCircular.eliminar(dato);

                    break;

                case 6:

                    listaCircular.mostrar();

                    break;

                case 7:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);
    }
}