/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddclavedicotomica;

/**
 *
 * @author diego
 */
public class Arbol {
    private Nodo raiz; // Nodo raíz del árbol
    private Nodo nodoActual; // Nodo actual durante la navegación

    // Constructor
    public Arbol() {
        this.raiz = null;
        this.nodoActual = null;
    }

    // Método para cargar la clave dicotómica desde un archivo JSON
    public void cargarDesdeJSON(String rutaArchivo) {
        // Implementación para leer el archivo JSON y construir el árbol
    }

    // Método para mostrar el árbol (usando GraphStream)
    public void mostrarArbol() {
        // Implementación para visualizar el árbol
    }

    // Método para determinar la especie haciendo preguntas al usuario
    public void determinarEspecie() {
        // Implementación para navegar por el árbol y hacer preguntas
    }

    // Método para buscar una especie por nombre (recorriendo el árbol)
    public Especie buscarEspecieEnArbol(String nombre) {
        // Implementación para buscar una especie en el árbol
        return null;
    }
}
