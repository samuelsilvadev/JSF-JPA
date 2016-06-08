package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.java.model.chavesCompostas.ConsumidorProduto;
import study.java.model.chavesCompostas.ConsumidorProdutoPK;
import study.utils.JPAUtil;

public class TstChavesCompostas {

	public static void main(String[] args) {

		EntityManager entityManager = JPAUtil.pegarEntityManager();
		
		ConsumidorProdutoPK consumidorProdutoPK = new ConsumidorProdutoPK();
		consumidorProdutoPK.setConsumidorId(1);
		consumidorProdutoPK.setProdutoId(1);
		
		ConsumidorProduto consumidorProduto = new ConsumidorProduto();
		consumidorProduto.setConsumidorProdutoPK(consumidorProdutoPK);
		consumidorProduto.setEnviarEmail(true);
		
		
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(consumidorProduto);
		entityTransaction.commit();
		
		entityManager.close();
		

	}

}
