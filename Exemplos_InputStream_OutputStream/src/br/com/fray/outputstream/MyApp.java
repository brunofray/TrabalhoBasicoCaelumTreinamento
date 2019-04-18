package br.com.fray.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyApp {
	  /**
     * @param args
     * @throws
     */
    public static void main(String[] args) {
          try {
                 OutputStream output = new FileOutputStream("/tmp/input_text");
                 String s = "ABCDE";
                 int count = s.length()-1;

                 while (count >= 0) {

                        output.write(s.charAt(count));

                        count--;
                 }
                 output.close();
          } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
          }

    }
}
