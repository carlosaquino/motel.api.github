package py.edu.ucsa.motel.api.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the habitaciones_det database table.
 * 
 */
@Entity
@Table(name="habitaciones_det")
@NamedQuery(name="HabitacionDet.findAll", query="SELECT h FROM HabitacionDet h")
public class HabitacionDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HABITACIONES_DET_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HABITACIONES_DET_ID_GENERATOR")
	private Integer id;

	//bi-directional many-to-one association to DominioDet
	@ManyToOne
	@JoinColumn(name="id_caracteristica")
	private DominioDet dominiosDet;

	//bi-directional many-to-one association to Habitacion
	@ManyToOne
	@JoinColumn(name="id_habitacion")
	private Habitacion habitacione;

	public HabitacionDet() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DominioDet getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDet dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public Habitacion getHabitacione() {
		return this.habitacione;
	}

	public void setHabitacione(Habitacion habitacione) {
		this.habitacione = habitacione;
	}

}