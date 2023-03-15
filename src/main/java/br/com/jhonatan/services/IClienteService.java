package br.com.jhonatan.services;

import br.com.jhonatan.domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

	void excluir(Long cpf);

}
