package com.mx.org.bbb.concentradora.servicio.transacciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConcentradoraServicioTransaccionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcentradoraServicioTransaccionesApplication.class, args);
	}

}
