/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaDoble {

    private NodoDoble cabeza;
    private NodoDoble fin;

    // =========================================
    // INSERTAR AL FINAL
    // =========================================
    public void insertar(int dato) {

        NodoDoble nuevo = new NodoDoble(dato);

        if (cabeza == null) {

            cabeza = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;
            nuevo.anterior = fin;

            fin = nuevo;
        }

        System.out.println("Elemento insertado.");
    }

    // =========================================
    // ELIMINAR
    // =========================================
    public void eliminar(int dato) {

        if (cabeza == null) {

            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble actual = cabeza;

        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual == null) {

            System.out.println("Elemento no encontrado.");
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

            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }

        System.out.println("Elemento eliminado.");
    }

    // =========================================
    // RECORRER HACIA ADELANTE
    // =========================================
    public void mostrarAdelante() {

        if (cabeza == null) {

            System.out.println("Lista vacía.");
            return;
        }

        NodoDoble aux = cabeza;

        System.out.print("Adelante: ");

        while (aux != null) {

            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }

        System.out.println("null");
    }

    // =========================================
    // RECORRER HACIA ATRAS
    // =========================================
    public void mostrarAtras() {

        if (fin == null) {

            System.out.println("Lista vacía.");
            return;
        }

        NodoDoble aux = fin;

        System.out.print("Atrás: ");

        while (aux != null) {

            System.out.print(aux.dato + " <-> ");
            aux = aux.anterior;
        }

        System.out.println("null");
    }
}