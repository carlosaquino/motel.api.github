package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class HabitacionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nombre;

	private BigDecimal numero;

	private DominioDetDTO dominiosDet1;

	private DominioDetDTO dominiosDet2;

	private List<HabitacionDetDTO> habitacionesDets;

	private List<ProductoHabitacionDTO> productosHabitaciones;

	private List<UsoHabitacionDTO> usosHabitaciones;

	public HabitacionDTO() {
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

	public DominioDetDTO getDominiosDet1() {
		return this.dominiosDet1;
	}

	public void setDominiosDet1(DominioDetDTO dominiosDet1) {
		this.dominiosDet1 = dominiosDet1;
	}

	public DominioDetDTO getDominiosDet2() {
		return this.dominiosDet2;
	}

	public void setDominiosDet2(DominioDetDTO dominiosDet2) {
		this.dominiosDet2 = dominiosDet2;
	}

	public List<HabitacionDetDTO> getHabitacionesDets() {
		return this.habitacionesDets;
	}

	public void setHabitacionesDets(List<HabitacionDetDTO> habitacionesDets) {
		this.habitacionesDets = habitacionesDets;
	}

	public HabitacionDetDTO addHabitacionesDet(HabitacionDetDTO habitacionesDet) {
		getHabitacionesDets().add(habitacionesDet);
		habitacionesDet.setHabitacion(this);

		return habitacionesDet;
	}

	public HabitacionDetDTO removeHabitacionesDet(HabitacionDetDTO habitacionesDet) {
		getHabitacionesDets().remove(habitacionesDet);
		habitacionesDet.setHabitacion(null);

		return habitacionesDet;
	}

	public List<ProductoHabitacionDTO> getProductosHabitaciones() {
		return this.productosHabitaciones;
	}

	public void setProductosHabitaciones(List<ProductoHabitacionDTO> productosHabitaciones) {
		this.productosHabitaciones = productosHabitaciones;
	}

	public ProductoHabitacionDTO addProductosHabitacione(ProductoHabitacionDTO productosHabitacione) {
		getProductosHabitaciones().add(productosHabitacione);
		productosHabitacione.setHabitacione(this);

		return productosHabitacione;
	}

	public ProductoHabitacionDTO removeProductosHabitacione(ProductoHabitacionDTO productosHabitacione) {
		getProductosHabitaciones().remove(productosHabitacione);
		productosHabitacione.setHabitacione(null);

		return productosHabitacione;
	}

	public List<UsoHabitacionDTO> getUsosHabitaciones() {
		return this.usosHabitaciones;
	}

	public void setUsosHabitaciones(List<UsoHabitacionDTO> usosHabitaciones) {
		this.usosHabitaciones = usosHabitaciones;
	}

	public UsoHabitacionDTO addUsosHabitacione(UsoHabitacionDTO usosHabitacione) {
		getUsosHabitaciones().add(usosHabitacione);
		usosHabitacione.setHabitacione(this);

		return usosHabitacione;
	}

	public UsoHabitacionDTO removeUsosHabitacione(UsoHabitacionDTO usosHabitacione) {
		getUsosHabitaciones().remove(usosHabitacione);
		usosHabitacione.setHabitacione(null);

		return usosHabitacione;
	}

}