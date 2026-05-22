/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaDoblementeEnlazada {

    NodoDoble cabeza;
    NodoDoble fin;

    // Insertar al final
    public void insertar(int dato) {

        NodoDoble nuevo = new NodoDoble(dato);

        if (cabeza == null) {

            cabeza = nuevo;
            fin = nuevo;

            return;
        }

        fin.siguiente = nuevo;

        nuevo.anterior = fin;

        fin = nuevo;
    }

    // Eliminar nodo
    public void eliminar(int dato) {

        if (cabeza == null) {

            System.out.println("Lista vacía");
            return;
        }

        NodoDoble actual = cabeza;

        while (actual != null &&
               actual.dato != dato) {

            actual = actual.siguiente;
        }

        if (actual == null) {

            System.out.println("Dato no encontrado");
            return;
        }

        // Eliminar cabeza
        if (actual == cabeza) {

            cabeza = cabeza.siguiente;

            if (cabeza != null) {
                cabeza.anterior = null;
            }
        }

        // Eliminar fin
        else if (actual == fin) {

            fin = fin.anterior;

            fin.siguiente = null;
        }

        // Eliminar intermedio
        else {

            actual.anterior.siguiente =
                    actual.siguiente;

            actual.siguiente.anterior =
                    actual.anterior;
        }
    }

    // Recorrido hacia adelante
    public void mostrarAdelante() {

        NodoDoble actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " ");

            actual = actual.siguiente;
        }

        System.out.println();
    }

    // Recorrido hacia atrás
    public void mostrarAtras() {

        NodoDoble actual = fin;

        while (actual != null) {

            System.out.print(actual.dato + " ");

            actual = actual.anterior;
        }

        System.out.println();
    }
}