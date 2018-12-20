package javaSwing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swingtest {

	public static void main(String[] args) {
		new MyFrame("하하하");

	}

}


class MyFrame {
	public MyFrame(String title) {
		Dimension screenSize = new Dimension();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		screenSize = toolkit.getScreenSize();
		
		
		JFrame jFrame = new JFrame(title); //헬로우 제이프레임이 창이름
		jFrame.setLayout(new FlowLayout());
		
		JLabel jlabel = new JLabel("Label 1 : ");
		JTextField jt = new JTextField(10);
		jt.setText("textfield");
		jt.setFont(new Font("Arial Bold",Font.ITALIC,20));
		
		jFrame.add(jlabel);
		jFrame.add(jt); // 순서 중요
		
		
		//아래것들은 마지막에
		jFrame.setVisible(true); // 화면을 보여줘
		jFrame.setSize(300, 200); // 화면 사이즈조정
		jFrame.setLocation((screenSize.width/2)-300, (screenSize.height/2)-200); //화면 위치 조정
		jFrame.setResizable(false); // 화면 사이즈 늘렸다 줄였다 못하게 함
//		jFrame.setTitle("hi~~~"); // 타이틀 이름 지정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 클릭하면 프로그램 종료
		
		
		



		
	}
	
}
