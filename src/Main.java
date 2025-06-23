import controlador.UsuarioController;
import fabrica.AppFactory;

public class Main {
    public static void main(String[] args) {
        UsuarioController controller = AppFactory.crearControlador();
        controller.iniciar();
    }
}
