package com.listafrutas.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listafrutas.apirest.models.Fruta;
import com.listafrutas.apirest.repository.FrutaRepository;

@RestController
@RequestMapping(value="/api")
public class FrutaResource {
	@Autowired
	FrutaRepository frutaRepository;
	
	@GetMapping("/frutas")
	public List<Fruta> listaFrutas(){
		return frutaRepository.findAll();
	}
	@GetMapping("/fruta/{id}")
	public Fruta listaFrutaUnica(@PathVariable(value="id") long id){
		return frutaRepository.findById(id);
	}
	@PostMapping("/salvarFruta")
	public Fruta salvaFruta(@RequestBody Fruta fruta) {
		return frutaRepository.save(fruta);
	}
	@DeleteMapping("/deletar")
	public void deletarFruta(@RequestBody Fruta fruta) {
		frutaRepository.delete(fruta);
	}
	@PutMapping("/atualizar")
	public Fruta editarFruta(@RequestBody Fruta fruta) {
		return frutaRepository.save(fruta);
	}
}
