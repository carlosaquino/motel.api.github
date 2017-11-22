package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the usos_habitaciones_det database table.
 * 
 */
@Entity
@Table(name="usos_habitaciones_det")
@NamedQuery(name="UsoHabitacionDet.findAll", query="SELECT u FROM UsoHabitacionDet u")
public class UsoHabitacionDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USOS_HABITACIONES_DET_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USOS_HABITACIONES_DET_ID_GENERATOR")
	private Integer id;

	private BigDecimal cantidad;

	private Boolean cortesia;

	private BigDecimal precio;

	private BigDecimal total;

	//bi-directional many-to-one association to FacturaDet
	@OneToMany(mappedBy="usosHabitacionesDet")
	private List<FacturaDet> facturasDets;

	//bi-directional many-to-one association to ProductoHabitacion
	@ManyToOne
	@JoinColumn(name="id_productos_habitaciones")
	private ProductoHabitacion productosHabitacione;

	//bi-directional many-to-one association to UsoHabitacion
	@ManyToOne
	@JoinColumn(name="id_uso_habitacion")
	private UsoHabitacion usosHabitacione;

	public UsoHabitacionDet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getCortesia() {
		return this.cortesia;
	}

	public void setCortesia(Boolean cortesia) {
		this.cortesia = cortesia;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<FacturaDet> getFacturasDets() {
		return this.facturasDets;
	}

	public void setFacturasDets(List<FacturaDet> facturasDets) {
		this.facturasDets = facturasDets;
	}

	public FacturaDet addFacturasDet(FacturaDet facturasDet) {
		getFacturasDets().add(facturasDet);
		facturasDet.setUsosHabitacionesDet(this);

		return facturasDet;
	}

	public FacturaDet removeFacturasDet(FacturaDet facturasDet) {
		getFacturasDets().remove(facturasDet);
		facturasDet.setUsosHabitacionesDet(null);

		return facturasDet;
	}

	public ProductoHabitacion getProductosHabitacione() {
		return this.productosHabitacione;
	}

	public void setProductosHabitacione(ProductoHabitacion productosHabitacione) {
		this.productosHabitacione = productosHabitacione;
	}

	public UsoHabitacion getUsosHabitacione() {
		return this.usosHabitacione;
	}

	public void setUsosHabitacione(UsoHabitacion usosHabitacione) {
		this.usosHabitacione = usosHabitacione;
	}

}