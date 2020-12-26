package day06;

public class OperTest {
	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			if(i==4) {
				//다음 반복으로 넘어가기 = 넘어가기
				//아래쪽에 넘어갈만한 의미있는 문장이 있을때 사용
				continue;
			}
			System.out.println(i);
		}
	}
}
