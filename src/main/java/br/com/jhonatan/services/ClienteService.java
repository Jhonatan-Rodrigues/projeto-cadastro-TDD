/**
 * 
 */
package br.com.jhonatan.services;

import br.com.jhonatan.dao.IClienteDAO;
import br.com.jhonatan.dao.generics.GenericService;
import br.com.jhonatan.domain.Cliente;

/**
 * @author Jhonatan
 *
 */
public class ClienteService extends GenericService<Cliente> implements IClienteService {
	
	
	public ClienteService(IClienteDAO clienteDAO) {
		super();
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	

	

}
