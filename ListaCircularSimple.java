/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaCircularSimple {

    NodoCircular ultimo;

    // Insertar nodo
    public void insertar(int dato) {

        NodoCircular nuevo =
                new NodoCircular(dato);

        // Lista vacía
        if (ultimo == null) {

            ultimo = nuevo;

            ultimo.siguiente = ultimo;

            return;
        }

        nuevo.siguiente = ultimo.siguiente;

        ultimo.siguiente = nuevo;

        ultimo = nuevo;
    }

    // Eliminar nodo
    public void eliminar(int dato) {

        if (ultimo == null) {

            System.out.println("Lista vacía");
            return;
        }

        NodoCircular actual = ultimo.siguiente;
        NodoCircular anterior = ultimo;

        do {

            if (actual.dato == dato) {

                // Un solo nodo
                if (actual == ultimo &&
                    actual == ultimo.siguiente) {

                    ultimo = null;
                }

                // Eliminar último
                else if (actual == ultimo) {

                    anterior.siguiente =
                            actual.siguiente;

                    ultimo = anterior;
                }

                // Eliminar normal
                else {

                    anterior.siguiente =
                            actual.siguiente;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;

        } while (actual != ultimo.siguiente);

        System.out.println("Dato no encontrado");
    }

    // Mostrar lista
    public void mostrar() {

        if (ultimo == null) {

            System.out.println("Lista vacía");
            return;
        }

        NodoCircular actual =
                ultimo.siguiente;

        do {

            System.out.print(actual.dato + " ");

            actual = actual.siguiente;

        } while (actual != ultimo.siguiente);

        System.out.println();
    }
}