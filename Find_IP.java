import java.awt.*;
import java.awt.event.*;

public class Find_IP extends Frame implements ActionListener {
	TextField tf;
	Label lb; 
	Button b;
	Find_IP(){
		tf = new TextField();
		lb = new Label();
		b = new Button("Find IP");
		b.addActionListener(this);
		add(b);
		add(tf);
		add(lb);
		setSize(500,600);
		setLayout(null);
		setVisible(true);
		tf.setBounds(50,50, 150,20);
		lb.setBounds(60,100, 250,20);
		b.setBounds(50,150,60,30);
		
	}
  
	public void actionPerformed(ActionEvent e)
	{
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			lb.setText("ip of " +host+" is: "+ip);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
       new Find_IP();
		} }
