package javaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("Action");
		JLabel jid = new JLabel("  ID : ");
		JLabel jpw = new JLabel("  PW : ");
		JTextField Fid = new JTextField(10);
		JPasswordField Fpw = new JPasswordField(10);

		JButton btn = new JButton("login");
		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(2, 2));
		panel.add(jid);
		panel.add(Fid);
		panel.add(jpw);
		panel.add(Fpw);
		panel.setSize(600, 600);

		f.setLayout(new GridLayout(2, 1));
		f.add(panel);
		f.add(btn);
		f.setSize(300, 200);



		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
				String ID = "ora_user3";
				String PW = "han3";

				String query = "SELECT * FROM LOGIN";

				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}

				try {
					conn = DriverManager.getConnection(URL, ID, PW);

					stmt = conn.createStatement();

					rs = stmt.executeQuery(query);

					String dbno = null;
					String dbid = null;
					String dbpw = null;
					String count = null;
					
					while (rs.next()) {
						dbno = rs.getString(1);
						dbid = rs.getString(2);
						dbpw = rs.getString(3);
						
						String gid = Fid.getText();
						String gpw = Fpw.getText();
						if(gid.equals(dbid) && gpw.equals(dbpw)) {
							count = dbid;

						}else {

						}

					}
					if(count != null ) {
						System.out.println("로그인되었습니다.");
					}else {
						System.out.println("아이디와 비밀번호를 확인해주세요.");
					}
					
					

				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					try {
						rs.close();
						stmt.close();
						conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				


			}

		});

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
