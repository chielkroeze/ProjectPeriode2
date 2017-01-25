//Grafische omgeving.
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JButton;

public class BasicSwing extends JFrame{
	
	JPanel p=new JPanel();
	JButton b=new JButton("Hello");
	
	
	public static void main(string[] args){
		new BasicSwing();
	}
	
	public BasicSwing(){
		super("Basic swing app");
		
		setSize(400,300);
		setResizable(true);
		
		p.add(b);
		add(p);
		
		
		setVisible(true);
	}
}