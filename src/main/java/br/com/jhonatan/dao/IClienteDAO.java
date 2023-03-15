/**
 * 
 */
package br.com.jhonatan.dao;

import br.com.jhonatan.domain.Cliente;

/**
 * @author Jhonatan
 *
 */
public interface IClienteDAO {

	Boolean salvar(Cliente cliente);
	Cliente buscarPorCpf(Long cpf);
	void excluir(Long cpf);


}
