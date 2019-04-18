package br.com.fray.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutComArray {

    /**
     * @throws IOException
     * @param args
     * @throws
     */
	//PASSA 4 VEZES DENTRO DO LAÇO, ESCREVENDO NO ARQUIVO.
    public static void main(String[] args) throws IOException {
          OutputStream output = null;
          try {
                 output = new FileOutputStream("/tmp/input_text");
                 byte[] bytes = new byte[] {'A','B', 'D', 'E'};
                 int count = bytes.length;

                 while (count >= 0) {

                        output.write(bytes);

                        count--;
                 }
                  
          }finally{                 
                 if (output != null){
                	 // FECHA A ESCRITA DO ARQUIVO, EVITANDO QUE FIQUE ABERTO
                  output.close();
                 }
          }

    }
}
