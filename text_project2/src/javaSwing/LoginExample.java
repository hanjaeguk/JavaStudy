package javaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginExample {

	public static void main(String[] args) {
		JFrame f = new JFrame("Action");
		JLabel ID = new JLabel("  ID : ");
		JLabel PW = new JLabel("  PW : ");
		JTextField Fid = new JTextField(10);
		JTextField Fpw = new JTextField(10);
		
		JButton btn = new JButton("login");
		JPanel panel = new JPanel(); 
		
		panel.setLayout(new GridLayout(2,2));
		panel.add(ID);
		panel.add(Fid);
		panel.add(PW);
		panel.add(Fpw);
		panel.setSize(200,200);

		f.setLayout(new GridLayout(2,1));
		f.add(panel);
		f.add(btn);

		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Fid.getText());
				System.out.println(Fpw.getText());
			}

		});
		
		
		f.setVisible(true);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
