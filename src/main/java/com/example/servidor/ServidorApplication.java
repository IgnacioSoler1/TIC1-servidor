package com.example.servidor;

import com.example.servidor.models.UsuarioModel;
import com.example.servidor.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServidorApplication {
	@Autowired
	UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(ServidorApplication.class, args);
		UsuarioModel usuario = new UsuarioModel("Igna", "ignasoler@gmail.com", 9678);

	}

}
