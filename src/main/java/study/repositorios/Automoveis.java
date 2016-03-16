package study.repositorios;

import java.util.List;

import javax.persistence.EntityManager;

import study.java.model.Automovel;
import study.utils.JPAUtil;

public class Automoveis {
	EntityManager entityManager = JPAUtil.pegarEntityManager();
	
	public List<Automovel> listarTodos(){
		return entityManager.createQuery("from Automovel", Automovel.class).getResultList();
	} 
}
