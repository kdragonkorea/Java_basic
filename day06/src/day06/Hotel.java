package day06;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
		//���߹迭�� ���ؼ� ����.
		//'101 ~ 103ȣ, 201 ~ 203ȣ, 301 ~ 303ȣ' ������ ������ �Է�
		//1�� �� ���� ���
		//1�� ��� ���� ���
		//2�� �� ���� ���
		//2�� ��� ���� ���
		//3�� �� ���� ���
		//3�� ��� ���� ���
		//1,2,3�� ��ü �� ������ ���� ���
		//1,2,3,�� ��ü ���� ����� ���
		
//		[Ǯ��]
//		(1) ���߹迭�� �����. ([3][3])
		int[][] rooms= new int[3][3];
		int[] floorSum = new int[3]; // (7)�� Ǯ��
		int total=0; //(9��) Ǯ��

		Scanner sc=new Scanner(System.in);

//		(2)�Է°� �� ��� ���� �Է��Ѵ�.
//		rooms[0][0]=sc.nextInt();
//		rooms[0][1]=sc.nextInt();
//		rooms[0][2]=sc.nextInt();
//		rooms[1][0]=sc.nextInt();
//		rooms[1][1]=sc.nextInt();
//		rooms[1][2]=sc.nextInt();
//		rooms[2][0]=sc.nextInt();
//		rooms[2][1]=sc.nextInt();
//		rooms[2][2]=sc.nextInt();

//		(3) (2)������ �ݺ��ϴ� ��Ģ�� ã�Ƽ� �ݺ������� �����.
//		for (int i = 0; i < 3; i++) {
//			System.out.println((101+i)+"ȣ ����: ");
//			rooms[0][i]=sc.nextInt();
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println((201+i)+"ȣ ����: ");
//			rooms[1][i]=sc.nextInt();
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println((301+i)+"ȣ ����: ");
//			rooms[2][i]=sc.nextInt();
//		}		
//		(4) (3)������ �ٽ� �ݺ��� ��Ģ�� ã�Ƽ� 2�� �ݺ������� �����.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d0%dȣ ����: ",i+1,j+1);
				rooms[j][i]=sc.nextInt();
				floorSum[i]+=rooms[j][i]; // (7)�� Ǯ��
				
			}
		}
//		(5) �� ������ ���� ���հ� ��� �Է°� �����
//			System.out.println("1�� �� ����: ");
//			System.out.println("1�� ��� ����: ");
//			System.out.println("2�� �� ����: ");
//			System.out.println("2�� ��� ����: ");
//			System.out.println("3�� �� ����: ");
//			System.out.println("3�� ��� ����: ");

//		(6) (5)���� ���� �ݺ���Ģ�� ã�Ƽ� for������ �ٽ� �����
		for (int i = 0; i < 3; i++) {
//			System.out.println(i+1+"�� �� ����: ");
//			System.out.println(i+1+"�� ��� ����: ");
			System.out.println(i+1+"�� �� ����: "+floorSum[i]+"��"); // (7)�� Ǯ��
			System.out.println(i+1+"�� ��� ����: "+floorSum[i]/3.0+"��"); // (7)�� Ǯ��
			total+=floorSum[i];// (9)�� Ǯ��
		}
		
//		(7)	�� ������ ���� ����/��� ���ϱ�, �迭 �ٽ� �����
//			a) int floorSum�� ������ �迭([3])�� �ٽ� ����� - (1)
//			b) rooms�� ������ �ջ��� ������ floorSum���� ������Ų�� - (4)
//			c) floorSum�� �̿��Ͽ� ���հ� ����� ���Ѵ�- (6)

//		(8) ��ü �� ������ �հ� ����� ���ϱ�
//		System.out.println("�� ������ ��: "+Int(floorSum[0]+floorSum[1]+floorSum[2]);
//		System.out.println("�� ������ ���: "+(floorSum[0]+floorSum[1]+floorSum[2])/9.0);
		
//		(9) a) (8)���� ���� ���ο� ������(total)�����  - (1)
//			b) �ݺ���Ģ Ȯ���ؼ� floorSum�� ������Ų�� - (4)
//			c) total������ ���� ����� ����Ѵ�
		
		System.out.println("�� ������ ��: "+total+"��");
		System.out.println("�� ������ ���: "+total/9.0+"��");
		
	}
}
