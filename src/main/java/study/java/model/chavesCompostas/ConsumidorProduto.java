package study.java.model.chavesCompostas;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ConsumidorProduto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ConsumidorProdutoPK consumidorProdutoPK;
	
	private Boolean enviarEmail;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;

	public ConsumidorProdutoPK getConsumidorProdutoPK() {
		return consumidorProdutoPK;
	}
	public void setConsumidorProdutoPK(ConsumidorProdutoPK consumidorProdutoPK) {
		this.consumidorProdutoPK = consumidorProdutoPK;
	}
	public Boolean getEnviarEmail() {
		return enviarEmail;
	}
	public void setEnviarEmail(Boolean enviarEmail) {
		this.enviarEmail = enviarEmail;
	}
}
