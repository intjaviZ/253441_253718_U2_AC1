import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        almacen.agregarProducto(new Producto("Sabritas", 20.0));
        almacen.agregarProducto(new Producto("Galletas", 22.0));
        almacen.agregarProducto(new Producto("Refresco", 24.0));

        new Menu(almacen).iniciar();
    }
}