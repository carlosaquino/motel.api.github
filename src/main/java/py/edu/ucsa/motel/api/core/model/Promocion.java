package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the promociones database table.
 * 
 */
@Entity
@Table(name="promociones")
@NamedQuery(name="Promocion.findAll", query="SELECT p FROM Promocion p")
public class Promocion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROMOCIONES_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROMOCIONES_ID_GENERATOR")
	private Integer id;

	@Column(name="fecha_fin_promo")
	private Timestamp fechaFinPromo;

	@Column(name="fecha_inicio_promo")
	private Timestamp fechaInicioPromo;

	@Column(name="horario_fin_promo")
	private Time horarioFinPromo;

	@Column(name="horario_inicio_promo")
	private Time horarioInicioPromo;

	@Column(name="nombre_promocion")
	private String nombrePromocion;

	public Promocion() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getFechaFinPromo() {
		return this.fechaFinPromo;
	}

	public void setFechaFinPromo(Timestamp fechaFinPromo) {
		this.fechaFinPromo = fechaFinPromo;
	}

	public Timestamp getFechaInicioPromo() {
		return this.fechaInicioPromo;
	}

	public void setFechaInicioPromo(Timestamp fechaInicioPromo) {
		this.fechaInicioPromo = fechaInicioPromo;
	}

	public Time getHorarioFinPromo() {
		return this.horarioFinPromo;
	}

	public void setHorarioFinPromo(Time horarioFinPromo) {
		this.horarioFinPromo = horarioFinPromo;
	}

	public Time getHorarioInicioPromo() {
		return this.horarioInicioPromo;
	}

	public void setHorarioInicioPromo(Time horarioInicioPromo) {
		this.horarioInicioPromo = horarioInicioPromo;
	}

	public String getNombrePromocion() {
		return this.nombrePromocion;
	}

	public void setNombrePromocion(String nombrePromocion) {
		this.nombrePromocion = nombrePromocion;
	}

}