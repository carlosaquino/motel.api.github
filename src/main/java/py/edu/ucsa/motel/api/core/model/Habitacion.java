package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the habitaciones database table.
 * 
 */
@Entity
@Table(name="habitaciones")
@NamedQuery(name="Habitacion.findAll", query="SELECT h FROM Habitacion h")
public class Habitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HABITACIONES_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HABITACIONES_ID_GENERATOR")
	private Integer id;

	private String nombre;

	private BigDecimal numero;

	//bi-directional many-to-one association to DominioDet
	@ManyToOne
	@JoinColumn(name="id_estado")
	private DominioDet dominiosDet1;

	//bi-directional many-to-one association to DominioDet
	@ManyToOne
	@JoinColumn(name="id_tipo_habitacion")
	private DominioDet dominiosDet2;

	//bi-directional many-to-one association to HabitacionDet
	@OneToMany(mappedBy="habitacione")
	private List<HabitacionDet> habitacionesDets;

	//bi-directional many-to-one association to ProductoHabitacion
	@OneToMany(mappedBy="habitacione")
	private List<ProductoHabitacion> productosHabitaciones;

	//bi-directional many-to-one association to UsoHabitacion
	@OneToMany(mappedBy="habitacione")
	private List<UsoHabitacion> usosHabitaciones;

	public Habitacion() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getNumero() {
		return this.numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	public DominioDet getDominiosDet1() {
		return this.dominiosDet1;
	}

	public void setDominiosDet1(DominioDet dominiosDet1) {
		this.dominiosDet1 = dominiosDet1;
	}

	public DominioDet getDominiosDet2() {
		return this.dominiosDet2;
	}

	public void setDominiosDet2(DominioDet dominiosDet2) {
		this.dominiosDet2 = dominiosDet2;
	}

	public List<HabitacionDet> getHabitacionesDets() {
		return this.habitacionesDets;
	}

	public void setHabitacionesDets(List<HabitacionDet> habitacionesDets) {
		this.habitacionesDets = habitacionesDets;
	}

	public HabitacionDet addHabitacionesDet(HabitacionDet habitacionesDet) {
		getHabitacionesDets().add(habitacionesDet);
		habitacionesDet.setHabitacione(this);

		return habitacionesDet;
	}

	public HabitacionDet removeHabitacionesDet(HabitacionDet habitacionesDet) {
		getHabitacionesDets().remove(habitacionesDet);
		habitacionesDet.setHabitacione(null);

		return habitacionesDet;
	}

	public List<ProductoHabitacion> getProductosHabitaciones() {
		return this.productosHabitaciones;
	}

	public void setProductosHabitaciones(List<ProductoHabitacion> productosHabitaciones) {
		this.productosHabitaciones = productosHabitaciones;
	}

	public ProductoHabitacion addProductosHabitacione(ProductoHabitacion productosHabitacione) {
		getProductosHabitaciones().add(productosHabitacione);
		productosHabitacione.setHabitacione(this);

		return productosHabitacione;
	}

	public ProductoHabitacion removeProductosHabitacione(ProductoHabitacion productosHabitacione) {
		getProductosHabitaciones().remove(productosHabitacione);
		productosHabitacione.setHabitacione(null);

		return productosHabitacione;
	}

	public List<UsoHabitacion> getUsosHabitaciones() {
		return this.usosHabitaciones;
	}

	public void setUsosHabitaciones(List<UsoHabitacion> usosHabitaciones) {
		this.usosHabitaciones = usosHabitaciones;
	}

	public UsoHabitacion addUsosHabitacione(UsoHabitacion usosHabitacione) {
		getUsosHabitaciones().add(usosHabitacione);
		usosHabitacione.setHabitacione(this);

		return usosHabitacione;
	}

	public UsoHabitacion removeUsosHabitacione(UsoHabitacion usosHabitacione) {
		getUsosHabitaciones().remove(usosHabitacione);
		usosHabitacione.setHabitacione(null);

		return usosHabitacione;
	}

}