package com.example.springweb.repository;

import com.example.springweb.entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepo extends CrudRepository<Pet, Long> {

    List<Pet> findByTag(String tag);}
