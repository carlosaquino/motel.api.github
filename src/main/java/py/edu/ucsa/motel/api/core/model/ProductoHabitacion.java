package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the productos_habitaciones database table.
 * 
 */
@Entity
@Table(name="productos_habitaciones")
@NamedQuery(name="ProductoHabitacion.findAll", query="SELECT p FROM ProductoHabitacion p")
public class ProductoHabitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTOS_HABITACIONES_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTOS_HABITACIONES_ID_GENERATOR")
	private Integer id;

	private BigDecimal precio;

	@Column(name="stock_x_hab")
	private BigDecimal stockXHab;

	//bi-directional many-to-one association to Habitacion
	@ManyToOne
	@JoinColumn(name="id_habitacion")
	private Habitacion habitacione;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto producto;

	//bi-directional many-to-one association to UsoHabitacionDet
	@OneToMany(mappedBy="productosHabitacione")
	private List<UsoHabitacionDet> usosHabitacionesDets;

	public ProductoHabitacion() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getStockXHab() {
		return this.stockXHab;
	}

	public void setStockXHab(BigDecimal stockXHab) {
		this.stockXHab = stockXHab;
	}

	public Habitacion getHabitacione() {
		return this.habitacione;
	}

	public void setHabitacione(Habitacion habitacione) {
		this.habitacione = habitacione;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<UsoHabitacionDet> getUsosHabitacionesDets() {
		return this.usosHabitacionesDets;
	}

	public void setUsosHabitacionesDets(List<UsoHabitacionDet> usosHabitacionesDets) {
		this.usosHabitacionesDets = usosHabitacionesDets;
	}

	public UsoHabitacionDet addUsosHabitacionesDet(UsoHabitacionDet usosHabitacionesDet) {
		getUsosHabitacionesDets().add(usosHabitacionesDet);
		usosHabitacionesDet.setProductosHabitacione(this);

		return usosHabitacionesDet;
	}

	public UsoHabitacionDet removeUsosHabitacionesDet(UsoHabitacionDet usosHabitacionesDet) {
		getUsosHabitacionesDets().remove(usosHabitacionesDet);
		usosHabitacionesDet.setProductosHabitacione(null);

		return usosHabitacionesDet;
	}

}