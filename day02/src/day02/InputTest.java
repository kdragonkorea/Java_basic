package day02;

import java.util.Scanner; 	//Scanner �ۼ��� �ڵ��ϼ� ���!

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("�̸� : ");
		//String name=sc.next();
		//System.out.println(name+"�� �ȳ��ϼ���");
		
//		System.out.print("���� �Է� : ");
//		int data = sc.nextInt();
//		System.out.println("��� : "+(data+5));
		
		//����_2020-12-22
		System.out.print("�̸�: "); //�Է°��� '�̸�'���� ����
		String name=sc.next(); // String(����)���� name���� ����
		System.out.println(name+"�� �ȳ��ϼ���"); // �Ϲ� name������ �Է� �� ���
		System.out.println("\'"+name+"\'�� �ȳ��ϼ���"); // \'�� ����Ͽ� �Է� �� ���
		
		System.out.print("����(����)�� �Է��ϼ���: ");
		int i = sc.nextInt(); // nextInt�� ����Ͽ� ������ ����� ����
		System.out.println("�Է��� ����(����)��"+i+"�Դϴ�."); //���� i�� �Է� �� ���
		System.out.print("�Է��� ����(����)��\'"+i+"\'�Դϴ�."); // \'�� ����Ͽ� �Է� �� ���
		

	}
}
