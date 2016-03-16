package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.java.model.Automovel;
import study.utils.JPAUtil;

public class RemoverAutomovel {
	//TODO não está excluindo 
	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.pegarEntityManager();
		
		Automovel automovel = entityManager.getReference(Automovel.class, 2);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		entityManager.remove(automovel);
		transaction.commit();
	}
}
