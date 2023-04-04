package it.prova.proprietariojpa.service.proprietario;

import java.util.List;

import it.prova.proprietariojpa.dao.IBaseDAO;
import it.prova.proprietariojpa.dao.automobile.AutomobileDAO;
import it.prova.proprietariojpa.dao.proprietario.ProprietarioDAO;
import it.prova.proprietariojpa.model.Proprietario;

public interface ProprietarioService extends IBaseDAO<Proprietario> {
	
	public List<Proprietario> lista() throws Exception;

	public Proprietario caricaProprietario(Long id) throws Exception;

	public void aggiorna(Proprietario proprietaroInstance) throws Exception;

	public void inserisciNuovo(Proprietario proprietaroInstance) throws Exception;

	public void rimuovi(Proprietario proprietaroInstance) throws Exception;
	
	public void setProprietarioDAO(ProprietarioDAO proprietarioDAO);
}

