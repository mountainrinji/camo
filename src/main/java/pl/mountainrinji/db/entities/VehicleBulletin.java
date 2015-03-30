package pl.mountainrinji.db.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vehicle_bulletin database table.
 * 
 */
@Entity
@Table(name="vehicle_bulletin")
@NamedQuery(name="VehicleBulletin.findAll", query="SELECT v FROM VehicleBulletin v")
public class VehicleBulletin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="vehicle_bulletin_seq_gen")
	@SequenceGenerator(name="vehicle_bulletin_seq_gen", sequenceName="bulletin_id_seq")
	private Integer id;

	private Boolean mandatory;

	private String name;

	public VehicleBulletin() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getMandatory() {
		return this.mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
