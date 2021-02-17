package com.palvelinohjelmointi.bookstoreJoonaL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.palvelinohjelmointi.bookstoreJoonaL.domain.*;

@SpringBootApplication
public class BookstoreJoonaLApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreJoonaLApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreJoonaLApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository) {
		return (args) -> {
			//something here
			Category c1 = new Category("Mystery");
			Category c2 = new Category("Thriller");
			crepository.save(c1);
			crepository.save(c2);
			
			Book b1 = new Book("Uusi Kirja", "Meitsi", 1990, "1592195", crepository.findByName("Mystery").get(0));
			Book b2 = new Book("Toinen Kirja", "Meitsi", 1993, "1592155", crepository.findByName("Thriller").get(0));
			brepository.save(b1);
			brepository.save(b2);
		};
	}

}
