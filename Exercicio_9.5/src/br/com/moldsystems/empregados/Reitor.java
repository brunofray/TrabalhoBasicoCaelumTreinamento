package br.com.moldsystems.empregados;

public class Reitor extends EmpregadoDaFaculdade{
	// qualquer informacao adicional
	
	@Override
	public String getInfo() {
		return super.getInfo() + " e ele é um reitor";
	}
}
