package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENTES_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTES_ID_GENERATOR")
	private Integer id;

	private String apellido;

	private BigDecimal dv;

	private BigDecimal edad;

	private String nombre;

	@Column(name="nro_doc")
	private String nroDoc;

	//bi-directional many-to-one association to DominioDet
	//@ManyToOne
	//@JoinColumn(name="id_tipo_doc")
	//private DominioDet dominiosDet;
	
	@Column(name="id_tipo_doc")
	private Integer idTipoDoc;


	public Cliente() {
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

//	public DominioDet getDominiosDet() {
//		return this.dominiosDet;
//	}
//
//	public void setDominiosDet(DominioDet dominiosDet) {
//		this.dominiosDet = dominiosDet;
//	}

	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}
	
	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}
}