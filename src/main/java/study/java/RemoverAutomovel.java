package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.repositorios.Automoveis;
import study.utils.JPAUtil;

public class RemoverAutomovel {
	// TODO não está excluindo
	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.pegarEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		long automovel = 1;
		Automoveis automoveis = new Automoveis();

		
		entityManager.remove(automoveis.pegarPorId(automovel));
		transaction.commit();
	}
}
