package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin(origins = "http://localhost:3000/")
//@RepositoryRestResource(collectionResourceRel = "dataentry", path = "dataentry")
public interface DataEntryRepository extends CrudRepository<DataEntry, Long> {

}