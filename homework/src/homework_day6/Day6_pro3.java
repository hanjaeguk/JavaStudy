package homework_day6;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
//			int num = i % 30 + 1;
//			boolean isKwang = (i <= 30) && (num == 3 || num == 6 || num == 9 || num == 13 || num == 16 || num == 19
//					|| num == 23 || num == 26 || num == 29);
			boolean isKwang = false;
			int num = i + 1;
			int t = num;
			while (t > 0) {
				t %= 10;
				if (t % 3 == 0 && t != 0) {
					isKwang = true;
					break;
				}
				num /= 10;
				t = num;
			}
			num = i + 1;

			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");

	}
}

public class Day6_pro3 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}

}
