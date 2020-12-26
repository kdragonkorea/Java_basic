package day06;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next(); 통채로가 문자열값
		MethodTest m = new MethodTest();
		System.out.println(m.f(3));
		m.print99Dan(1);
		m.print99Dan(7);
		m.print99Dan(11);
		m.print99Dan(13);
		m.print99Dan(22);
		System.out.println(m.plus(10,  5));
		System.out.print(m.plus(10,  5));
		System.out.println(m.plus(10,  4));
		m.info();
	}	
	
	//f(x)의 기본 메소드 만들기
	int f(int x){
		return 2*x+1;
	}
	//구구단 한 단 출력하는 메소드
	void print99Dan(int dan){
		System.out.println(dan+"단 출력 시작!");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+" X "+i+" = "+i*dan);
		}
		System.out.println(dan+"단 출력 끝!");
	}
	//두 정수의 덧셈결과를 구해주는 메소드
	int plus(int num1, int num2) {
		int result = num1+num2;
		System.out.println("두 정수의 덧셈 메소드 입니다. ");
		return result;
	}
	//내소개 하는 메소드
		void info() {
			System.out.println("제 이름은 홍길동 입니다.");
			System.out.println("제 이름은 홍길 입니다.");
			System.out.println("제 이름은 홍 입니다.");
		}
}