package br.com.fray.stringbuild;

public class TestaSpringBuilder {
	public static void main(String[] args) {
		
		// M�todo append:
		// Aloca novas Strings concatenadas para o mesmo objeto, n�o s�o criadas trocas dos objetos.
		// Melhor desempenho do sistema.
        
	    StringBuilder nomes = new StringBuilder();
	        nomes.append("Carlos>").append("Maria>").append("Jos�>").append("Renata");
	         
	    System.out.println(nomes.toString());
	     
	}
}
