package br.com.moldsystems.pessoa;

import br.com.caelum.contas.Autenticavel;

public class Cliente implements Autenticavel{
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;

	public void mudaCPF(String cpf) {
		if (this.idade <= 60) {
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}

	private void validaCPF(String cpf) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
