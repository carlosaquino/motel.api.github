package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


public class FacturaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Timestamp fecha;

	private BigDecimal totalExentas;

	private BigDecimal totalFactura;

	private BigDecimal totalGravadas;

	private BigDecimal totalIva10;

	private ClienteDTO cliente;

	private DominioDetDTO dominiosDet;

	private UsoHabitacionDTO usosHabitacione;

	private List<FacturaDetDTO> facturasDets;

	public FacturaDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalExentas() {
		return this.totalExentas;
	}

	public void setTotalExentas(BigDecimal totalExentas) {
		this.totalExentas = totalExentas;
	}

	public BigDecimal getTotalFactura() {
		return this.totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public BigDecimal getTotalGravadas() {
		return this.totalGravadas;
	}

	public void setTotalGravadas(BigDecimal totalGravadas) {
		this.totalGravadas = totalGravadas;
	}

	public BigDecimal getTotalIva10() {
		return this.totalIva10;
	}

	public void setTotalIva10(BigDecimal totalIva10) {
		this.totalIva10 = totalIva10;
	}

	public ClienteDTO getCliente() {
		return this.cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public UsoHabitacionDTO getUsosHabitacione() {
		return this.usosHabitacione;
	}

	public void setUsosHabitacione(UsoHabitacionDTO usosHabitacione) {
		this.usosHabitacione = usosHabitacione;
	}

	public List<FacturaDetDTO> getFacturasDets() {
		return this.facturasDets;
	}

	public void setFacturasDets(List<FacturaDetDTO> facturasDets) {
		this.facturasDets = facturasDets;
	}

	public FacturaDetDTO addFacturasDet(FacturaDetDTO facturasDet) {
		getFacturasDets().add(facturasDet);
		facturasDet.setFactura(this);

		return facturasDet;
	}

	public FacturaDetDTO removeFacturasDet(FacturaDetDTO facturasDet) {
		getFacturasDets().remove(facturasDet);
		facturasDet.setFactura(null);

		return facturasDet;
	}

}