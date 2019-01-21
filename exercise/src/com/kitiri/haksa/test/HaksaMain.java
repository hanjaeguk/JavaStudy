package com.kitiri.haksa.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HaksaMain {
	static BufferedReader in;
	public static void main(String[] args) throws IOException {
		System.out.println("==========메뉴선택==========");
		System.out.println("1.등록");
		System.out.println("2.찾기");
		System.out.println("3.삭제");
		System.out.println("4.전체 출력");
		System.out.println("------------");
		System.out.println("0.종료");
		System.out.println("------------");
		System.out.print("번호를 선택해 주세요..");
		in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());




	}

}
