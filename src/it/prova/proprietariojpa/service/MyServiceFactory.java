package it.prova.proprietariojpa.service;

import it.prova.proprietariojpa.dao.MyDaoFactory;
import it.prova.proprietariojpa.service.automobile.AutomobileService;
import it.prova.proprietariojpa.service.automobile.AutomobileServiceImpl;
import it.prova.proprietariojpa.service.proprietario.ProprietarioService;
import it.prova.proprietariojpa.service.proprietario.ProprietarioServiceImpl;

public class MyServiceFactory {
	private static AutomobileService automobileServiceIstanza = null;
	private static ProprietarioService proprietaroServiceIstanza = null;

	public static AutomobileService getAutomobileServiceInstance() {
		if (automobileServiceIstanza == null) {
			automobileServiceIstanza =  new AutomobileServiceImpl();
			automobileServiceIstanza.setAutomobileDAO(MyDaoFactory.getAutomobileDAOInstance());
		}
		return automobileServiceIstanza;
	}

	public static ProprietarioService proprietarioServiceInstance() {
		if (proprietaroServiceIstanza == null) {
			proprietaroServiceIstanza = new ProprietarioServiceImpl();
			proprietaroServiceIstanza.setProprietarioDAO(MyDaoFactory.getProprietaarioDAOInstance());
		}
		return proprietaroServiceIstanza;
	}
}
