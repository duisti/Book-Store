package com.palvelinohjelmointi.bookstoreJoonaL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.palvelinohjelmointi.bookstoreJoonaL.domain.Book;
import com.palvelinohjelmointi.bookstoreJoonaL.model.BookRepository;

@SpringBootApplication
public class BookstoreJoonaLApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreJoonaLApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			//something here
			Book b1 = new Book("Uusi Kirja", "Meitsi", 1990, "1592195");
			Book b2 = new Book("Toinen Kirja", "Meitsi", 1993, "1592155");
			repository.save(b1);
			repository.save(b2);
		};
	}

}
