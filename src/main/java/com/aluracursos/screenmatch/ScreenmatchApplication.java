package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.principal.Principal;
<<<<<<< HEAD
import com.aluracursos.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> fd6bc0f039112b771cbb8c2f2a2cbb8c1c6dbeb9
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

<<<<<<< HEAD
	@Autowired
	private SerieRepository repository;
=======
>>>>>>> fd6bc0f039112b771cbb8c2f2a2cbb8c1c6dbeb9
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
<<<<<<< HEAD
		Principal principal = new Principal(repository);
=======
		Principal principal = new Principal();
>>>>>>> fd6bc0f039112b771cbb8c2f2a2cbb8c1c6dbeb9
		principal.muestraElMenu();




	}
}
