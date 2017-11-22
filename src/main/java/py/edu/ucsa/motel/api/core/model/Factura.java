package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the facturas database table.
 * 
 */
@Entity
@Table(name="facturas")
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FACTURAS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FACTURAS_ID_GENERATOR")
	private Integer id;

	private Timestamp fecha;

	@Column(name="total_exentas")
	private BigDecimal totalExentas;

	@Column(name="total_factura")
	private BigDecimal totalFactura;

	@Column(name="total_gravadas")
	private BigDecimal totalGravadas;

	@Column(name="total_iva_10")
	private BigDecimal totalIva10;

	//bi-directional many-to-one association to Cliente
//	@ManyToOne
//	@JoinColumn(name="id_cliente")
//	private Cliente cliente;

	@Column(name="id_cliente")
	private Integer idCliente;
	
	//bi-directional many-to-one association to DominioDet
//	@ManyToOne
//	@JoinColumn(name="id_estado")
//	private DominioDet dominiosDet;

	@Column(name="id_estado")
	private Integer idEstado;
	
	//bi-directional many-to-one association to UsoHabitacion
//	@ManyToOne
//	@JoinColumn(name="id_usos_habitacion")
//	private UsoHabitacion usosHabitacione;
	
	@Column(name="id_usos_habitacion")
	private Integer idUsoHabitacion;

	//bi-directional many-to-one association to FacturaDet
//	@OneToMany(mappedBy="factura")
//	private List<FacturaDet> facturasDets;

	public Factura() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalExentas() {
		return this.totalExentas;
	}

	public void setTotalExentas(BigDecimal totalExentas) {
		this.totalExentas = totalExentas;
	}

	public BigDecimal getTotalFactura() {
		return this.totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public BigDecimal getTotalGravadas() {
		return this.totalGravadas;
	}

	public void setTotalGravadas(BigDecimal totalGravadas) {
		this.totalGravadas = totalGravadas;
	}

	public BigDecimal getTotalIva10() {
		return this.totalIva10;
	}

	public void setTotalIva10(BigDecimal totalIva10) {
		this.totalIva10 = totalIva10;
	}


//	public Cliente getCliente() {
//		return this.cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
//
//	public DominioDet getDominiosDet() {
//		return this.dominiosDet;
//	}
//
//	public void setDominiosDet(DominioDet dominiosDet) {
//		this.dominiosDet = dominiosDet;
//	}
//
//	public UsoHabitacion getUsosHabitacione() {
//		return this.usosHabitacione;
//	}

//	public void setUsosHabitacione(UsoHabitacion usosHabitacione) {
//		this.usosHabitacione = usosHabitacione;
//	}
//
//	public List<FacturaDet> getFacturasDets() {
//		return this.facturasDets;
//	}
//
//	public void setFacturasDets(List<FacturaDet> facturasDets) {
//		this.facturasDets = facturasDets;
//	}

//	public FacturaDet addFacturasDet(FacturaDet facturasDet) {
//		getFacturasDets().add(facturasDet);
//		facturasDet.setFactura(this);
//
//		return facturasDet;
//	}
//
//	public FacturaDet removeFacturasDet(FacturaDet facturasDet) {
//		getFacturasDets().remove(facturasDet);
//		facturasDet.setFactura(null);
//
//		return facturasDet;
//	}

	
	public Integer getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public Integer getIdEstado() {
		return idEstado;
	}
	
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	
	public Integer getIdUsoHabitacion() {
		return idUsoHabitacion;
	}
	
	public void setIdUsoHabitacion(Integer idUsoHabitacion) {
		this.idUsoHabitacion = idUsoHabitacion;
	}
	
}