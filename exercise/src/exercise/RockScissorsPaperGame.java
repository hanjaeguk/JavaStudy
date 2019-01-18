package exercise;

import java.io.*;
import java.util.Random;

public class RockScissorsPaperGame {
	BufferedReader in;
	Random random;
	String gbbStr[] = { "����", "����", "��" };

	private void game() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		random = new Random();
		while (true) {
			int com = random.nextInt(3);
			System.out.print("�Է�:");
			int my = Integer.parseInt(in.readLine());
			if (my > 2) {
				System.out.println("0 1 2 �� �ϳ��� �Է��ϼ���.");
			} else {
				int result = (my - com) % 3;

				if (result == 0) {
					System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[my] + "\t���:�̰��");
				} else if (result == 1) {
					System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[my] + "\t���:����");
				} else {
					System.out.println("��:" + gbbStr[my] + "\t��:" + gbbStr[my] + "\t���:����");
				}
				System.out.print("����(0) ���(�ƹ�Ű) : ");
				int num = Integer.parseInt(in.readLine());
				if (num == 0) {
					System.out.println("������ �����մϴ�!");
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		RockScissorsPaperGame RSP = new RockScissorsPaperGame();
		RSP.game();
	}

}
