package pe.edu.upeu.tienda.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tienda_trabajador_cargo")
public class TrabajadorCargo {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_tabajador", referencedColumnName = "id_tabajador",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TRABAJADOR_TRABAJADORCARGO"))
    private Trabajador trabajador;
    @ManyToOne
    @JoinColumn(name = "id_cargo", referencedColumnName = "id_cargo",
            nullable = false, foreignKey = @ForeignKey(name = "FK_CARGO_TRABAJADORCARGO"))
    private Cargo cargo;
}
