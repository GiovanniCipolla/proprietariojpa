package it.prova.proprietariojpa.service.automobile;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.proprietariojpa.dao.EntityManagerUtil;
import it.prova.proprietariojpa.dao.automobile.AutomobileDAO;
import it.prova.proprietariojpa.model.Automobile;

public class AutomobileServiceImpl implements AutomobileService {
	
	private AutomobileDAO automobileDAO;
	
	public void setAutomobileDAO(AutomobileDAO automobileDAO) {
		this.automobileDAO=automobileDAO;
		
	}

	public List list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Automobile get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Automobile automobileInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			// questo è come il MyConnection.getConnection()
			entityManager.getTransaction().begin();

			// uso l'injection per il dao
			automobileDAO.setEntityManager(entityManager);

			// eseguo quello che realmente devo fare
			automobileDAO.update(automobileInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
		
	}

	public void insert(Automobile automobileInstance) throws Exception {
		
	}

	public void delete(Automobile o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub
		
	}

	public List listAllAbitanti() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Automobile caricaSingoloAbitante(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void aggiorna(Automobile automobileInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void inserisciNuovo(Automobile automobileInstance) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void rimuovi(Long idAutomobile) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void trovaErroreProprietarioMinorenne() {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			// questo è come il MyConnection.getConnection()
			entityManager.getTransaction().begin();

			// uso l'injection per il dao
			automobileDAO.setEntityManager(entityManager);

			// eseguo quello che realmente devo fare
			automobileDAO.erroreConProprietarioMinorenne();

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
		
		
	}


	

}
