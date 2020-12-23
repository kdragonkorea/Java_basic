package day05;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		//1. for문 이용해서 1~10까지 배열에 넣고 출력
//		int[] arData1=new int[10];
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i]=i+1;
//			System.out.println(arData1[i]);
//		}
//		//단축키: 변수 일괄 변경하는 방법: alt+shift+R
//		
		//2. for문 이용해서 10~1까지 배열에 넣고 출력
//		int[] arData2=new int[10];
//		for (int j= 0; j < arData2.length; j++) {
//			arData2[j]=10-j;
//			System.out.println(arData2[j]);
//		}
		
		//3. 국어, 수학, 영어, 과학, 한국사 점수 입력 받고 총점과 평균 출력
		Scanner sc = new Scanner(System.in);
		int[] score= new int[5];
		//풀이1
//		System.out.print("국어 점수: ");
//		score[0]=sc.nextInt();
//		System.out.print("수학 점수: ");
//		score[1]=sc.nextInt();
//		System.out.print("영어 점수: ");
//		score[2]=sc.nextInt();
//		System.out.print("과학 점수: ");
//		score[3]=sc.nextInt();
//		System.out.print("한국사 점수: ");
//		score[4]=sc.nextInt();
		
		//풀이2
		String[] subjects= {"국어","수학","영어","과학","한국사"};
		for (int i = 0; i < score.length; i++) {
			System.out.print(subjects[i]+" 점수: ");
			score[i]=sc.nextInt();
		}	
		int sum=0;
		for (int j = 0; j < subjects.length; j++) {
			sum+=score[j];			
		}
		System.out.println("총점: "+sum+"점");
		System.out.println("평균: "+(double)sum/score.length+"점");
					
		//내가 처음에 풀어본 코드
//		int[] arData = {10,20,30,40,50};
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
		
//		int[] data1={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for (int i = 0; i < data1.length; i++) {
//			System.out.println(i+1);
	
//		int[] data2={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		for (int j = 0; j < data2.length; j++) {
//			System.out.println(10-j);
		
//		Scanner sc=new Scanner(System.in);
//		String[] data3= {"국어","수학","영어","과학","한국사"};
//		for (int i = 0; i < data3.length; i++) {
//			System.out.println(data3[i]);			
//		}
//		score=sc.nextInt();
		
	
	}
}


