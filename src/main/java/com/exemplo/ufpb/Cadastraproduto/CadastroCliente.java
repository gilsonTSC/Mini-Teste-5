package com.exemplo.ufpb.Cadastraproduto;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

	private List<String> dadosClientes;

	public CadastroCliente() {
		this.dadosClientes = new ArrayList<String>();
	}

	public void preencherCadastro(String dado) {
		this.dadosClientes.add(dado);
	}

	public void cadastra(Formulario cadastro, String nome, String numero) {
		this.dadosClientes.add(cadastro.formulario(nome, numero));
	}

	public String getDadosCliente(int pos) {
		return this.dadosClientes.get(pos);
	}
}