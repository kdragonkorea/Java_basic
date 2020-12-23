package day02;

public class VariableTest2 {
	public static void main(String[] args) {
		//====회원 정보 ====
		//이름	: 홍길동
		//키		: 182.24cm
		//몸무게	: 75.26kg
		//점수	: 'A'
		String name="홍길동";
		double height = 182.24;
		float weight = 75.26F; 
		
		char score = 'A';
	
		System.out.println("====회원정보====");
		System.out.printf("이름\t: %s\n", name);
		System.out.printf("키\t: %.2fcm\n", height);
		System.out.printf("몸무게\t: %.2fkg\n", weight);
		System.out.printf("점수\t: \'%c\'\n", score);
		
		System.out.println("====회원정보====");
		System.out.println("이름\t: "+name);
		System.out.println("키\t: "+height);
		System.out.println("몸무게\t: "+weight);
		System.out.println("점수\t: \'"+score+"\'");
		//syso = system.out.println
		//Ctrl+Alt+위아래: 위아래 한줄 복사
		//Alt+위아래: 위아래로 한줄 이동
		System.out.println();
		System.out.println("====회원 정보====");
		System.out.printf("이름\t : %s\n",name);
		System.out.printf("키\t : %.2fcm\n",height);
		System.out.printf("몸무게\t : %skg\n",weight);
		System.out.printf("점수\t : \'%c\'\n",score);
		
		//복습_2020-12-22
		
	}
}
