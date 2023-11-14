package Productos;

public class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double litros, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}
