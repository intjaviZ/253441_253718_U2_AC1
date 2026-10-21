import java.util.LinkedList;
import java.util.List;

public class Almacen {
    private LinkedList<Producto> listaProductos;
    private Producto objetoProducto;


    public Almacen(LinkedList<Producto> listaProductos, Producto objetoProducto) {
        this.listaProductos = listaProductos;
        this.objetoProducto = objetoProducto;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public List<Producto> ordenarProductos() {
        return listaProductos.
    }
}
