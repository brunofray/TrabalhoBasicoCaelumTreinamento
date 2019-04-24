package br.com.fray.stringbuild;

public class Construtores_StringBuilder {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(5655);
        StringBuilder buffer3 = new StringBuilder("Texto Qualquer");
         
        System.out.printf("buffer1 = \"%s\"\n", buffer1.toString());
        System.out.printf("buffer2 = \"%s\"\n", buffer2.toString());
        System.out.printf("buffer3 = \"%s\"\n", buffer3.toString());
    }
}