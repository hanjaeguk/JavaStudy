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
		new MyFrame("������");

	}

}


class MyFrame {
	public MyFrame(String title) {
		Dimension screenSize = new Dimension();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		screenSize = toolkit.getScreenSize();
		
		
		JFrame jFrame = new JFrame(title); //��ο� ������������ â�̸�
		jFrame.setLayout(new FlowLayout());
		
		JLabel jlabel = new JLabel("Label 1 : ");
		JTextField jt = new JTextField(10);
		jt.setText("textfield");
		jt.setFont(new Font("Arial Bold",Font.ITALIC,20));
		
		jFrame.add(jlabel);
		jFrame.add(jt); // ���� �߿�
		
		
		//�Ʒ��͵��� ��������
		jFrame.setVisible(true); // ȭ���� ������
		jFrame.setSize(300, 200); // ȭ�� ����������
		jFrame.setLocation((screenSize.width/2)-300, (screenSize.height/2)-200); //ȭ�� ��ġ ����
		jFrame.setResizable(false); // ȭ�� ������ �÷ȴ� �ٿ��� ���ϰ� ��
//		jFrame.setTitle("hi~~~"); // Ÿ��Ʋ �̸� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x Ŭ���ϸ� ���α׷� ����
		
		
		



		
	}
	
}
