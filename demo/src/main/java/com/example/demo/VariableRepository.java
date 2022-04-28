package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin(origins = "http://localhost:3000/")
@RepositoryRestResource(collectionResourceRel = "variables", path = "variables")
public interface VariableRepository extends PagingAndSortingRepository<Variable, Long> {

    List<Variable> findByName(@Param("name") String name);

}