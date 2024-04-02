package SistemaGestionPedidos;

import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Producto hamburguesa = new Producto("Hamburguesa", "Una deliciosa hamburguesa con carne y vegetales", 5.99);
        Producto refresco = new Producto("Refresco", "Refresco de cola frío", 1.50);
        Producto helado = new Producto("Helado", "Helado de vainilla con sirope de chocolate", 2.99);


        Pedido pedido1 = new Pedido(1, new Date(), "Juan", 2);

    }
}
