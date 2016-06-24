package fr.treeptik.runtime;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import fr.treeptik.refugeanimaux.Chat;
import fr.treeptik.refugeanimaux.Chien;
import fr.treeptik.refugeanimaux.Perroquet;

public class Runtime {
	
	public static void main(String[] args) {
		EntityManager en = 
				Persistence.createEntityManagerFactory("sample").createEntityManager();
		
		Chien waf= new Chien();
		
		Chat meow = new Chat();
		
		Perroquet cui = new Perroquet();
		
		en.getTransaction().begin();
		en.persist(cui);
		en.persist(waf);
		en.persist(meow);
		en.getTransaction().commit();
		
		en.close();
	}

}
