package it.prova.proprietariojpa.service.automobile;

import java.util.List;

import it.prova.proprietariojpa.dao.IBaseDAO;
import it.prova.proprietariojpa.dao.automobile.AutomobileDAO;
import it.prova.proprietariojpa.model.Automobile;


public interface AutomobileService extends IBaseDAO<Automobile> {
	
	public List<Automobile> listAllAbitanti() throws Exception;

	public Automobile caricaSingoloAbitante(Long id) throws Exception;

	public void aggiorna(Automobile automobileInstance) throws Exception;

	public void inserisciNuovo(Automobile automobileInstance) throws Exception;

	public void rimuovi(Long idAutomobile) throws Exception;
	
	public void trovaErroreProprietarioMinorenne();

	
	//per injection
	public void setAutomobileDAO(AutomobileDAO automobileDAO);
}
