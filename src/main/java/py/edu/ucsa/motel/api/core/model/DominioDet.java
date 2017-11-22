package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the dominios_det database table.
 * 
 */
@Entity
@Table(name="dominios_det")
@NamedQuery(name="DominioDet.findAll", query="SELECT d FROM DominioDet d")
public class DominioDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOMINIOS_DET_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOMINIOS_DET_ID_GENERATOR")
	private Integer id;

	private String codigo;

	private String descripcion;

	private String estado;

	//bi-directional many-to-one association to Cliente
//	@OneToMany(mappedBy="dominiosDet")
//	private List<Cliente> clientes;

	//bi-directional many-to-one association to Dominio
//	@ManyToOne
//	@JoinColumn(name="id_dominio")
//	private Dominio dominio;
	
	@Column(name="id_dominio")
	private Integer idDominio;

	//bi-directional many-to-one association to DominioDet
//	@ManyToOne
//	@JoinColumn(name="id_padre")
//	private DominioDet dominiosDet;

	@Column(name="id_padre")
	private Integer idPadre;
	
	//bi-directional many-to-one association to DominioDet
//	@OneToMany(mappedBy="dominiosDet")
//	private List<DominioDet> dominiosDets;

	//bi-directional many-to-one association to Factura
//	@OneToMany(mappedBy="dominiosDet")
//	private List<Factura> facturas;

	//bi-directional many-to-one association to Habitacion
//	@OneToMany(mappedBy="dominiosDet1")
//	private List<Habitacion> habitaciones1;

	//bi-directional many-to-one association to Habitacion
//	@OneToMany(mappedBy="dominiosDet2")
//	private List<Habitacion> habitaciones2;

	//bi-directional many-to-one association to HabitacionDet
//	@OneToMany(mappedBy="dominiosDet")
//	private List<HabitacionDet> habitacionesDets;

	//bi-directional many-to-one association to Pago
//	@OneToMany(mappedBy="dominiosDet")
//	private List<Pago> pagos;

	//bi-directional many-to-one association to Producto
//	@OneToMany(mappedBy="dominiosDet")
//	private List<Producto> productos;

	public DominioDet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

//	public List<Cliente> getClientes() {
//		return this.clientes;
//	}
//
//	public void setClientes(List<Cliente> clientes) {
//		this.clientes = clientes;
//	}

//	public Cliente addCliente(Cliente cliente) {
//		getClientes().add(cliente);
//		cliente.setDominiosDet(this);
//
//		return cliente;
//	}
//
//	public Cliente removeCliente(Cliente cliente) {
//		getClientes().remove(cliente);
//		cliente.setDominiosDet(null);
//
//		return cliente;
//	}

//	public Dominio getDominio() {
//		return this.dominio;
//	}
//
//	public void setDominio(Dominio dominio) {
//		this.dominio = dominio;
//	}
//
//	public DominioDet getDominiosDet() {
//		return this.dominiosDet;
//	}
//
//	public void setDominiosDet(DominioDet dominiosDet) {
//		this.dominiosDet = dominiosDet;
//	}

	public Integer getIdDominio() {
		return idDominio;
	}

	public void setIdDominio(Integer idDominio) {
		this.idDominio = idDominio;
	}

	public Integer getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

//	public List<DominioDet> getDominiosDets() {
//		return this.dominiosDets;
//	}
//
//	public void setDominiosDets(List<DominioDet> dominiosDets) {
//		this.dominiosDets = dominiosDets;
//	}

//	public DominioDet addDominiosDet(DominioDet dominiosDet) {
//		getDominiosDets().add(dominiosDet);
//		dominiosDet.setDominiosDet(this);
//
//		return dominiosDet;
//	}
//
//	public DominioDet removeDominiosDet(DominioDet dominiosDet) {
//		getDominiosDets().remove(dominiosDet);
//		dominiosDet.setDominiosDet(null);
//
//		return dominiosDet;
//	}

//	public List<Factura> getFacturas() {
//		return this.facturas;
//	}
//
//	public void setFacturas(List<Factura> facturas) {
//		this.facturas = facturas;
//	}

//	public Factura addFactura(Factura factura) {
//		getFacturas().add(factura);
//		factura.setDominiosDet(this);
//
//		return factura;
//	}
//
//	public Factura removeFactura(Factura factura) {
//		getFacturas().remove(factura);
//		factura.setDominiosDet(null);
//
//		return factura;
//	}
//
//	public List<Habitacion> getHabitaciones1() {
//		return this.habitaciones1;
//	}
//
//	public void setHabitaciones1(List<Habitacion> habitaciones1) {
//		this.habitaciones1 = habitaciones1;
//	}
//
//	public Habitacion addHabitaciones1(Habitacion habitaciones1) {
//		getHabitaciones1().add(habitaciones1);
//		habitaciones1.setDominiosDet1(this);
//
//		return habitaciones1;
//	}
//
//	public Habitacion removeHabitaciones1(Habitacion habitaciones1) {
//		getHabitaciones1().remove(habitaciones1);
//		habitaciones1.setDominiosDet1(null);
//
//		return habitaciones1;
//	}
//
//	public List<Habitacion> getHabitaciones2() {
//		return this.habitaciones2;
//	}
//
//	public void setHabitaciones2(List<Habitacion> habitaciones2) {
//		this.habitaciones2 = habitaciones2;
//	}

//	public Habitacion addHabitaciones2(Habitacion habitaciones2) {
//		getHabitaciones2().add(habitaciones2);
//		habitaciones2.setDominiosDet2(this);
//
//		return habitaciones2;
//	}
//
//	public Habitacion removeHabitaciones2(Habitacion habitaciones2) {
//		getHabitaciones2().remove(habitaciones2);
//		habitaciones2.setDominiosDet2(null);
//
//		return habitaciones2;
//	}
//
//	public List<HabitacionDet> getHabitacionesDets() {
//		return this.habitacionesDets;
//	}
//
//	public void setHabitacionesDets(List<HabitacionDet> habitacionesDets) {
//		this.habitacionesDets = habitacionesDets;
//	}

//	public HabitacionDet addHabitacionesDet(HabitacionDet habitacionesDet) {
//		getHabitacionesDets().add(habitacionesDet);
//		habitacionesDet.setDominiosDet(this);
//
//		return habitacionesDet;
//	}
//
//	public HabitacionDet removeHabitacionesDet(HabitacionDet habitacionesDet) {
//		getHabitacionesDets().remove(habitacionesDet);
//		habitacionesDet.setDominiosDet(null);
//
//		return habitacionesDet;
//	}

//	public List<Pago> getPagos() {
//		return this.pagos;
//	}
//
//	public void setPagos(List<Pago> pagos) {
//		this.pagos = pagos;
//	}

//	public Pago addPago(Pago pago) {
//		getPagos().add(pago);
//		pago.setDominiosDet(this);
//
//		return pago;
//	}
//
//	public Pago removePago(Pago pago) {
//		getPagos().remove(pago);
//		pago.setDominiosDet(null);
//
//		return pago;
//	}

//	public List<Producto> getProductos() {
//		return this.productos;
//	}
//
//	public void setProductos(List<Producto> productos) {
//		this.productos = productos;
//	}
//
//	public Producto addProducto(Producto producto) {
//		getProductos().add(producto);
//		producto.setDominiosDet(this);
//
//		return producto;
//	}
//
//	public Producto removeProducto(Producto producto) {
//		getProductos().remove(producto);
//		producto.setDominiosDet(null);
//
//		return producto;
//	}

}