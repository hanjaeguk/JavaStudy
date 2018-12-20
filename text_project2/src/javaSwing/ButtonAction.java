package javaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonAction {
	static int cnt = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("Action");

		JButton btn = new JButton("start");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				++cnt;
				btn.setText(String.valueOf(cnt));
			}

		});
		
		f.add(btn);
		
		f.setSize(100,100);
		f.setVisible(true);

	}
}