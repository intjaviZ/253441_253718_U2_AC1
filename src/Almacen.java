import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Almacen {
    private final LinkedList<Producto> listaProductos;

    public Almacen() {
        this.listaProductos = new LinkedList<>();
    }


    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public List<Producto> ordenarProductos() {
        List<Producto> listaOrdenada = new LinkedList<>(this.listaProductos);
        listaOrdenada.sort(null);
        return listaOrdenada;
    }

    public Producto buscarProducto(Producto objetivo) {
        List<Producto> ordenada = new ArrayList<>(ordenarProductos());

        int inicio = 0;
        int fin = ordenada.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = ordenada.get(medio).compareTo(objetivo);

            if (comparacion == 0) {
                return ordenada.get(medio);
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null;
    }

    public void visualizarListaProductos() {
        imprimirLista(listaProductos);
    }

    public void visualizarListaOrdenada() {
        imprimirLista(ordenarProductos());
    }

    private void imprimirLista(List<Producto> lista) {
        if (lista.isEmpty()) {
            System.out.println("El almacén no tiene productos.");
            return;
        }
        System.out.println("========== PRODUCTOS ==========");
        System.out.printf("%-4s %-20s %11s%n", "#", "Nombre", "Precio");
        System.out.println("-------------------------------");
        int i = 1;
        for (Producto p : lista) {
            System.out.printf("%-4d %s%n", i++, p);
        }
        System.out.println("===============================");
    }
}
