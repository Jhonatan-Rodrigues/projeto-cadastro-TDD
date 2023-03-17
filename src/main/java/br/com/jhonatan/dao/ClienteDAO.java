/**
 * 
 */
package br.com.jhonatan.dao;

import br.com.jhonatan.dao.generics.GenericDAO;
import br.com.jhonatan.domain.Cliente;
 

/**
 * @author Jhonatan
 *
 */
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{
	
	public ClienteDAO() {
		super();
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

}