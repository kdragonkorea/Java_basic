package day06;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
		//이중배열에 대해서 연습.
		//'101 ~ 103호, 201 ~ 203호, 301 ~ 303호' 각각의 월세를 입력
		//1층 총 월세 출력
		//1층 평균 월세 출력
		//2층 총 월세 출력
		//2층 평균 월세 출력
		//3층 총 월세 출력
		//3층 평균 월세 출력
		//1,2,3층 전체 총 월세의 합을 출력
		//1,2,3,층 전체 월세 평균을 출력
		
//		[풀이]
//		(1) 이중배열을 만든다. ([3][3])
		int[][] rooms= new int[3][3];
		int[] floorSum = new int[3]; // (7)번 풀이
		int total=0; //(9번) 풀이

		Scanner sc=new Scanner(System.in);

//		(2)입력값 각 행과 열을 입력한다.
//		rooms[0][0]=sc.nextInt();
//		rooms[0][1]=sc.nextInt();
//		rooms[0][2]=sc.nextInt();
//		rooms[1][0]=sc.nextInt();
//		rooms[1][1]=sc.nextInt();
//		rooms[1][2]=sc.nextInt();
//		rooms[2][0]=sc.nextInt();
//		rooms[2][1]=sc.nextInt();
//		rooms[2][2]=sc.nextInt();

//		(3) (2)번에서 반복하는 규칙을 찾아서 반복문으로 만든다.
//		for (int i = 0; i < 3; i++) {
//			System.out.println((101+i)+"호 월세: ");
//			rooms[0][i]=sc.nextInt();
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println((201+i)+"호 월세: ");
//			rooms[1][i]=sc.nextInt();
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println((301+i)+"호 월세: ");
//			rooms[2][i]=sc.nextInt();
//		}		
//		(4) (3)번에서 다시 반복되 규칙을 찾아서 2중 반복문으로 만든다.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d0%d호 월세: ",i+1,j+1);
				rooms[j][i]=sc.nextInt();
				floorSum[i]+=rooms[j][i]; // (7)번 풀이
				
			}
		}
//		(5) 각 층마다 월세 총합과 평균 입력값 만들기
//			System.out.println("1층 총 월세: ");
//			System.out.println("1층 평균 월세: ");
//			System.out.println("2층 총 월세: ");
//			System.out.println("2층 평균 월세: ");
//			System.out.println("3층 총 월세: ");
//			System.out.println("3층 평균 월세: ");

//		(6) (5)번에 대한 반복규칙을 찾아서 for문으로 다시 만든다
		for (int i = 0; i < 3; i++) {
//			System.out.println(i+1+"층 총 월세: ");
//			System.out.println(i+1+"층 평균 월세: ");
			System.out.println(i+1+"층 총 월세: "+floorSum[i]+"원"); // (7)번 풀이
			System.out.println(i+1+"층 평균 월세: "+floorSum[i]/3.0+"원"); // (7)번 풀이
			total+=floorSum[i];// (9)번 풀이
		}
		
//		(7)	각 층마다 월세 총합/평균 구하기, 배열 다시 만들기
//			a) int floorSum의 변수로 배열([3])을 다시 만든다 - (1)
//			b) rooms의 변수를 합산한 값들을 floorSum으로 누적시킨다 - (4)
//			c) floorSum을 이용하여 총합과 평균을 구한다- (6)

//		(8) 전체 총 월세의 합과 평균을 구하기
//		System.out.println("총 월세의 합: "+Int(floorSum[0]+floorSum[1]+floorSum[2]);
//		System.out.println("총 월세의 평균: "+(floorSum[0]+floorSum[1]+floorSum[2])/9.0);
		
//		(9) a) (8)번에 대한 새로운 변수를(total)만들고  - (1)
//			b) 반복규칙 확인해서 floorSum에 누적시킨다 - (4)
//			c) total변수로 최종 결과를 출력한다
		
		System.out.println("총 월세의 합: "+total+"원");
		System.out.println("총 월세의 평균: "+total/9.0+"원");
		
	}
}
