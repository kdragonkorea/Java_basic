package day06;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next(); ��ä�ΰ� ���ڿ���
		MethodTest m = new MethodTest();
		System.out.println(m.f(3));
		m.print99Dan(1);
		m.print99Dan(7);
		m.print99Dan(11);
		m.print99Dan(13);
		m.print99Dan(22);
		System.out.println(m.plus(10,  5));
		System.out.print(m.plus(10,  5));
		System.out.println(m.plus(10,  4));
		m.info();
	}	
	
	//f(x)�� �⺻ �޼ҵ� �����
	int f(int x){
		return 2*x+1;
	}
	//������ �� �� ����ϴ� �޼ҵ�
	void print99Dan(int dan){
		System.out.println(dan+"�� ��� ����!");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+" X "+i+" = "+i*dan);
		}
		System.out.println(dan+"�� ��� ��!");
	}
	//�� ������ ��������� �����ִ� �޼ҵ�
	int plus(int num1, int num2) {
		int result = num1+num2;
		System.out.println("�� ������ ���� �޼ҵ� �Դϴ�. ");
		return result;
	}
	//���Ұ� �ϴ� �޼ҵ�
		void info() {
			System.out.println("�� �̸��� ȫ�浿 �Դϴ�.");
			System.out.println("�� �̸��� ȫ�� �Դϴ�.");
			System.out.println("�� �̸��� ȫ �Դϴ�.");
		}
}