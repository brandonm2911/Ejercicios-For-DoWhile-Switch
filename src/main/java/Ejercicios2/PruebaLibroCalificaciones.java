package Ejercicios2;

import Ejercicios2.LibroCalificaciones;

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
        "CS101 Introduccion a la programacion en java");
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.introducirCalif();
        miLibroCalificaciones.mostrarReporteCalif();
    }
}
