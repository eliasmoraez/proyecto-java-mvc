package dao;
import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
