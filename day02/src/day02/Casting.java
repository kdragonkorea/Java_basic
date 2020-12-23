package day02;

public class Casting {
	public static void main(String[] args) {
//		System.out.println(10/3);
//		System.out.println((10+0.0)/3f);
//		System.out.println('A'+5);
		//아스키코드: 컴퓨터가 문자를 저장할때 한 문자당 대응하는 숫자로 저장을 한다.
		//'A' : 65 / 'B' : 66
		//'a' : 97
		//'0' : 48
//		System.out.println((int)10.24784);  // 형변환 연산자 
//		System.out.println((int)'a');
//		System.out.println((double)10);
//		
//		형변환 연산자의 우선순위는 산술 연산자의 우선순위보다 높다.
//		System.out.println((int)(8.43+2.59));
//		System.out.println((int)8.43+2.59);

		//복습_20201222
		System.out.println(10.2424);
		System.out.println((int)10.2424); //정수
		System.out.println(10);
		System.out.println((double)10); //실수
		System.out.println((float)10); //실수
		System.out.println('a'); //문자
		System.out.println((int)'a'); //정수 (아스키코드 a = 97)
	}
}
