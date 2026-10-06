import java.util.ArrayList;
import java.util.Iterator;

public class Carrito<T extends Producto> implements Iterable<T> {

    private ArrayList<T> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public T obtenerProductoMayorPrecio() {

        if (productos.isEmpty()) {
            return null;
        }

        T mayor = productos.get(0);

        for (T producto : productos) {
            if (producto.getPrecio() > mayor.getPrecio()) {
                mayor = producto;
            }
        }

        return mayor;
    }

    public double calcularPrecioTotal() {

        double total = 0;

        for (T producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    public void mostrarProductos() {

        for (T producto : productos) {
            System.out.println(producto);
        }
    }

    // ITERADOR PROPIO
    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            private int posicion = productos.size() - 1;

            @Override
            public boolean hasNext() {
                return posicion >= 0;
            }

            @Override
            public T next() {
                return productos.get(posicion--);
            }
        };
    }
}