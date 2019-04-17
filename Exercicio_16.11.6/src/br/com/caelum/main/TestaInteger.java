package br.com.caelum.main;

public class TestaInteger {

	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if(x1 == x2 ) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		System.out.println("X1 É IGUAL A X2 ? " + x1.equals(x2));
		
		// É POSSIVEL CONCLUIR QUE INTEGER SÓ SE COMPARA CORRETAMENTE COM EQUALS

	}

}
