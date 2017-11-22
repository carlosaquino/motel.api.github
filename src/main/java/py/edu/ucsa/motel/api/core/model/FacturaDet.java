package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the facturas_det database table.
 * 
 */
@Entity
@Table(name="facturas_det")
@NamedQuery(name="FacturaDet.findAll", query="SELECT f FROM FacturaDet f")
public class FacturaDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FACTURAS_DET_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FACTURAS_DET_ID_GENERATOR")
	private Integer id;

	private BigDecimal cantidad;

	private BigDecimal precio;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="id_factura")
	private Factura factura;

	//bi-directional many-to-one association to UsoHabitacionDet
	@ManyToOne
	@JoinColumn(name="id_uso_habitacion_det")
	private UsoHabitacionDet usosHabitacionesDet;

	public FacturaDet() {
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

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public UsoHabitacionDet getUsosHabitacionesDet() {
		return this.usosHabitacionesDet;
	}

	public void setUsosHabitacionesDet(UsoHabitacionDet usosHabitacionesDet) {
		this.usosHabitacionesDet = usosHabitacionesDet;
	}

}