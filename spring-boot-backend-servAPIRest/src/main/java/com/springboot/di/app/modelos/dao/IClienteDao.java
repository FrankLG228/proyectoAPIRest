package com.springboot.di.app.modelos.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.di.app.modelos.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}

