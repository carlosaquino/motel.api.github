package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTOS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTOS_ID_GENERATOR")
	private Integer id;

	private String codigo;

	private String descripcion;

	@Column(name="precio_base")
	private BigDecimal precioBase;

	@Column(name="stock_gral")
	private BigDecimal stockGral;

	//bi-directional many-to-one association to DominioDet
//	@ManyToOne
//	@JoinColumn(name="id_tipo")
//	private DominioDet dominiosDet;

	@Column(name="id_tipo")
	private Integer idTipo;
	
	//bi-directional many-to-one association to ProductoHabitacion
//	@OneToMany(mappedBy="producto")
//	private List<ProductoHabitacion> productosHabitaciones;

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public Producto() {
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

	public BigDecimal getPrecioBase() {
		return this.precioBase;
	}

	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}

	public BigDecimal getStockGral() {
		return this.stockGral;
	}

	public void setStockGral(BigDecimal stockGral) {
		this.stockGral = stockGral;
	}

//	public DominioDet getDominiosDet() {
//		return this.dominiosDet;
//	}
//
//	public void setDominiosDet(DominioDet dominiosDet) {
//		this.dominiosDet = dominiosDet;
//	}
//
//	public List<ProductoHabitacion> getProductosHabitaciones() {
//		return this.productosHabitaciones;
//	}
//
//	public void setProductosHabitaciones(List<ProductoHabitacion> productosHabitaciones) {
//		this.productosHabitaciones = productosHabitaciones;
//	}

//	public ProductoHabitacion addProductosHabitacione(ProductoHabitacion productosHabitacione) {
//		getProductosHabitaciones().add(productosHabitacione);
//		productosHabitacione.setProducto(this);
//
//		return productosHabitacione;
//	}
//
//	public ProductoHabitacion removeProductosHabitacione(ProductoHabitacion productosHabitacione) {
//		getProductosHabitaciones().remove(productosHabitacione);
//		productosHabitacione.setProducto(null);
//
//		return productosHabitacione;
//	}

}