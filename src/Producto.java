
public class Producto implements Comparable<Producto> {
    private final String nombre;
    private final Double precio;


    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.precio.compareTo(otroProducto.precio);
    }
}
