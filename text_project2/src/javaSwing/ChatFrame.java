package javaSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrame {

	public static void main(String[] args) {
		JFrame chatFrame = new JFrame("chatFrame");
		
		chatFrame.setVisible(true);
		chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar =new JMenuBar(); // 메뉴바 생성
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");
		
		menubar.add(file);
		menubar.add(help);
		
		//메뉴바 안에 메뉴 목록 생성
		JMenuItem newFile = new JMenuItem("New"); 
		JMenuItem saveFile = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem info = new JMenuItem("Information");
		
		file.add(newFile);
		file.add(saveFile);
		file.add(exit);
		help.add(info);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextField tf = new JTextField(20);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		JTextArea ta = new JTextArea();
		
		chatFrame.add(menubar,BorderLayout.NORTH);
		chatFrame.add(ta,BorderLayout.CENTER);
		chatFrame.add(panel,BorderLayout.SOUTH);
		
		
		chatFrame.setSize(400,300);
		
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = tf.getText();
				ta.setText(temp);
			}
			
			
		});
		
		
		
		
		
		
		
		
		
		
	}

}
