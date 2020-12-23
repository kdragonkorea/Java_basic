package day02;

import java.util.Scanner; 	//Scanner 작성시 자동완성 사용!

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("이름 : ");
		//String name=sc.next();
		//System.out.println(name+"님 안녕하세요");
		
//		System.out.print("정수 입력 : ");
//		int data = sc.nextInt();
//		System.out.println("결과 : "+(data+5));
		
		//복습_2020-12-22
		System.out.print("이름: "); //입력값을 '이름'으로 설정
		String name=sc.next(); // String(문자)값은 name으로 지정
		System.out.println(name+"님 안녕하세요"); // 일반 name변수로 입력 후 출력
		System.out.println("\'"+name+"\'님 안녕하세요"); // \'을 사용하여 입력 후 출력
		
		System.out.print("나이(정수)를 입력하세요: ");
		int i = sc.nextInt(); // nextInt를 사용하여 정수만 출력이 가능
		System.out.println("입력한 나이(정수)는"+i+"입니다."); //정수 i를 입력 후 출력
		System.out.print("입력한 나이(정수)는\'"+i+"\'입니다."); // \'을 사용하여 입력 후 출력
		

	}
}
