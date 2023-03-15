/**
 * 
 */
package br.com.jhonatan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jhonatan.dao.ClienteDAOMock;
import br.com.jhonatan.dao.IClienteDAO;
import br.com.jhonatan.domain.Cliente;
import br.com.jhonatan.services.ClienteService;
import br.com.jhonatan.services.IClienteService;

/**
 * @author Jhonatan
 *
 */
public class ClienteServiceTest {

	IClienteService clienteService;
	Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
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
		
		clienteService.salvar(cliente);
		
	}
	@Test
	public void pesquisarCliente() {
		
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
		
	}
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}

}
