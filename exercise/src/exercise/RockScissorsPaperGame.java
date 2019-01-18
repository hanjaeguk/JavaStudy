package exercise;

import java.io.*;
import java.util.Random;

public class RockScissorsPaperGame {
	BufferedReader in;
	Random random;
	String gbbStr[] = { "가위", "바위", "보" };

	private void game() throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		random = new Random();
		while (true) {
			int com = random.nextInt(3);
			System.out.print("입력:");
			int my = Integer.parseInt(in.readLine());
			if (my > 2) {
				System.out.println("0 1 2 중 하나만 입력하세요.");
			} else {
				int result = (my - com) % 3;

				if (result == 0) {
					System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[my] + "\t결과:이겼다");
				} else if (result == 1) {
					System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[my] + "\t결과:졌다");
				} else {
					System.out.println("나:" + gbbStr[my] + "\t컴:" + gbbStr[my] + "\t결과:비겼다");
				}
				System.out.print("종료(0) 계속(아무키) : ");
				int num = Integer.parseInt(in.readLine());
				if (num == 0) {
					System.out.println("게임을 종료합니다!");
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
