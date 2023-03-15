package br.com.jhonatan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jhonatan.dao.ClienteDAOMock;
import br.com.jhonatan.dao.IClienteDAO;
import br.com.jhonatan.domain.Cliente;

public class ClienteDAOTest {
	IClienteDAO clienteDAO;
	Cliente cliente;

	public ClienteDAOTest() {
		clienteDAO = new ClienteDAOMock();
	}

	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(1234567891L);
		cliente.setNome("Jhonatan");
		cliente.setCidade("Guarujá");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(13996988282L);

	}

	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteDAO.buscarPorCpf(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);

	}
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteDAO.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
	}

}
