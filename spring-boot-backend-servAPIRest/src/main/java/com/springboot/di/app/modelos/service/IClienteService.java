package com.springboot.di.app.modelos.service;

import java.util.List;

import com.springboot.di.app.modelos.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Cliente cliente);

}
