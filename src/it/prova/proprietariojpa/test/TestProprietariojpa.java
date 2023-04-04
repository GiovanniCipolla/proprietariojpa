package it.prova.proprietariojpa.test;

import java.util.List;

import it.prova.proprietariojpa.dao.EntityManagerUtil;
import it.prova.proprietariojpa.model.Automobile;
import it.prova.proprietariojpa.model.Proprietario;
import it.prova.proprietariojpa.service.MyServiceFactory;
import it.prova.proprietariojpa.service.automobile.AutomobileService;
import it.prova.proprietariojpa.service.proprietario.ProprietarioService;

public class TestProprietariojpa {
	public static void main(String[] args) {

		ProprietarioService proprietarioService = MyServiceFactory.proprietarioServiceInstance();
		AutomobileService automobileService = MyServiceFactory.getAutomobileServiceInstance();

		try {

			// TEST
			
			testInsertProprietario(proprietarioService);
			
			testUpdateProprietario(proprietarioService);
			
			testInsertAutomobile(automobileService);
			
			TestFindErroriAutomobile(automobileService);

		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}
	}

	// TEST INSERT PROPRIETARIO
	private static void testInsertProprietario(ProprietarioService proprietarioService) throws Exception {
		System.out.println("---------------------INIZIO TEST-------------------");
		
		Proprietario test = new Proprietario();
		test.setNome("Angelica");
		proprietarioService.inserisciNuovo(test);
		
		if(test.getNome()==null)
			throw new Exception();
		
		System.out.println("---------------------FINE TEST-------------------");
	}

	// TEST UPDATE PROPRIETARIO
	private static void testUpdateProprietario(ProprietarioService proprietarioService) throws Exception {
		System.out.println("---------------------INIZIO TEST-------------------");

		Proprietario test = new Proprietario();
		test.setNome("GIo");
		proprietarioService.aggiorna(test);
		
		if(test.getNome()==null)
			throw new Exception();
		
		
		System.out.println("---------------------FINE TEST-------------------");
	}

	// TEST INSERT AUTOMOBILE
	private static void testInsertAutomobile(AutomobileService automobileService) throws Exception {
		System.out.println("---------------------INIZIO TEST-------------------");

		Automobile test = new Automobile();
		test.setMarca("mercedes");
		automobileService.inserisciNuovo(test);
		
		if(test.getMarca()==null)
			throw new Exception();
		
		
		System.out.println("---------------------FINE TEST-------------------");
	}

	// TEST ERRORIFIND AUTOMOBILE
	private static void TestFindErroriAutomobile(AutomobileService automobileService) throws Exception {
		System.out.println("---------------------INIZIO TEST-------------------");

		automobileService.trovaErroreProprietarioMinorenne();
		
		System.out.println("---------------------FINE TEST-------------------");
	}
}
