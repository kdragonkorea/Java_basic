package day05;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		//1. for�� �̿��ؼ� 1~10���� �迭�� �ְ� ���
//		int[] arData1=new int[10];
//		for (int i = 0; i < arData1.length; i++) {
//			arData1[i]=i+1;
//			System.out.println(arData1[i]);
//		}
//		//����Ű: ���� �ϰ� �����ϴ� ���: alt+shift+R
//		
		//2. for�� �̿��ؼ� 10~1���� �迭�� �ְ� ���
//		int[] arData2=new int[10];
//		for (int j= 0; j < arData2.length; j++) {
//			arData2[j]=10-j;
//			System.out.println(arData2[j]);
//		}
		
		//3. ����, ����, ����, ����, �ѱ��� ���� �Է� �ް� ������ ��� ���
		Scanner sc = new Scanner(System.in);
		int[] score= new int[5];
		//Ǯ��1
//		System.out.print("���� ����: ");
//		score[0]=sc.nextInt();
//		System.out.print("���� ����: ");
//		score[1]=sc.nextInt();
//		System.out.print("���� ����: ");
//		score[2]=sc.nextInt();
//		System.out.print("���� ����: ");
//		score[3]=sc.nextInt();
//		System.out.print("�ѱ��� ����: ");
//		score[4]=sc.nextInt();
		
		//Ǯ��2
		String[] subjects= {"����","����","����","����","�ѱ���"};
		for (int i = 0; i < score.length; i++) {
			System.out.print(subjects[i]+" ����: ");
			score[i]=sc.nextInt();
		}	
		int sum=0;
		for (int j = 0; j < subjects.length; j++) {
			sum+=score[j];			
		}
		System.out.println("����: "+sum+"��");
		System.out.println("���: "+(double)sum/score.length+"��");
					
		//���� ó���� Ǯ� �ڵ�
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
//		String[] data3= {"����","����","����","����","�ѱ���"};
//		for (int i = 0; i < data3.length; i++) {
//			System.out.println(data3[i]);			
//		}
//		score=sc.nextInt();
		
	
	}
}


