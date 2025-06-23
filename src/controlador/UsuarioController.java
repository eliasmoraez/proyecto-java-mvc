package controlador;

import servicio.UsuarioService;
import modelo.Usuario;
import java.util.List;
import java.util.Scanner;

public class UsuarioController {
    private UsuarioService usuarioService;
    private Scanner scanner;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> crearUsuario();
                case 2 -> listarUsuarios();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Crear usuario");
        System.out.println("2. Listar usuarios");
        System.out.println("3. Salir");
        System.out.print("Elegí una opción: ");
    }

    private void crearUsuario() {
        System.out.print("ID del usuario: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        System.out.print("Nombre del usuario: ");
        String nombre = scanner.nextLine();

        usuarioService.registrarUsuario(id, nombre);
        System.out.println("Usuario creado con éxito.");
    }

    private void listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios cargados.");
        } else {
            System.out.println("\nLista de usuarios:");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
        }
    }
}
