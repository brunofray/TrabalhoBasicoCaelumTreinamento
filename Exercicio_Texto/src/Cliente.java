import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Cliente extends JFrame{

JTextArea txtEnviar;
Socket socket;
PrintWriter saida;
BufferedReader reader;
JTextArea incoming;
JTextField txtNome;
GridBagConstraints cons = new GridBagConstraints();
int i = 0;
public Cliente(){
	super(&quot;Chat Cliente&quot;);
	
	setUpNetworking();
	
	Container janela = this.getContentPane();
	janela.setLayout(new GridBagLayout());
	
	cons.gridx = 0;
	cons.gridy = 0;
	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.WEST;
	
	txtNome = new JTextField();
	txtNome.setPreferredSize(new Dimension(80,20));
	janela.add(txtNome,cons);
	
	cons.gridx = 0;
	cons.gridy = 1;
	cons.gridwidth = 6;
	cons.gridheight = 3;
	cons.weightx = 1;
	cons.weighty = 1;
	incoming = new JTextArea(12,50);
	incoming.setLineWrap(true);
	incoming.setWrapStyleWord(true);
	incoming.setEditable(false);
	
	JScrollPane scroll = new JScrollPane(incoming);
	scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scroll.setPreferredSize(new Dimension(400,200));
	scroll.setMinimumSize(new Dimension(200,80));
	janela.add(scroll,cons);

	cons.fill = GridBagConstraints.BOTH;
	cons.gridx = 0;
	cons.gridy = 5;
	cons.gridwidth = 1;
	cons.gridheight = 2;
	cons.weightx = 0.7;
	cons.weighty = 0.7;
	txtEnviar = new JTextArea(1,20);
	txtEnviar.setLineWrap(true);
	txtEnviar.setWrapStyleWord(true);
	
	JScrollPane scrollEnvia = new JScrollPane(txtEnviar);
	scrollEnvia.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	scrollEnvia.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scrollEnvia.setPreferredSize(new Dimension(200,60));
	scrollEnvia.setMinimumSize(new Dimension(100,30));
	
	janela.add(scrollEnvia,cons);
	
	cons.gridx = 3;
	cons.gridy = 5;
	cons.gridheight = 1;
	cons.weightx = 0.3;
	cons.weighty = 0;
	JButton btn = new JButton(&quot;Enviar&quot;);
	btn.addActionListener(new Enviar());
	janela.add(btn,cons);
	
	Thread thread = new Thread(new IncomingReader());
    thread.start();
    
    this.addWindowListener(new Janela());
    
}

public void setUpNetworking(){
	try {
		socket = new Socket(&quot;127.0.0.1&quot;, 4242);
		InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
		reader = new BufferedReader(streamReader);
		saida = new PrintWriter(socket.getOutputStream());
		System.out.println(&quot;Conexão estabelecida...&quot;);
		
	} catch (UnknownHostException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

public static void main(String [] args){
	Cliente cli = new Cliente();
	cli.setSize(400,300);
	cli.setLocationRelativeTo(null);
	//cli.setResizable(false);
	cli.setState(JFrame.MAXIMIZED_BOTH);
	cli.setVisible(true);
	cli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
class IncomingReader implements Runnable{

	@Override
	public void run() {
					
		try {
            String msg = &quot;&quot;;
            while (msg != null){
            	msg = reader.readLine();
                incoming.append(msg+&quot;\n&quot;);
            }
            
        } 
		catch (IOException e) {
            // caso ocorra alguma exceção de E/S, mostra qual foi.
            System.out.println(&quot;Ocorreu uma Falha... .. .&quot; + &quot; IOException: &quot; + e);
        }
		
	}
}

class Enviar implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(txtNome.getText().trim().length() &lt;= 2){
			JOptionPane.showMessageDialog(null, &quot;O seu nome não pode ficar em branco&quot;);
		}
		else{
			txtNome.setEnabled(false);
			if(txtNome.getText().trim().length() &gt;= 2 && i == 0){
				saida.println(txtNome.getText());
				saida.flush();
				i++;
			}
			else{
				if(txtEnviar.getText().trim().length() &gt;= 1){
					try{
						SimpleDateFormat sdf = new SimpleDateFormat(&quot;dd/MM/yyyy kk:mm:ss&quot;);
						
						saida.println(txtNome.getText()+&quot; escreveu: &quot;+txtEnviar.getText() +&quot;\n             &quot; +
							&quot;em &quot;+sdf.format(new Date())+&quot;\n&quot;);
						saida.flush();
					}
					catch(Exception e1){
						e1.printStackTrace();
					}
					txtEnviar.setText(&quot;&quot;);
					txtEnviar.requestFocus();
				}
			}
		}
	}
}

class Janela implements WindowListener{

	@Override
	public void windowOpened(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent paramWindowEvent) {
		
	}

	@Override
	public void windowClosed(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent paramWindowEvent) {
		// TODO Auto-generated method stub
		
	}
	
}
}