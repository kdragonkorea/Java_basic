package day03;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		//숫자 두개 입력받아서 비교후
		
		//num1이 큽니다.
		//num2가 큽니다.
		//두 수가 같습니다.
		
		
		//입력
			//정수 2개 입력
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//처리
			//두 수 비교
				//첫번째수>두번째수
		String result=num1>num2?"num1이 큽니다.":
			(num1<num2? "num2가 큽니다.":"두 수가 같습니다.");
				//아닐때
					//첫번째수<두번째수
					//첫번째수==두번째수
		//출력
			//경우에 맞는 문자열 출력
		System.out.println(result);
	}
}