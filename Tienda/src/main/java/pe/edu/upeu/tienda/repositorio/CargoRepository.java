package pe.edu.upeu.tienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.tienda.modelo.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
