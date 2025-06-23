package servicio;
import dao.UsuarioDAO;
import modelo.Usuario;
import java.util.List;
public class UsuarioService {
    private UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public void registrarUsuario(int id, String nombre) {
        Usuario usuario = new Usuario(id, nombre);
        usuarioDAO.guardar(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioDAO.obtenerTodos();
    }

    public Usuario buscarUsuarioPorId(int id) {
        return usuarioDAO.buscarPorId(id);
    }
}
