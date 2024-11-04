package pe.edu.upeu.tienda.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tienda_cliente")
public class Cliente {
    @Id
    @Column(name = "id_cliente", nullable = false, length = 30)
    private String idCliente;
    @Column(name = "nombres", nullable = false, length = 30)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 30)
    private String apellidos;
    @Column(name = "dni", nullable = false, length = 8)
    private String DNI;

}
