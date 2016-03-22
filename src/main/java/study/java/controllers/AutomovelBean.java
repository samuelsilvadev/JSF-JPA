package study.java.controllers;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import study.java.model.Automovel;
import study.utils.JPAUtil;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();

	public String salva() {
		EntityManager entityManager = JPAUtil.pegarEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(this.getAutomovel());
		entityManager.getTransaction().commit();
		this.setAutomovel(new Automovel());
		return "cadastrarAutomoveis?faces-redirect?true";
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

}
