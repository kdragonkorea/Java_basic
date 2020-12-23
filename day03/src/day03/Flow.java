package day03;

import java.util.Scanner;

public class Flow {
	public static void main(String[] args) {
		int num = 0; // int 초기값 = 0
		Scanner sc = new Scanner(System.in);
		System.out.println("10보다 큰 수 입력하세요 : ");
		num=sc.nextInt();
		String result = num>10?"잘했어요~" : "제발 10보다 큰수 입력하세요 ~~";
		System.out.println(result);
	}
}
