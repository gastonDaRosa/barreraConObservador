package com.example.barrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.barrera.modelo.AutoFantastico;
import com.example.barrera.modelo.Automovil;
import com.example.barrera.modelo.Barrera;
import com.example.barrera.modelo.Peaton;

@SpringBootApplication
public class BarreraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarreraApplication.class, args);
		System.out.println();

		System.out.println();

		testear();
	}

	private static void testear() {
		Barrera barrera = new Barrera();
		barrera.agregarObservador(new Peaton());
		barrera.agregarObservador(new Automovil());
		barrera.agregarObservador(new AutoFantastico());
		barrera.on();
	}

}
