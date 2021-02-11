package com.palvelinohjelmointi.bookstoreJoonaL.model;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
