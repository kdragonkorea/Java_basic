package day04;

import java.util.Scanner;

public class whileTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
//		while(choice!=3) {
//			System.out.println("���� �� ���α׷��� �� �ƴѰ���?");
//			System.out.println("1. C���\n2. Java\n3. ���վ�\n4. ���̽�");
//			choice=sc.nextInt();
//			if(choice==3){
//				//�����϶�
//				System.out.println("�����Դϴ�.");
//			}else if(choice==1 || choice==2 || choice==4) {
//				//�����϶�
//				System.out.println("�����Դϴ�");
//			}else {
//				//�߸� �Է�������
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}
//		do{
//			System.out.println("���� �� ���α׷��� �� �ƴѰ���?");
//			System.out.println("1. C���\n2. Java\n3. ���վ�\n4. ���̽�\n0. ������");
//			choice=sc.nextInt();
//			if(choice==3){
//				//�����϶�
//				System.out.println("�����Դϴ�.");
//			}else if(choice==1 || choice==2 || choice==4) {
//				//�����϶�
//				System.out.println("�����Դϴ�");
//			}else if(choice==0){
//				System.out.println("�ȳ���������.");
//			}else {
//				//�߸� �Է�������
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}while(choice!=0);
		
		while(true) {
			System.out.println("���� �� ���α׷��� �� �ƴѰ���?");
			System.out.println("1. C���\n2. Java\n3. ���վ�\n4. ���̽�\n0. ������");
			choice=sc.nextInt();
			if(choice==3){
				//�����϶�
				System.out.println("�����Դϴ�.");
				break;
			}else if(choice==1 || choice==2 || choice==4) {
				//�����϶�
				System.out.println("�����Դϴ�");
			}else if(choice==0) {
				System.out.println("�ȳ���������.");
				break;
			}else {
				//�߸� �Է�������
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}