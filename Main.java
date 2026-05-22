/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Main {

    public static void main(String[] args) {

        // =====================================
        // LISTA DOBLEMENTE ENLAZADA
        // =====================================
        System.out.println(
                "===== LISTA DOBLE =====");

        ListaDoblementeEnlazada listaDoble =
                new ListaDoblementeEnlazada();

        listaDoble.insertar(10);
        listaDoble.insertar(20);
        listaDoble.insertar(30);
        listaDoble.insertar(40);

        System.out.println(
                "Recorrido hacia adelante:");

        listaDoble.mostrarAdelante();

        System.out.println(
                "Recorrido hacia atrás:");

        listaDoble.mostrarAtras();

        System.out.println(
                "Eliminar 20");

        listaDoble.eliminar(20);

        listaDoble.mostrarAdelante();


        // =====================================
        // LISTA CIRCULAR SIMPLE
        // =====================================
        System.out.println(
                "\n===== LISTA CIRCULAR =====");

        ListaCircularSimple listaCircular =
                new ListaCircularSimple();

        listaCircular.insertar(1);
        listaCircular.insertar(2);
        listaCircular.insertar(3);
        listaCircular.insertar(4);

        System.out.println("Lista circular:");

        listaCircular.mostrar();

        System.out.println("Eliminar 3");

        listaCircular.eliminar(3);

        listaCircular.mostrar();
    }
}