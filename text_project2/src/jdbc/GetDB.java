package jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class GetDB {

	public static void main(String[] args) {
		String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String ID = "ora_user3";
		String PW = "han3";

		String query = "SELECT * FROM LOGIN";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String filePath = "c:/Enrol Data";
		String fileName = "/enrol.txt";
		File dir = new File(filePath);
		File file = new File(filePath + fileName);

		if (dir.exists() == false) {	
			dir.mkdirs();
		}else {
			System.out.println("같은이름의 폴더가 이미 존재합니다.");
		}

		// DB 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // 1try end

		// DB USER 접속
		try {
			conn = DriverManager.getConnection(URL, ID, PW);

			stmt = conn.createStatement();

			rs = stmt.executeQuery(query);

			String subNo = null;
			String stuNo = null;
			String enrGrade = null;
			String set = null;

			byte[] writeBytes = new byte[1024];
			FileOutputStream fos = new FileOutputStream(file);

			while (rs.next()) {
				subNo = rs.getString(1);
				stuNo = rs.getString(2);
				enrGrade = rs.getString(3);

				set = subNo + " " + stuNo + " " + enrGrade + " " + "\r\n";

				writeBytes = set.getBytes();
				try {
					fos.write(writeBytes, 0, writeBytes.length);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(subNo + " " + stuNo + " " + enrGrade);
			}				
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // 2try end

	}

}
		