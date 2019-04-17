package ExercicioPorta;

public class TestaPorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		porta.cor = "Azul";
		porta.aberta = true;
		
		porta.fecha();
		porta.estaAberta();
		porta.abre();
		porta.estaAberta();
		porta.pinta("Preto");
		porta.pinta("Vermelho");
		porta.dimensaoX = 2.0;
		porta.dimensaoY = 5.0;
		porta.dimensaoZ = 3.2;
		
		System.out.println("A porta é de cor: " + porta.cor + " e está: " + porta.aberta);
		System.out.println("Dimensões da porta: X: " + porta.dimensaoX + " Y: " + porta.dimensaoY + " Z: " + porta.dimensaoZ);

	}

}
