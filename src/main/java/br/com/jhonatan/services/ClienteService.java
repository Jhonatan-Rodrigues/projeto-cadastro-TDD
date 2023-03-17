/**
 * 
 */
package br.com.jhonatan.services;

import br.com.jhonatan.dao.ClienteDAO;
import br.com.jhonatan.dao.IClienteDAO;
import br.com.jhonatan.domain.Cliente;

/**
 * @author Jhonatan
 *
 */
public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO ;
	}

	@Override
	public Boolean salvar(Cliente cliente) {
		return clienteDAO.cadastrar(cliente);
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) {
		clienteDAO.alterar(cliente);
	}
	

}
