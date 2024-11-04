package pe.edu.upeu.tienda.modelo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tienda_venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;
    @Column(name = "preciobase", nullable = false)
    private Double precioBase;
    @Column(name = "igv", nullable = false)
    private Double igv;
    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto",
            nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCTO_VENTA"))
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente",
            nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTE_VENTA"))
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_tabajador", referencedColumnName = "id_tabajador",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TRABAJADOR_VENTA"))
    private Trabajador trabajador;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;
    @Column(name = "serie", nullable = false, length = 20)
    private String serie;
}
