package com.willsanches.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willsanches.cursomc.domain.Cliente;
import com.willsanches.cursomc.repositories.ClienteRepository;
import com.willsanches.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não econtrado! Id:"+id+", Tipo: "+Cliente.class.getName()));
	}

}
