package Productos;


public class Alimento extends Producto {

    private String unidadVenta;

    public Alimento(String nombre, int precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Unidad de venta: " + unidadVenta;
    }
}
