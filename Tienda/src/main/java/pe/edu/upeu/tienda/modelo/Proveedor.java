package pe.edu.upeu.tienda.modelo;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tienda_proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;
    @Column(name = "nombres", nullable = false,length =20 )
    private String nombres;
    @Column(name = "apellidos", nullable = false,length =20 )
    private String apellidos;
    @Column(name = "dni", nullable = false,length =8 )
    private String DNI;
    @Column(name = "calular", nullable = false,length =9 )
    private String celular;
    @Column(name = "direccion", nullable = false,length =30)
    private String direcion;
    @Column(name = "gmail",nullable = false,length =100)
    private String gmail;
}
