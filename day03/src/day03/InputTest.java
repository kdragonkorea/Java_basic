package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("이름 입력 : ");
		//String name=sc.next();
		//System.out.println(name+"님 안녕하세요");
		//sc.nextLine(); // nextLine()을 사용할 경우에는 입력해야한다. 
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.println(addr);
			
	}
}
