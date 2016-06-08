package study.java.model.tipoDeRelacionamentos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Marca {

	@Id
	@GeneratedValue
	private Integer pkmarca;
	
	private String marca;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_detalhes_marca", foreignKey= @ForeignKey(name="fk_detalhes_marca"))
	private DetalhesMarca detalhesMarca;
	
	public DetalhesMarca getDetalhesMarca() {
		return detalhesMarca;
	}

	public void setDetalhesMarca(DetalhesMarca detalhesMarca) {
		this.detalhesMarca = detalhesMarca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPkmarca() {
		return pkmarca;
	}
	
}
