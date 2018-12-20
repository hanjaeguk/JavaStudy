package javaSwing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonExample {

	public static void main(String[] args) {

//		JFrame f = new JFrame();
//		JButton btn = new JButton("Press");
//
//		f.add(btn);
//
//		f.setVisible(true);
//		f.setSize(200, 100);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		for (int i = 0; i < 10; i++) {
//			btn.setText(String.valueOf(i)); // ¼ýÀÚ¸¦ ½ºÆ®¸µÀ¸·Î ¹Ù²Ù±â
//			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
//
//		}
		
		new Login();

	} // main

}

class Login{
	public Login() {
		JFrame f = new JFrame("Login");
		JLabel ID = new JLabel("  ID : ");
		JLabel PW = new JLabel("  PW : ");
		JTextField Fid = new JTextField(10);
		JTextField Fpw = new JTextField(10);
//		f.setLayout(new FlowLayout()); // ¼ø¼­´ë·Î ÂøÂøÂø
		f.setLayout(new GridLayout(2,2)); // 4µîºÐÇØ¼­ Å¹Å¹
		
		f.add(ID);
		f.add(Fid);
		f.add(PW);
		f.add(Fpw);
		
		f.setSize(180, 200);
		f.setVisible(true);
		
		
		
	}
}









