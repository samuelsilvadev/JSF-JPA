package study.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import study.java.model.tipoDeRelacionamentos.Marca;
import study.java.model.tipoDeRelacionamentos.Modelo;
import study.utils.JPAUtil;

public class TstMarcaModelos {

	public static void main(String[] args) {

		EntityManager entityManager = JPAUtil.pegarEntityManager();

		Marca marca = new Marca();
		marca.setMarca("Ferrari");
		
		Modelo modelo = new Modelo();
		modelo.setFkmarca(marca);
		
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(modelo);
		entityTransaction.commit();
		
		entityManager.close();
		

	}

}
