package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96); // ���� key, �ڿ� value
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0; // �ְ� ���� ����
		int totalScore = 0;// ���� �հ� ����

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key); // �� Ű���� ���� ���� ������ ������ ���°�!!!!!!
			maxScore = Math.max(value, maxScore);
			totalScore += value;

			if (maxScore == value) {
				name = key;
			}
		}

		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�������: " + totalScore / map.size());
		System.out.println("�ְ������� ���� ���̵�: " + name);

	}

}
