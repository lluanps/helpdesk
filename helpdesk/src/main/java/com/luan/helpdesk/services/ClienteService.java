package com.luan.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luan.helpdesk.domain.Cliente;
import com.luan.helpdesk.domain.dtos.ClienteDTO;
import com.luan.helpdesk.repositories.ClienteRepository;
import com.luan.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Cliente id não encontrado! id: " + id));
	}

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente create(ClienteDTO dto) {
		Cliente save = new Cliente();
		return repository.save(save);
	}

	

}
