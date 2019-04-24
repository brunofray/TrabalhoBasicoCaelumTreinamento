package br.com.fray.stringbuild;

public class Metodos2_StringBuilder {
	 
    public static void main(String[] args) {
         
        StringBuilder buffer = new StringBuilder("Usando outros m�todos StringBuilder");
         
        
        //charAt � Aceita um argumento inteiro que representa o �ndice e retorna o caractere nessa posi��o no StringBuilder
        
        System.out.printf("buffer = %s\n", buffer.toString());
        System.out.printf("Caractere index 0: %s\nCaractere index 4: " +
                "%s\n\n",buffer.charAt(0),buffer.charAt(4));
         
        char[] charArray = new char[buffer.length()];
         
        
        //getChars � Retorna o caractere especificado
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("Os caracteres s�o: ");
         
        for(char c : charArray)
            System.out.print(c);
         
        //setCharAt � Copia caracteres de um StringBuilder no array de caracteres passado como um argumento, tendo aceita��o de at� 4 argumentos
        buffer.setCharAt(0, 'O');
        buffer.setCharAt(4, 'P');
         
        System.out.printf("\n\nbuffer = %s", buffer.toString());
        
        
        //reverse � Retorna os caracteres invertidos;
        buffer.reverse();
        System.out.printf("\n\nbuffer = %s\n", buffer.toString());
    }
}