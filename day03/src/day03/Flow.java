package day03;

import java.util.Scanner;

public class Flow {
	public static void main(String[] args) {
		int num = 0; // int �ʱⰪ = 0
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ū �� �Է��ϼ��� : ");
		num=sc.nextInt();
		String result = num>10?"���߾��~" : "���� 10���� ū�� �Է��ϼ��� ~~";
		System.out.println(result);
	}
}
