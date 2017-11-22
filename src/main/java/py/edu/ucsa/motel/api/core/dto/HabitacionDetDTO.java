package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;


public class HabitacionDetDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private DominioDetDTO dominiosDet;

	private HabitacionDTO habitacion;

	public HabitacionDetDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public HabitacionDTO getHabitacion() {
		return this.habitacion;
	}

	public void setHabitacion(HabitacionDTO habitacion) {
		this.habitacion = habitacion;
	}

}