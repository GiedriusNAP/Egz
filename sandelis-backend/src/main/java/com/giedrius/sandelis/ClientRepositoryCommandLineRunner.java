package com.giedrius.sandelis;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.giedrius.sandelis.entity.Client;
import com.giedrius.sandelis.service.ClientDAOService;
import com.giedrius.sandelis.service.ClientRepository;

@Component
public class ClientRepositoryCommandLineRunner implements CommandLineRunner{
	private static final org.slf4j.Logger log = 
			LoggerFactory.getLogger(ClientRepositoryCommandLineRunner.class);
	
	@Autowired
	private ClientRepository clientRepository;
	@Override
	public void run(String... args) throws Exception {
		Client klientas = new Client("Jill", null, null, null, false);
		long insert = clientRepository.save(klientas);
		log.info("New Client created : " + klientas);
	}
	/**
	 * @return the clientDAOService
	 */
	public ClientDAOService getClientDAOService() {
		return clientDaoService;
	}
	/**
	 * @param clientDAOService the clientDAOService to set
	 */
	public void setClientDAOService(ClientDAOService clientDAOService) {
		this.clientDaoService = clientDAOService;
	}	
}
