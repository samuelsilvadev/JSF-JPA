package study.java.model.tipoDeRelacionamentos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Modelo {

	@Id
	@GeneratedValue
	private Integer pk;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkmarca", foreignKey = @ForeignKey(name="fk_marca"))
	private Marca fkmarca;

	public Integer getPk() {
		return pk;
	}

	public Marca getFkmarca() {
		return fkmarca;
	}

	public void setFkmarca(Marca fkmarca) {
		this.fkmarca = fkmarca;
	}
}
