package com.mx.org.bbb.concentradora.servicio.transacciones.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mx.org.bbb.concentradora.servicio.transacciones.models.entity.TransaccionIn;

@RepositoryRestResource(path = "transacciones-entrada")
public interface TransaccionInRepository extends PagingAndSortingRepository<TransaccionIn, Long> {

	@RestResource(path = "buscar-folio")
	public TransaccionIn findByFolio(@Param("folio") String folio);
}
