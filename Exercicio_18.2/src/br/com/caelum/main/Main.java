package br.com.caelum.main;

import br.com.caelum.modelo.Programa;

public class Main {

	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		
		// CLASSE ANONIMA - PERMITE DAR NEW NUMA INTERFACE CONTANTO QUE IMPLEMENTE O MÉTODO.
		
//		Runnable r = new Runnable() {
//			public void run() {
//				for (int i = 0; i < 10000; i++) {
//					System.out.println("Programa 3 valor: " + i);
//				}
//			}
//		};
		
		
		// Programa 1 - UTILIZANDO LAMBDA DO JAVA 8
		
		Runnable r = () -> { // é possivel pois existe apenas um metodo abstrato na interface
				for (int i = 0; i < 10000; i++) {
					System.out.println("Programa 3 valor: " + i);
				}
		};
		Thread t = new Thread(r);
		t.start();
		
		// PASSANDO LAMBDA DIRETAMENTE PARA O CONSTRUTOR DE THREAD, SEM CRIAÇÃO DE VARIAVEL TEMPORARIA
		// codigo ainda mais enxuto
		new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				System.out.println("Programa 4 valor: " + i);
		}).start();

	}

}
