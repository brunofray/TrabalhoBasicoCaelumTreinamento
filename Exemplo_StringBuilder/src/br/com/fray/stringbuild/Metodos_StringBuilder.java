package br.com.fray.stringbuild;

public class Metodos_StringBuilder {
	 
    public static void main(String[] args) {
         
        StringBuilder buffer = new StringBuilder("Jo�o Silveira Batista");
        System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + " +
                "16(valor inicial padr�o)) = %d\n\n",
                buffer.toString(),buffer.length(),buffer.length(),buffer.capacity());
        //length - Retorna o n�mero de caracteres atualmente em um StringBuilder
        //capacity � Retorna o n�mero de caracteres que pode ser armazenado em um StringBuilder sem alocar mais mem�ria
        
        //ensureCapacity � Garante que um StringBuilder tenha pelo menos a capacidade especificada
        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
        buffer.ensureCapacity(75);
        System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());
         
        
        //setLength � Aumenta ou diminui o comprimento de uma StringBuilder
        //REDEFINE O TAMANHO, N�O APARECENDO OS CARACTERES 
        // SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
        buffer.setLength(10);
        System.out.printf("Novo tamanho = %d\n buffer = %s\n",buffer.length(), 
                buffer.toString());
    }
}