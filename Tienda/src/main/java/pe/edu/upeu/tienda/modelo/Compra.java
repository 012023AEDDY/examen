package pe.edu.upeu.tienda.modelo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tienda_compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;
    @Column(name = "precio_base", nullable = false)
    private Double precioBase;
    @Column(name = "igv", nullable = false)
    private Double igv;
    @Column(name = "preciototal", nullable = false)
    private Double precioTotal;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_comp", nullable = false)
    private LocalDateTime fechaCompra;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor",
            nullable = false, foreignKey = @ForeignKey(name = "FK_PROVEEDOR_COMPRA"))
    private Proveedor proveedor;
    @ManyToOne
    @JoinColumn(name = "id_trabajador", referencedColumnName = "id_trabajador",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TRABAJADOR_COMPRA"))
    private  Trabajador trabajador;
    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto",
            nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCTO_COMPRA"))
    private  Producto producto;




}
