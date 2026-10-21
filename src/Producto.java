
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

    public String getNombre() { return nombre; }
    public Double getPrecio() { return precio; }

    @Override
    public String toString() {
        return String.format("%-20s $%,10.2f", nombre, precio);
    }
}
