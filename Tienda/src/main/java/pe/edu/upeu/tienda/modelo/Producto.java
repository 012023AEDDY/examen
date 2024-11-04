package pe.edu.upeu.tienda.modelo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tienda_producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @NotNull(message = "El nombre no puede estar vacío")
    @Size(min = 2, max = 120, message = "El nombre debe tener entre 2 y 120 caracteres")
    @Column(name = "nombre", nullable = false, length = 120)
    private String nombre;
    @Positive(message = "El Precio Unitario debe ser positivo")
    @Column(name = "precio", nullable = false)
    private Double precio;
    @PositiveOrZero(message = "El Precio Unitario Anterior debe ser positivo o cero")
    @Column(name = "precio_anterior", nullable = false)
    private Double precioAnterior;
    @Positive(message = "La utilidad debe ser positiva")
    @Column(name = "utilidad", nullable = false)
    private Double utilidad;
    @Positive(message = "El Stock debe ser positivo o cero")
    @Column(name = "stock", nullable = false)
    private Double stock;
    @PositiveOrZero(message = "El Stock Anterior debe ser positivo o cero")
    @Column(name = "stock_anterior", nullable = false)
    private Double stockAnterior;

    @NotNull(message = "Categoria no puede estar vacío")
    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria",
            nullable = false, foreignKey = @ForeignKey(name = "FK_CATEGORIA_PRODUCTO") )
    private Categoria categoria;

    @NotNull(message = "Marca no puede estar vacío")
    @ManyToOne
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca",
            nullable = false, foreignKey = @ForeignKey(name = "FK_MARCA_PRODUCTO"))
    private Marca marca;

    @NotNull(message = "Talla no puede estar vacío")
    @ManyToOne
    @JoinColumn(name = "id_talla", referencedColumnName = "id_talla",
            nullable = false, foreignKey = @ForeignKey(name = "FK_TALLA_PRODUCTO"))
    private Talla talla;
}
