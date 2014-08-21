package com.exemplo.ufpb.Cadastraproduto;

public class FormularioVip implements Formulario {

	public String formulario(String nome, String numero) {
		String result = "";

		result += "Nome: " + nome + "\n" + "Número: " + numero + "\n"
				+ "Categoria: " + "Vip";
		return result;
	}
}