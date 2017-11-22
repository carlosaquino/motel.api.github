package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the dominios database table.
 * 
 */
@Entity
@Table(name="dominios")
@NamedQuery(name="Dominio.findAll", query="SELECT d FROM Dominio d")
public class Dominio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOMINIOS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOMINIOS_ID_GENERATOR")
	private Integer id;

	private String codigo;

	private String descripcion;

	private String estado;

	//bi-directional many-to-one association to Dominio
//	@ManyToOne
//	@JoinColumn(name="id_padre")
//	private Dominio dominio;
	
	@Column(name="id_padre")
	private Integer idPadre;

	//bi-directional many-to-one association to Dominio
//	@OneToMany(mappedBy="dominio")
//	private List<Dominio> dominios;

	//bi-directional many-to-one association to DominioDet
//	@OneToMany(mappedBy="dominio")
//	private List<DominioDet> dominiosDets;


	public Dominio() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

//	public Dominio getDominio() {
//		return this.dominio;
//	}
//
//	public void setDominio(Dominio dominio) {
//		this.dominio = dominio;
//	}
//
//	public List<Dominio> getDominios() {
//		return this.dominios;
//	}
//
//	public void setDominios(List<Dominio> dominios) {
//		this.dominios = dominios;
//	}
//
//	public Dominio addDominio(Dominio dominio) {
//		getDominios().add(dominio);
//		dominio.setDominio(this);
//
//		return dominio;
//	}
//
//	public Dominio removeDominio(Dominio dominio) {
//		getDominios().remove(dominio);
//		dominio.setDominio(null);
//
//		return dominio;
//	}
//
//	public List<DominioDet> getDominiosDets() {
//		return this.dominiosDets;
//	}
//
//	public void setDominiosDets(List<DominioDet> dominiosDets) {
//		this.dominiosDets = dominiosDets;
//	}
//
//	public DominioDet addDominiosDet(DominioDet dominiosDet) {
//		getDominiosDets().add(dominiosDet);
//		dominiosDet.setDominio(this);
//
//		return dominiosDet;
//	}
//
//	public DominioDet removeDominiosDet(DominioDet dominiosDet) {
//		getDominiosDets().remove(dominiosDet);
//		dominiosDet.setDominio(null);
//
//		return dominiosDet;
//	}

	public Integer getIdPadre() {
		return idPadre;
	}
	
	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}
}