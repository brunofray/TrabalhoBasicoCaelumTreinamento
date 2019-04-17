import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Servidor{

JLabel lblNome;
String string = &quot;&quot;;
InputStreamReader stream;
ArrayList clienteOutPutSteams, cliente;

ServerSocket servidor;

public void go(JFrame f){
	clienteOutPutSteams = new ArrayList();
	cliente = new ArrayList();
	try{
		servidor = new ServerSocket(4242);
		
		while(true){
		
			Socket sock = servidor.accept();
			PrintWriter write = new PrintWriter(sock.getOutputStream());
			clienteOutPutSteams.add(write);
			InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
			BufferedReader read = new BufferedReader(isReader);
			
			cliente.add(read.readLine());
			System.out.println(cliente);
			
			Thread t = new Thread(new ClienteHandler(sock));
			t.start();
		
			System.out.println(&quot;Conectado...&quot;);
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}

public Servidor(){
	JFrame frm = new JFrame();
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setSize(160, 160);
	frm.setVisible(true);
	frm.setLocationRelativeTo(null);
	frm.setResizable(false);
	lblNome = new JLabel(&quot;Conexão estabelecida ...&quot;);
	frm.getContentPane().add(lblNome);
	go(frm);
}
  
public static void main(String [] args){
	new Servidor();
}

public class ClienteHandler implements Runnable{
	BufferedReader reader;
	Socket socket;
	
	public ClienteHandler(Socket sock) {
		try {
			socket = sock;
			InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
			reader = new BufferedReader(isReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			String texto = &quot; &quot;;
			while((texto = reader.readLine()) != null){
				
				File file = new File(&quot;ArquivoJava.txt&quot;);
				FileWriter f = new FileWriter(file,true);
				FileWriter fos = new FileWriter(&quot;ArquivoJava.txt&quot;,true);  // Perceba que estamos instanciando uma classe aqui. A FileOutputStream. Pesquise sobre ela!  

				fos.write(texto); 
				fos.write(&quot;\n&quot;);
				fos.close();
				f.close();
				falarTodos(texto);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void falarTodos(String msg){
		try {
			
			@SuppressWarnings(&quot;rawtypes&quot;)
			java.util.Iterator it =  clienteOutPutSteams.iterator();
			while (it.hasNext()) {
				try{
					PrintWriter write = (PrintWriter) it.next(); 
					write.println(msg);
					write.flush();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
        }
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
}