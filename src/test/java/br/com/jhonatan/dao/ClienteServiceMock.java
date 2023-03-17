package br.com.jhonatan.dao;

import java.util.Collection;

import br.com.jhonatan.domain.Cliente;
import br.com.jhonatan.services.IClienteService;

public class ClienteServiceMock implements IClienteService {

	@Override
	public Boolean cadastrar(Cliente entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
