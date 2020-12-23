package day03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?");
		System.out.println("1. C언어\n2. Java\n3. 망둥어\n4. 파이썬");
		
		int choice=sc.nextInt();
		if(choice==3){
			//정답일때
			System.out.println("정답입니다.");
		}else if(choice==1 || choice==2 || choice==4) {
			//오답일때
			System.out.println("오답입니다");
		}else {
			//잘못 입력했을때
			System.out.println("잘못 입력하셨습니다.");
		}
			
		
	}
}
