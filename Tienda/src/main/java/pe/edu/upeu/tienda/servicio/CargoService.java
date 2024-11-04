package pe.edu.upeu.tienda.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.tienda.modelo.Cargo;

import pe.edu.upeu.tienda.repositorio.CargoRepository;

import java.util.List;
@Service
public class CargoService {
    @Autowired
    CargoRepository repo;

    public Cargo save(Cargo to) {
        return repo.save(to);
    }

    public List<Cargo> list() {
        return repo.findAll();
    }

    public Cargo update(Cargo to, Long id) {
        try {
            Cargo toe = repo.findById(id).orElse(null);
            if (toe != null) {
                toe.setNombre(to.getNombre());
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

    public Cargo searchById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
