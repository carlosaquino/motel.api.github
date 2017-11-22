package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


public class UsoHabitacionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal cantHoras;

	private BigDecimal cantMinutos;

	private Timestamp fechaEntrada;

	private Timestamp fechaSalida;

	private List<FacturaDTO> facturas;

	private HabitacionDTO habitacione;

	private List<UsoHabitacionDetDTO> usosHabitacionesDets;

	public UsoHabitacionDTO() {
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

	public List<FacturaDTO> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<FacturaDTO> facturas) {
		this.facturas = facturas;
	}

	public FacturaDTO addFactura(FacturaDTO factura) {
		getFacturas().add(factura);
		factura.setUsosHabitacione(this);

		return factura;
	}

	public FacturaDTO removeFactura(FacturaDTO factura) {
		getFacturas().remove(factura);
		factura.setUsosHabitacione(null);

		return factura;
	}

	public HabitacionDTO getHabitacione() {
		return this.habitacione;
	}

	public void setHabitacione(HabitacionDTO habitacione) {
		this.habitacione = habitacione;
	}

	public List<UsoHabitacionDetDTO> getUsosHabitacionesDets() {
		return this.usosHabitacionesDets;
	}

	public void setUsosHabitacionesDets(List<UsoHabitacionDetDTO> usosHabitacionesDets) {
		this.usosHabitacionesDets = usosHabitacionesDets;
	}

	public UsoHabitacionDetDTO addUsosHabitacionesDet(UsoHabitacionDetDTO usosHabitacionesDet) {
		getUsosHabitacionesDets().add(usosHabitacionesDet);
		usosHabitacionesDet.setUsosHabitacione(this);

		return usosHabitacionesDet;
	}

	public UsoHabitacionDetDTO removeUsosHabitacionesDet(UsoHabitacionDetDTO usosHabitacionesDet) {
		getUsosHabitacionesDets().remove(usosHabitacionesDet);
		usosHabitacionesDet.setUsosHabitacione(null);

		return usosHabitacionesDet;
	}

}