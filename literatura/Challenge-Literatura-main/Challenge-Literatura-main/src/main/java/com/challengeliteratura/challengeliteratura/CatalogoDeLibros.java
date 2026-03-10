package com.challengeliteratura.challengeliteratura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challengeliteratura.challengeliteratura.consola.ClienteLiteratura;
import com.challengeliteratura.challengeliteratura.repositorio.AutorRepository;
import com.challengeliteratura.challengeliteratura.repositorio.LibroRepository;

@SpringBootApplication
public class CatalogoDeLibros implements CommandLineRunner {

	@Autowired
	private LibroRepository libroRepositorio;
	@Autowired
	private AutorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(CatalogoDeLibros.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ClienteLiteratura client = new ClienteLiteratura(libroRepositorio, autorRepositorio);
		client.menu();
	}

}
