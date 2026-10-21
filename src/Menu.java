import java.util.Scanner;

public class Menu {
    private final Almacen almacen;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(Almacen almacen) {
        this.almacen = almacen;
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> crearProducto();
                case 2 -> almacen.visualizarListaProductos();
                case 3 -> almacen.visualizarListaOrdenada();
                case 4 -> buscarProducto();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void mostrarOpciones() {
        System.out.println("\n===== ALMACÉN =====");
        System.out.println("1. Crear producto");
        System.out.println("2. Ver lista de productos");
        System.out.println("3. Ver lista ordenada por precio");
        System.out.println("4. Buscar producto por precio");
        System.out.println("0. Salir");
    }

    private void crearProducto() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();
        double precio = leerDouble("Precio: ");

        almacen.agregarProducto(new Producto(nombre, precio));
        System.out.println("Producto agregado.");
    }

    private void buscarProducto() {
        double precio = leerDouble("Precio a buscar: ");
        Producto encontrado = almacen.buscarProducto(new Producto("", precio));

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró ningún producto con ese precio.");
        }
    }

    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número entero válido.");
            }
        }
    }

    private double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido (usa punto decimal).");
            }
        }
    }
}
