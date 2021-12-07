package travel.management.system;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class About extends JFrame implements ActionListener{ 
	String s; 
	JButton b1;
	About(){
		setBounds(800,240,500,550); 
		setLayout(null); 
		getContentPane().setBackground(Color.WHITE); 
		JLabel l1=new JLabel("Travel  and Tourism Management System"); 
		l1.setBounds(50,10,400,80); 
		l1.setForeground(Color.RED); 
		l1.setFont(new Font("Tahoma",Font.PLAIN,20)); 
		 s = "travel management is provide facility  in one place  ivbbkjbkbbkjkkmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmllll"
				+ "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"
				+ "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
				+ "nnnnnnnnnnnnnnnnnnnn"
				+ "llllllllll   ";
				
		TextArea t1=new TextArea(s,10,40,Scrollbar.VERTICAL);  
		t1.setEditable(false); 
		t1.setBounds(20,100,450,300); 
		add(t1);
		
		add(l1);
		
		
		b1=new JButton("Back"); 
		b1.setBounds(200,420,100,25); 
		b1.addActionListener(this);
		add(b1);
	} 
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}
	public static void main(String[] args) {
		new About().setVisible(true);
	}

}
