package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the pagos database table.
 * 
 */
@Entity
@Table(name="pagos")
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGOS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGOS_ID_GENERATOR")
	private Integer id;

	@Column(name="fecha_pago")
	private Timestamp fechaPago;

	@Column(name="monto_pagado")
	private BigDecimal montoPagado;

	@Column(name="nro_documento_pago")
	private String nroDocumentoPago;

	//bi-directional many-to-one association to DominioDet
	@ManyToOne
	@JoinColumn(name="id_tipo_pago")
	private DominioDet dominiosDet;

	public Pago() {
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

	public DominioDet getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDet dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

}