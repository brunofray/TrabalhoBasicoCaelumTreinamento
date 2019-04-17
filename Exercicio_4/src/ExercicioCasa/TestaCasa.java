package ExercicioCasa;

public class TestaCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.cor = "Azul";
		casa.abreP1();
		casa.fechaP2();
		casa.abreP3();
		casa.pinta("Amarelo");
		casa.fechaP3();
		casa.abreP2();
		casa.abreP3();
		casa.fechaP1();
		
		System.out.println("A casa está pintada na cor: " + casa.cor + " e " + casa.quantasPortasEstaoAbertas() + " portas estão abertas!");
	}

}
