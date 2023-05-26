import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));	 
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		JLabel la = new JLabel("Hello Java!");
		la.setSize(100, 20);
		la.setLocation(100, 50);
		add(la);
	}		
}

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		super("Open Challenge 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 200);
		setVisible(true);
	}
		
	public static void main(String[] arg) {
		new OpenChallenge();
	}
}