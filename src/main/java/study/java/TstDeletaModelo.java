package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.java.model.tipoDeRelacionamentos.Modelo;
import study.utils.JPAUtil;

public class TstDeletaModelo {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.pegarEntityManager();
		
		Modelo modelo = entityManager.getReference(Modelo.class, 14);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.remove(modelo);
		entityTransaction.commit();
		
		entityManager.close();

		
	}
	
}
