public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregarProducto(
                new Producto("Laptop", 2500000)
        );

        carrito.agregarProducto(
                new Producto("Mouse", 80000)
        );

        carrito.agregarProducto(
                new Producto("Teclado", 150000)
        );

        carrito.agregarProducto(
                new Producto("Audifonos", 300000)
        );

        System.out.println("PRODUCTOS DEL CARRITO:");
        carrito.mostrarProductos();

        System.out.println("\nPRODUCTO DE MAYOR PRECIO:");
        System.out.println(
                carrito.obtenerProductoMayorPrecio()
        );

        System.out.println("\nPRECIO TOTAL:");
        System.out.println(
                "$" + carrito.calcularPrecioTotal()
        );

        // RECORRIDO PROPIO
        System.out.println("\nRECORRIDO PROPIO DEL CARRITO:");
        for (Producto producto : carrito) {
            System.out.println(producto);
        }
    }
}