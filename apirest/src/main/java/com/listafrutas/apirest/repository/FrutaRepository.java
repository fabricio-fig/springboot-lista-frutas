package com.listafrutas.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listafrutas.apirest.models.Fruta;

public interface FrutaRepository extends JpaRepository<Fruta, Long>{
	Fruta findById(long id); 
}
