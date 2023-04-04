package it.prova.proprietariojpa.service.proprietario;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.proprietariojpa.dao.EntityManagerUtil;
import it.prova.proprietariojpa.dao.automobile.AutomobileDAO;
import it.prova.proprietariojpa.dao.proprietario.ProprietarioDAO;
import it.prova.proprietariojpa.model.Proprietario;

public class ProprietarioServiceImpl implements ProprietarioService {
	private ProprietarioDAO proprietarioDAO;

	public void ProprietarioDAO(ProprietarioDAO proprietarioDAO) {
		this.proprietarioDAO = proprietarioDAO;

	}

	public List list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Proprietario get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Proprietario o) throws Exception {
		// TODO Auto-generated method stub

	}

	public void insert(Proprietario proprietarioInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			// questo è come il MyConnection.getConnection()
			entityManager.getTransaction().begin();

			// uso l'injection per il dao
			proprietarioDAO.setEntityManager(entityManager);

			// eseguo quello che realmente devo fare
			proprietarioDAO.insert(proprietarioInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}

	}

	public void delete(Proprietario o) throws Exception {
		// TODO Auto-generated method stub

	}

	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub

	}

	public List lista() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Proprietario caricaProprietario(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void aggiorna(Proprietario proprietaroInstance) throws Exception {
		EntityManager entityManager = EntityManagerUtil.getEntityManager();

		try {
			// questo è come il MyConnection.getConnection()
			entityManager.getTransaction().begin();

			// uso l'injection per il dao
			proprietarioDAO.setEntityManager(entityManager);

			// eseguo quello che realmente devo fare
			proprietarioDAO.update(proprietaroInstance);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);

		}
	}

	public void inserisciNuovo(Proprietario proprietaroInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	public void rimuovi(Proprietario proprietaroInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	public void setProprietarioDAO(ProprietarioDAO proprietarioDAO) {
		// TODO Auto-generated method stub

	}

}
