package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class ProductoHabitacionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal precio;

	private BigDecimal stockXHab;

	private HabitacionDTO habitacione;

	private ProductoDTO producto;

	private List<UsoHabitacionDetDTO> usosHabitacionesDets;

	public ProductoHabitacionDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getStockXHab() {
		return this.stockXHab;
	}

	public void setStockXHab(BigDecimal stockXHab) {
		this.stockXHab = stockXHab;
	}

	public HabitacionDTO getHabitacione() {
		return this.habitacione;
	}

	public void setHabitacione(HabitacionDTO habitacione) {
		this.habitacione = habitacione;
	}

	public ProductoDTO getProducto() {
		return this.producto;
	}

	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}

	public List<UsoHabitacionDetDTO> getUsosHabitacionesDets() {
		return this.usosHabitacionesDets;
	}

	public void setUsosHabitacionesDets(List<UsoHabitacionDetDTO> usosHabitacionesDets) {
		this.usosHabitacionesDets = usosHabitacionesDets;
	}

	public UsoHabitacionDetDTO addUsosHabitacionesDet(UsoHabitacionDetDTO usosHabitacionesDet) {
		getUsosHabitacionesDets().add(usosHabitacionesDet);
		usosHabitacionesDet.setProductosHabitacione(this);

		return usosHabitacionesDet;
	}

	public UsoHabitacionDetDTO removeUsosHabitacionesDet(UsoHabitacionDetDTO usosHabitacionesDet) {
		getUsosHabitacionesDets().remove(usosHabitacionesDet);
		usosHabitacionesDet.setProductosHabitacione(null);

		return usosHabitacionesDet;
	}

}