package day03;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		//���� �ΰ� �Է¹޾Ƽ� ����
		
		//num1�� Ů�ϴ�.
		//num2�� Ů�ϴ�.
		//�� ���� �����ϴ�.
		
		
		//�Է�
			//���� 2�� �Է�
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//ó��
			//�� �� ��
				//ù��°��>�ι�°��
		String result=num1>num2?"num1�� Ů�ϴ�.":
			(num1<num2? "num2�� Ů�ϴ�.":"�� ���� �����ϴ�.");
				//�ƴҶ�
					//ù��°��<�ι�°��
					//ù��°��==�ι�°��
		//���
			//��쿡 �´� ���ڿ� ���
		System.out.println(result);
	}
}