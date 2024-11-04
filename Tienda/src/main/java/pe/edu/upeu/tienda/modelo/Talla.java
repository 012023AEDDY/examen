package pe.edu.upeu.tienda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tienda_talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_talla")
    private Long idTalla;
    @Column(name = "nombre_talla", nullable = false, length = 60)
    private String nombreTalla;
}



