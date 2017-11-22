package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class UsoHabitacionDetDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal cantidad;

	private Boolean cortesia;

	private BigDecimal precio;

	private BigDecimal total;

	private List<FacturaDetDTO> facturasDets;

	private ProductoHabitacionDTO productosHabitacione;

	private UsoHabitacionDTO usosHabitacione;

	public UsoHabitacionDetDTO() {
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

	public List<FacturaDetDTO> getFacturasDets() {
		return this.facturasDets;
	}

	public void setFacturasDets(List<FacturaDetDTO> facturasDets) {
		this.facturasDets = facturasDets;
	}

	public FacturaDetDTO addFacturasDet(FacturaDetDTO facturasDet) {
		getFacturasDets().add(facturasDet);
		facturasDet.setUsosHabitacionesDet(this);

		return facturasDet;
	}

	public FacturaDetDTO removeFacturasDet(FacturaDetDTO facturasDet) {
		getFacturasDets().remove(facturasDet);
		facturasDet.setUsosHabitacionesDet(null);

		return facturasDet;
	}

	public ProductoHabitacionDTO getProductosHabitacione() {
		return this.productosHabitacione;
	}

	public void setProductosHabitacione(ProductoHabitacionDTO productosHabitacione) {
		this.productosHabitacione = productosHabitacione;
	}

	public UsoHabitacionDTO getUsosHabitacione() {
		return this.usosHabitacione;
	}

	public void setUsosHabitacione(UsoHabitacionDTO usosHabitacione) {
		this.usosHabitacione = usosHabitacione;
	}

}