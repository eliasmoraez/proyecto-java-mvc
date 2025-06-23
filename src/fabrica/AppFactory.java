package fabrica;

import dao.UsuarioDAO;
import servicio.UsuarioService;
import controlador.UsuarioController;

public class AppFactory {

    public static UsuarioController crearControlador() {
        UsuarioDAO dao = new UsuarioDAO();
        UsuarioService service = new UsuarioService(dao);
        return new UsuarioController(service);
    }
}
