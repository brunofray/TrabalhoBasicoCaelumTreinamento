package br.com.caelum.main;

public class TestaString {

	public static void main(String[] args) {

		String s = "fj11";
//		s.replaceAll("1", "2"); // TODA STRING É IMUTAVEL
		s = s.replaceAll("1", "2");
		System.out.println("SUBSTITUI TODOS OS 1 POR 2: " + s);
		System.out.println("VERIFICA SE ESTÁ VAZIA: " + s.isEmpty()); // TESTA SE ESTA VAZIA
		String d = "fj11";
		d = d.toUpperCase();
		System.out.println("DEVOLVE STRING MAIUSCULA: " + d); // DEVOLVE TUDO EM MAIUSCULO
		String e = "FJ11";
		e = e.toLowerCase();
		System.out.println("DEVOLVE STRING MINUSCULA: " + e); // DEVOLVE TUDO EM MINUSCULO
		
		String x = "7682"; // podendo alterar esse número para qualquer outro
        int num = 0;
        int total = 0;

        for (int i = x.length() - 1; i >= 0; i--) {   
          
            num = Character.getNumericValue(x.charAt(i));
            int var = x.length() - i;

            while (var > 1) {
                num = num * 10;
                var--;
            }

            total = num + total;

        }
        System.out.println("O numero é: " + total);
        
        //IMPRIME CARACTERE POR CARACTERE
        String string = "abc";
		
		for (int i = 0; i < string.length(); i++){
			
			System.out.println(string.charAt(i));
		
		}

	}

}
