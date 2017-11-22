package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.util.List;



public class DominioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codigo;

	private String descripcion;

	private String estado;

	private DominioDTO dominio;

	private List<DominioDTO> dominios;

	private List<DominioDetDTO> dominiosDets;

	public DominioDTO() {
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

	public DominioDTO getDominio() {
		return this.dominio;
	}

	public void setDominio(DominioDTO dominio) {
		this.dominio = dominio;
	}

	public List<DominioDTO> getDominios() {
		return this.dominios;
	}

	public void setDominios(List<DominioDTO> dominios) {
		this.dominios = dominios;
	}

	public DominioDTO addDominio(DominioDTO dominio) {
		getDominios().add(dominio);
		dominio.setDominio(this);

		return dominio;
	}

	public DominioDTO removeDominio(DominioDTO dominio) {
		getDominios().remove(dominio);
		dominio.setDominio(null);

		return dominio;
	}

	public List<DominioDetDTO> getDominiosDets() {
		return this.dominiosDets;
	}

	public void setDominiosDets(List<DominioDetDTO> dominiosDets) {
		this.dominiosDets = dominiosDets;
	}

	public DominioDetDTO addDominiosDet(DominioDetDTO dominiosDet) {
		getDominiosDets().add(dominiosDet);
		dominiosDet.setDominio(this);

		return dominiosDet;
	}

	public DominioDetDTO removeDominiosDet(DominioDetDTO dominiosDet) {
		getDominiosDets().remove(dominiosDet);
		dominiosDet.setDominio(null);

		return dominiosDet;
	}

}