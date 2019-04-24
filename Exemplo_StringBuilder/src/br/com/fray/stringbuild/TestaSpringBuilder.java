package br.com.fray.stringbuild;

public class TestaSpringBuilder {
	public static void main(String[] args) {
		
		// Método append:
		// Aloca novas Strings concatenadas para o mesmo objeto, não são criadas trocas dos objetos.
		// Melhor desempenho do sistema.
        
	    StringBuilder nomes = new StringBuilder();
	        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");
	         
	    System.out.println(nomes.toString());
	     
	}
}
