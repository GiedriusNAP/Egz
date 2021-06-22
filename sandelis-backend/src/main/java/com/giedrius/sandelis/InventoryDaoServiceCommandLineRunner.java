package com.giedrius.sandelis;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.giedrius.sandelis.entity.Inventory;
import com.giedrius.sandelis.service.InventoryDAOService;

@Component
public class InventoryDaoServiceCommandLineRunner implements CommandLineRunner {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(InventoryDaoServiceCommandLineRunner.class);

	@Autowired
	private InventoryDAOService inventoryDaoService;

	@Override
	public void run(String... args) throws Exception {
		Inventory box = new Inventory(null, 0, 0, null);
		Long insert = inventoryDaoService.insert(box);
		log.info("New Inventory created : " + box);
	}

}
