package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the usos_habitaciones database table.
 * 
 */
@Entity
@Table(name="usos_habitaciones")
@NamedQuery(name="UsoHabitacion.findAll", query="SELECT u FROM UsoHabitacion u")
public class UsoHabitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USOS_HABITACIONES_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USOS_HABITACIONES_ID_GENERATOR")
	private Integer id;

	@Column(name="cant_horas")
	private BigDecimal cantHoras;

	@Column(name="cant_minutos")
	private BigDecimal cantMinutos;

	@Column(name="fecha_entrada")
	private Timestamp fechaEntrada;

	@Column(name="fecha_salida")
	private Timestamp fechaSalida;

	//bi-directional many-to-one association to Factura
//	@OneToMany(mappedBy="usosHabitacione")
//	private List<Factura> facturas;

	//bi-directional many-to-one association to Habitacion
	@ManyToOne
	@JoinColumn(name="id_habitacion")
	private Habitacion habitacione;

	//bi-directional many-to-one association to UsoHabitacionDet
	@OneToMany(mappedBy="usosHabitacione")
	private List<UsoHabitacionDet> usosHabitacionesDets;

	public UsoHabitacion() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCantHoras() {
		return this.cantHoras;
	}

	public void setCantHoras(BigDecimal cantHoras) {
		this.cantHoras = cantHoras;
	}

	public BigDecimal getCantMinutos() {
		return this.cantMinutos;
	}

	public void setCantMinutos(BigDecimal cantMinutos) {
		this.cantMinutos = cantMinutos;
	}

	public Timestamp getFechaEntrada() {
		return this.fechaEntrada;
	}

	public void setFechaEntrada(Timestamp fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Timestamp getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Timestamp fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

//	public List<Factura> getFacturas() {
//		return this.facturas;
//	}
//
//	public void setFacturas(List<Factura> facturas) {
//		this.facturas = facturas;
//	}
//
//	public Factura addFactura(Factura factura) {
//		getFacturas().add(factura);
//		factura.setUsosHabitacione(this);
//
//		return factura;
//	}
//
//	public Factura removeFactura(Factura factura) {
//		getFacturas().remove(factura);
//		factura.setUsosHabitacione(null);
//
//		return factura;
//	}

	public Habitacion getHabitacione() {
		return this.habitacione;
	}

	public void setHabitacione(Habitacion habitacione) {
		this.habitacione = habitacione;
	}

	public List<UsoHabitacionDet> getUsosHabitacionesDets() {
		return this.usosHabitacionesDets;
	}

	public void setUsosHabitacionesDets(List<UsoHabitacionDet> usosHabitacionesDets) {
		this.usosHabitacionesDets = usosHabitacionesDets;
	}

	public UsoHabitacionDet addUsosHabitacionesDet(UsoHabitacionDet usosHabitacionesDet) {
		getUsosHabitacionesDets().add(usosHabitacionesDet);
		usosHabitacionesDet.setUsosHabitacione(this);

		return usosHabitacionesDet;
	}

	public UsoHabitacionDet removeUsosHabitacionesDet(UsoHabitacionDet usosHabitacionesDet) {
		getUsosHabitacionesDets().remove(usosHabitacionesDet);
		usosHabitacionesDet.setUsosHabitacione(null);

		return usosHabitacionesDet;
	}

}