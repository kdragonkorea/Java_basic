package day02;

public class VariableTest {
	public static void main(String[] args) {
		int data = 10;
		float f = 10.2778F;
		double d = -12.147;
		char c = 'a';

		String s = "Hello";
		
//		System.out.printf("%d\n", data);
//		System.out.printf("f 변수에 들어있는 값 : %f\n",f);
//		System.out.printf("d : %f\nc : %c\n", d, c);
//		System.out.printf("f 변수에 들어있는 값 : %.3f\n",f); // 소수점 3자리까지,반올림
//		System.out.printf("d : %.2f\nc : %c\n", d, c); // 소수점 2자리까지,반올림
		
		//복습_2020-12-22
		System.out.printf("정답\n"); //printf를 사용했지만 서식없이 출력 가능
		System.out.printf("%d\n", data); //printf를 사용해야지만 서식(%d)으로 출력 가능
		System.out.printf("정답: %d\n", data); //printf를 사용해서 문자와 서식을 복합적으로 출력
		System.out.printf("%f\n", f);
		System.out.printf("%.2f\n", f); // %.2f 는 f의 소수점 2자리까지 반올림
		System.out.printf("f의 변수: %f\n", f);
		System.out.printf("%c\n", c);
		System.out.printf("변수: %c\n", c);
		
	}
}
