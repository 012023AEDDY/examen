package pe.edu.upeu.tienda.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tienda_trabajador")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajador")
    private Long idTrabajdor;
    @Column(name = "nombres", nullable = false, length =10)
    private String nombres;
    @Column(name="apellido_paterno", nullable = false, length =10)
    private String apellidoPaterno;
    @Column(name="apellido_materno", nullable = false, length =10)
    private String apellidoMaterno;
    @Column(name = "numero_celular", nullable = false, length =9)
    private String celular;
    @Column(name = "dni", nullable = false, length =8)
    private String DNI;
    @Column(name = "usuario", nullable = false,unique = true, length =20)
    private String usuario;
    @Column(name= "contraseña", nullable = false, length =30)
    private String contrasena;

    @JoinColumn(name = "id_cargo", referencedColumnName = "id_cargo")
    @ManyToOne(optional = false)
    private Cargo idCargo;

}
