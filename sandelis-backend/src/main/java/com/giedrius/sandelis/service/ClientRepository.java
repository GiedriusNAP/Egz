package com.giedrius.sandelis.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giedrius.sandelis.entity.Client;

public interface ClientRepository extends JpaRepository< Client.class, Long {

}
