/**
 * 
 */
package br.com.jhonatan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jhonatan.dao.ClienteServiceMock;
import br.com.jhonatan.domain.Cliente;
import br.com.jhonatan.services.IClienteService;

/**
 * @author Jhonatan
 *
 */
public class ClienteServiceTest {

	IClienteService clienteService;
	Cliente cliente;
	
	public ClienteServiceTest() {
		clienteService = new ClienteServiceMock();
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
		
		clienteService.cadastrar(cliente);
		
	}
	@Test
	public void pesquisarCliente() {

		Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);

	}
	@Test
	public void salvarCliente() {
		Boolean retorno = clienteService.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	@Test
	public void alterarrCliente() {
		cliente.setNome("Drack");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Drack", cliente.getNome());
	}

}
