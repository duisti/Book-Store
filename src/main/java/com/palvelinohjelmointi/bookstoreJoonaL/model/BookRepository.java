package com.palvelinohjelmointi.bookstoreJoonaL.model;

import org.springframework.data.repository.CrudRepository;

import com.palvelinohjelmointi.bookstoreJoonaL.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
