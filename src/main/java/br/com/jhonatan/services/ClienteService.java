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

		return true;
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.buscarPorCpf(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}
	

}
