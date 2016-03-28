package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.java.model.Automovel;
import study.utils.JPAUtil;

public class PersistirAutomovel {

	public static void main(String[] args) {

		EntityManager entityManager = JPAUtil.pegarEntityManager();

		Automovel automovel = new Automovel();
		
		automovel.setMarca("Boa Demais");
		automovel.setModelo("Gol");
		automovel.setAnoFabricacao(2014);
		automovel.setAnoModelo(2015);
		automovel.setObservacoes("Venda realizada com emplacamento");

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(automovel);
		entityTransaction.commit();

		entityManager.close();
		

	}

}
