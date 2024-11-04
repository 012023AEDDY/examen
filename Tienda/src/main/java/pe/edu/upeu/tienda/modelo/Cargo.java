package pe.edu.upeu.tienda.modelo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tienda_cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_crago", nullable = false)
    private Long idCargo;
    @Size(max = 40)
    @Column(length = 40)
    private String nombre;
    @Size(max = 6)
    @Column(length = 6)
    private String codigo;
}
