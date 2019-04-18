package br.com.fray.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
  
public class MyApp {
  
       /**
        * @param args
        * @throws
        */
	//Convertendo para char:
       public static void main(String[] args) {
             InputStream inputstream;
             try {
                    inputstream = new FileInputStream("/tmp/input_text");
  
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