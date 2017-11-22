package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;



public class PromocionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Timestamp fechaFinPromo;

	private Timestamp fechaInicioPromo;

	private Time horarioFinPromo;

	private Time horarioInicioPromo;

	private String nombrePromocion;

	public PromocionDTO() {
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