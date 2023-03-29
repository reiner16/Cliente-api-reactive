package com.demo.Cliente.api.reactive.repository;


import com.demo.Cliente.api.reactive.model.Cliente;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Flux;

public interface ClienteRepository  extends ReactiveMongoRepository<Cliente, Integer> {

}
