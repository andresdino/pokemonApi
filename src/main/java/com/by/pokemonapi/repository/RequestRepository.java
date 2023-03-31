package com.by.pokemonapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.by.pokemonapi.entity.Request;


public interface RequestRepository  extends CrudRepository<Request, Long>{

}
