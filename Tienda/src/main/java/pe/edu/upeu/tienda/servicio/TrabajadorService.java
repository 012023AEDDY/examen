package pe.edu.upeu.tienda.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.tienda.modelo.Trabajador;
import pe.edu.upeu.tienda.repositorio.TrabajadorRepository;
import java.util.List;

@Service
public class TrabajadorService {
    @Autowired
   TrabajadorRepository repo;

    public Trabajador save(Trabajador to) {
        return repo.save(to);
    }

    public List<Trabajador> list() {
        return repo.findAll();
    }

    public Trabajador update(Trabajador to, Long id) {
        try {
            Trabajador toe = repo.findById(id).orElse(null);
            if (toe != null) {
                toe.setClave(to.getClave());
                return repo.save(toe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Trabajador searchById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Trabajador loginTrabajador(String usuario, String contrasena) {
        return repo.loginTrabajador(usuario, contrasena);
    }
}
