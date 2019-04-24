package br.com.fray.stringbuild;

public class Metodos2_StringBuilder {
	 
    public static void main(String[] args) {
         
        StringBuilder buffer = new StringBuilder("Usando outros métodos StringBuilder");
         
        
        //charAt – Aceita um argumento inteiro que representa o índice e retorna o caractere nessa posição no StringBuilder
        
        System.out.printf("buffer = %s\n", buffer.toString());
        System.out.printf("Caractere index 0: %s\nCaractere index 4: " +
                "%s\n\n",buffer.charAt(0),buffer.charAt(4));
         
        char[] charArray = new char[buffer.length()];
         
        
        //getChars – Retorna o caractere especificado
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("Os caracteres são: ");
         
        for(char c : charArray)
            System.out.print(c);
         
        //setCharAt – Copia caracteres de um StringBuilder no array de caracteres passado como um argumento, tendo aceitação de até 4 argumentos
        buffer.setCharAt(0, 'O');
        buffer.setCharAt(4, 'P');
         
        System.out.printf("\n\nbuffer = %s", buffer.toString());
        
        
        //reverse – Retorna os caracteres invertidos;
        buffer.reverse();
        System.out.printf("\n\nbuffer = %s\n", buffer.toString());
    }
}