package com.exemplo.ufpb.Cadastraproduto;

public class FormularioNormal implements Formulario {

	public String formulario(String nome, String numero) {
		String result = "";

		result += "Nome: " + nome + "\n" + "Número: " + numero + "\n"
				+ "Categoria: " + "Normal";
		return result;
	}

}
