/**
 * 
 */
package br.com.jhonatan.dao;

import br.com.jhonatan.domain.Cliente;

/**
 * @author Jhonatan
 *
 */
public class ClienteDAO implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		return true;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

}