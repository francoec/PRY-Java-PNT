package Productos;

public class Higiene extends Producto {
    private String contenido;

    public Higiene(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + " /// Precio: $" + precio;
    }
}   