package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	/*
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		this.conta = new Conta();
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	*/
	// 10.6 - Atualização ja que Conta agora é abstract e não pode ser instanciada diretamente
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
			this.conta.setAgencia(evento.getString("agencia"));
			this.conta.setNumero(evento.getInt("numero"));
			this.conta.setTitular(evento.getString("titular"));
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
			this.conta.setAgencia(evento.getString("agencia"));
			this.conta.setNumero(evento.getInt("numero"));
			this.conta.setTitular(evento.getString("titular"));
		}
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(destino, evento.getDouble("valorTransferencia"));
	}
	
	// 15.6.2
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
	}
	
	// 16.11.1
	
	public void salvaDados(Evento evento) {
		List<Conta> contas = evento.getLista("listaContas");
		RepositorioDeContas repositorio = new RepositorioDeContas();
		repositorio.salva(contas);
	}
	
	public List<Conta> carregaDados(){
		RepositorioDeContas repositorio = new RepositorioDeContas();
		return repositorio.carrega();
	}
}
