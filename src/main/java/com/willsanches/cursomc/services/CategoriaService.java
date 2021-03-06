package com.willsanches.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willsanches.cursomc.domain.Categoria;
import com.willsanches.cursomc.repositories.CategoriaRepository;
import com.willsanches.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não econtrado! Id:"+id+", Tipo: "+Categoria.class.getName()));
	}

}
