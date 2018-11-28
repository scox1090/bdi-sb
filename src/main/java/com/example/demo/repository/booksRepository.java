package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.collection.Books;



@Repository
public interface booksRepository extends MongoRepository<Books, String>{

	@Query("{name:?0}")
	public Books findByName(String name);
	
	
}
