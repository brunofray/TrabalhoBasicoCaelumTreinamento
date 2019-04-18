package br.com.fray.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedExemplo {
	/**
     * @param args
     * @throws
     */
	// O BufferedInputStream le um bloco inteiro de bytes de uma vez só.
	// Armazena 8192 bytes em um buffer, portanto mais velocidade.
    public static void main(String[] args) {
          InputStream inputstream;
          try {
                 inputstream = new BufferedInputStream(
                 new FileInputStream("/tmp/input_text"));

                 int data = inputstream.read();
                 while (data != -1) {
                        System.out.println((char) data);

                               data = inputstream.read();

                 }
                 inputstream.close();
          } catch (FileNotFoundException e1) {
                 // TODO Auto-generated catch block
                 e1.printStackTrace();
          } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
          }

    }
}
