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

	public void cadastra(TipoFormulario tipo, String nome, String numero) {
		String result = "";

		switch (tipo) {
		case VIP:
			result += "Nome: " + nome + "\n" + "Número: " + numero + "\n"
					+ "Categoria: " + "Vip";
			break;
		case NORMAL:
			result += "Nome: " + nome + "\n" + "Número: " + numero + "\n"
					+ "Categoria: " + "Normal";
			break;
		}
		this.dadosClientes.add(result);
	}

	public String getFormulario(int pos) {
		return this.dadosClientes.get(pos);
	}
}