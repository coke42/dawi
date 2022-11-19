package com.edu.cibertec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Semana5Application implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Semana5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pass_user = "user";
		String pass_admin = "admin";
		
		System.out.println("La clave del usuario user es: " + passEncoder.encode(pass_user));
		System.out.println("La clave del usuario admin es: " + passEncoder.encode(pass_admin));
	}

}
