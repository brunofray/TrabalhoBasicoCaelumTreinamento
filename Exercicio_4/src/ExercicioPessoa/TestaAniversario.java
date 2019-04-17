package ExercicioPessoa;

public class TestaAniversario {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.idade = 23;
		pessoa.nome = "Bruno";
		pessoa.fazAniversario();
		System.out.println("Parabens " + pessoa.nome + ", voce está fazendo " + pessoa.idade);

	}

}
