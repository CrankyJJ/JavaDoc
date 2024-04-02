package SistemaGestionPedidos;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa un pedido realizado en un restaurante.
 * @author [Jose Juan Dos Reis De Conceicao]
 * @version 1.0
 * @since [02/04/2024]
 */
public class Pedido {
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private Date fechaPedido;
    private String estado;
    private String cliente;
    private int mesa;

    /**
     * Constructor de la clase Pedido.
     * @param numeroPedido El número único del pedido.
     * @param fechaPedido La fecha y hora en que se realizó el pedido.
     * @param cliente El nombre del cliente que realizó el pedido.
     * @param mesa El número de mesa en la que se realizó el pedido.
     */
    public Pedido(int numeroPedido, Date fechaPedido, String cliente, int mesa) {
        this.numeroPedido = numeroPedido;
        this.productos = new ArrayList<>();
        this.fechaPedido = fechaPedido;
        this.estado = "pendiente";
        this.cliente = cliente;
        this.mesa = mesa;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public int getMesa() {
        return mesa;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void marcarComoPreparado() {
        this.estado = "preparado";
    }

    public void marcarComoEntregado() {
        this.estado = "entregado";
    }

    public String obtenerEstado() {
        return estado;
    }

}
