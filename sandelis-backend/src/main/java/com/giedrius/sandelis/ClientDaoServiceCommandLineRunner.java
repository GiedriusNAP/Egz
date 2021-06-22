package com.giedrius.sandelis;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.giedrius.sandelis.entity.Client;
import com.giedrius.sandelis.service.ClientDAOService;

@Component
public class ClientDaoServiceCommandLineRunner implements CommandLineRunner {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(ClientDaoServiceCommandLineRunner.class);

	@Autowired
	private ClientDAOService clientDaoService;

	@Override
	public void run(String... args) throws Exception {
		Client klientas = new Client("Petras", null, null, null, false);
		Long insert = clientDaoService.insert(klientas);
		log.info("New Client created : " + klientas);
	}

}
