package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class ProductoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codigo;

	private String descripcion;

	private BigDecimal precioBase;

	private BigDecimal stockGral;

	private DominioDetDTO dominiosDet;

	private List<ProductoHabitacionDTO> productosHabitaciones;

	public ProductoDTO() {
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

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public List<ProductoHabitacionDTO> getProductosHabitaciones() {
		return this.productosHabitaciones;
	}

	public void setProductosHabitaciones(List<ProductoHabitacionDTO> productosHabitaciones) {
		this.productosHabitaciones = productosHabitaciones;
	}

	public ProductoHabitacionDTO addProductosHabitacione(ProductoHabitacionDTO productosHabitacione) {
		getProductosHabitaciones().add(productosHabitacione);
		productosHabitacione.setProducto(this);

		return productosHabitacione;
	}

	public ProductoHabitacionDTO removeProductosHabitacione(ProductoHabitacionDTO productosHabitacione) {
		getProductosHabitaciones().remove(productosHabitacione);
		productosHabitacione.setProducto(null);

		return productosHabitacione;
	}

}