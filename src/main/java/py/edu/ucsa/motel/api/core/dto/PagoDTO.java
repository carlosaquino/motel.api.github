package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


public class PagoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Timestamp fechaPago;

	private BigDecimal montoPagado;

	private String nroDocumentoPago;

	private DominioDetDTO dominiosDet;

	public PagoDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(Timestamp fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getMontoPagado() {
		return this.montoPagado;
	}

	public void setMontoPagado(BigDecimal montoPagado) {
		this.montoPagado = montoPagado;
	}

	public String getNroDocumentoPago() {
		return this.nroDocumentoPago;
	}

	public void setNroDocumentoPago(String nroDocumentoPago) {
		this.nroDocumentoPago = nroDocumentoPago;
	}

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

}