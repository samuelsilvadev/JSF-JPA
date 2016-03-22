package study.repositorios;

import java.util.List;

import javax.persistence.EntityManager;

import study.java.model.Automovel;
import study.utils.JPAUtil;

public class Automoveis {
	EntityManager entityManager = JPAUtil.pegarEntityManager();

	public Automovel pegarPorId(long automovel) {
		return entityManager.createQuery("from Automovel a where a.id = :id", Automovel.class)
				.setParameter("id", automovel).getSingleResult();
	}

	public List<Automovel> listarTodos() {
		return entityManager.createQuery("from Automovel", Automovel.class).getResultList();
	}
}
