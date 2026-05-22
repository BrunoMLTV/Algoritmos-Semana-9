/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class NodoDoble {

    int dato;

    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(int dato) {

        this.dato = dato;

        this.siguiente = null;
        this.anterior = null;
    }
}