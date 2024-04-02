package SistemaGestionPedidos;

/**
 * Clase que representa un producto en un restaurante.
 * @author [Jose Juan Dos Reis De Conceicao]
 * @version 1.0
 * @since [02/04/2024]
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
