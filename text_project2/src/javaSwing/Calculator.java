package javaSwing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new GridLayout(4,4));
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btnX = new JButton("*");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btnd = new JButton("/");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnm = new JButton("-");
		JButton btns = new JButton("*");
		JButton btn0 = new JButton("0");
		JButton btnq = new JButton("#");
		JButton btnp = new JButton("+");
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btnX);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		f.add(btnd);
		f.add(btn7);
		f.add(btn8);
		f.add(btn9);
		f.add(btnm);
		f.add(btns);
		f.add(btn0);
		f.add(btnq);
		f.add(btnp);
		
		f.setSize(180, 200);
		f.setVisible(true);

	}

}
