package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class FacturaDetDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal cantidad;

	private BigDecimal precio;

	private FacturaDTO factura;

	private UsoHabitacionDetDTO usosHabitacionesDet;

	public FacturaDetDTO() {
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

	public FacturaDTO getFactura() {
		return this.factura;
	}

	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

	public UsoHabitacionDetDTO getUsosHabitacionesDet() {
		return this.usosHabitacionesDet;
	}

	public void setUsosHabitacionesDet(UsoHabitacionDetDTO usosHabitacionesDet) {
		this.usosHabitacionesDet = usosHabitacionesDet;
	}

}