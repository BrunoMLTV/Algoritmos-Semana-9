/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaCircular {

    private NodoCircular ultimo;

    // =========================================
    // INSERTAR
    // =========================================
    public void insertar(int dato) {

        NodoCircular nuevo = new NodoCircular(dato);

        // Lista vacía
        if (ultimo == null) {

            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        }

        else {

            nuevo.siguiente = ultimo.siguiente;

            ultimo.siguiente = nuevo;

            ultimo = nuevo;
        }

        System.out.println("Elemento insertado.");
    }

    // =========================================
    // ELIMINAR
    // =========================================
    public void eliminar(int dato) {

        if (ultimo == null) {

            System.out.println("Lista vacía.");
            return;
        }

        NodoCircular actual = ultimo.siguiente;
        NodoCircular anterior = ultimo;

        do {

            if (actual.dato == dato) {

                // Solo un nodo
                if (actual == ultimo &&
                    actual.siguiente == ultimo) {

                    ultimo = null;
                }

                // Eliminar último
                else if (actual == ultimo) {

                    anterior.siguiente = actual.siguiente;
                    ultimo = anterior;
                }

                // Eliminar primero
                else {

                    anterior.siguiente = actual.siguiente;
                }

                System.out.println("Elemento eliminado.");
                return;
            }

            anterior = actual;
            actual = actual.siguiente;

        } while (actual != ultimo.siguiente);

        System.out.println("Elemento no encontrado.");
    }

    // =========================================
    // MOSTRAR
    // =========================================
    public void mostrar() {

        if (ultimo == null) {

            System.out.println("Lista vacía.");
            return;
        }

        NodoCircular aux = ultimo.siguiente;

        System.out.print("Lista Circular: ");

        do {

            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;

        } while (aux != ultimo.siguiente);

        System.out.println("(inicio)");
    }
}