package com.accenture.technologylearningpills.reactivebackend.repository;

import com.accenture.technologylearningpills.reactivebackend.repository.model.Client;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends RxJava2CrudRepository<Client, String> {

    // Intencionalmente en blanco, en este ejemplo utilizaremos los métodos que nos proporciona el CrudRepository

}
