package SistemaGestionPedidos;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private Date fechaPedido;
    private String estado;
    private String cliente;
    private int mesa;

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

}
