package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String apellido;

	private BigDecimal dv;

	private BigDecimal edad;

	private String nombre;

	private String nroDoc;

	private DominioDetDTO dominiosDet;

	private List<FacturaDTO> facturas;

	public ClienteDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getDv() {
		return this.dv;
	}

	public void setDv(BigDecimal dv) {
		this.dv = dv;
	}

	public BigDecimal getEdad() {
		return this.edad;
	}

	public void setEdad(BigDecimal edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDoc() {
		return this.nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public List<FacturaDTO> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<FacturaDTO> facturas) {
		this.facturas = facturas;
	}

	public FacturaDTO addFactura(FacturaDTO factura) {
		getFacturas().add(factura);
		factura.setCliente(this);

		return factura;
	}

	public FacturaDTO removeFactura(FacturaDTO factura) {
		getFacturas().remove(factura);
		factura.setCliente(null);

		return factura;
	}

}