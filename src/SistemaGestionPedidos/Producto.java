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

    /**
     * Constructor de la clase Producto.
     * @param nombre El nombre del producto.
     * @param descripcion La descripción del producto.
     * @param precio El precio del producto.
     */
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del producto.
     * @return La descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el precio del producto.
     * @return El precio del producto.
     */

    public double getPrecio() {
        return precio;
    }
}
