package Productos;

public class Producto implements Comparable<Producto> {
    protected String nombre;
    protected int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        int precioEntero = (int) this.precio;
        return "Nombre: " + this.nombre + " /// Precio: $" + precioEntero;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.precio);
    }

    public String getNombre() {
        return this.nombre;
    }
}
