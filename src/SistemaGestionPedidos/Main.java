package SistemaGestionPedidos;

import java.util.Date;
/**
 * Clase que representa un producto en un restaurante.
 * @author [Jose Juan Dos Reis De Conceicao]
 * @version 1.0
 * @since [02/04/2024]
 */
public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa", "Una deliciosa hamburguesa con carne y vegetales", 5.99);
        Producto refresco = new Producto("Refresco", "Refresco de cola frío", 1.50);
        Producto helado = new Producto("Helado", "Helado de vainilla con sirope de chocolate", 2.99);


        Pedido pedido1 = new Pedido(1, new Date(), "Juan", 2);

        pedido1.agregarProducto(hamburguesa);
        pedido1.agregarProducto(refresco);
        pedido1.agregarProducto(helado);

        System.out.println("Pedido " + pedido1.getNumeroPedido() + " - Mesa: " + pedido1.getMesa());
        System.out.println("Fecha: " + pedido1.getFechaPedido());
        System.out.println("Cliente: " + pedido1.getCliente());
        System.out.println("Estado: " + pedido1.obtenerEstado());
        System.out.println("------------------------------------");
        System.out.println("Productos:");


        for (Producto producto : pedido1.getProductos()) {
            System.out.println("- " + producto.getNombre() + ": €" + producto.getPrecio());
        }
    }


}
