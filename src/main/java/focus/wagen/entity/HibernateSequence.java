package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hibernate_sequences database table.
 * 
 */
@Entity
@Table(name="hibernate_sequences")
@NamedQuery(name="HibernateSequence.findAll", query="SELECT h FROM HibernateSequence h")
public class HibernateSequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sequence_name")
	private String sequenceName;

	@Column(name="sequence_next_hi_value")
	private Long sequenceNextHiValue;

	public HibernateSequence() {
	}

	public String getSequenceName() {
		return this.sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public Long getSequenceNextHiValue() {
		return this.sequenceNextHiValue;
	}

	public void setSequenceNextHiValue(Long sequenceNextHiValue) {
		this.sequenceNextHiValue = sequenceNextHiValue;
	}

}