package br.com.fray.scanner;

import java.util.Scanner;

public class ContaTokens {
  public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    
    // MÉTODOS INVOCADOS DA CLASSE SCANNER
//    float numF = sc.nextFloat();
//    int num1 = sc.nextInt();
//    byte byte1 = sc.nextByte();
//    long lg1 = sc.nextLong();
//    boolean b1 = sc.nextBoolean();
//    double num2 = sc.nextDouble();
//    String nome = sc.nextLine();
    
    System.out.print("Digite um texto:");
    while(sc.hasNext()){
      i++;
      System.out.println("Token: "+sc.next());
    }
    sc.close(); //Encerra o programa
  }
}