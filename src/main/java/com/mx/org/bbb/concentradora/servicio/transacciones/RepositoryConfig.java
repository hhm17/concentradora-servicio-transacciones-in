package com.mx.org.bbb.concentradora.servicio.transacciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.mx.org.bbb.concentradora.servicio.transacciones.models.entity.TransaccionIn;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(TransaccionIn.class);
	}

	
	
}
