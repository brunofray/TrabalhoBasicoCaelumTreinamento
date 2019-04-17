package br.com.moldsystems.pessoa;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	/*
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	*/
	// 10.3 - Método da classe não sera chamado, sempre cairá nas classes filhas.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
