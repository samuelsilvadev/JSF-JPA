package study.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("STUDY");
	
	public static EntityManager pegarEntityManager(){
		return entityManagerFactory.createEntityManager();
	} 
}
