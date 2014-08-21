package com.exemplo.ufpb.Cadastraproduto;

import static org.junit.Assert.*;

import org.junit.*;

public class CadastraClienteTest {

	private CadastroCliente clientes;
	
	@Before
	public void criarCadastro(){
		this.clientes = new CadastroCliente();
	}
	
	@Test
	public void cadastraClienteNormalTest(){
		this.clientes.cadastra(new FormularioNormal(),"Gilson", "91523426");
		assertEquals("Nome: Gilson\nNúmero: 91523426\nCategoria: Normal", this.clientes.getDadosCliente(0));
	}

	@Test
	public void cadastraClienteVipTest(){
		this.clientes.cadastra(new FormularioVip(),"Gilson", "91523426");
		assertEquals("Nome: Gilson\nNúmero: 91523426\nCategoria: Vip", this.clientes.getDadosCliente(0));
	}
}