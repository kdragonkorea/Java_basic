package day02;

public class VariableTest {
	public static void main(String[] args) {
		int data = 10;
		float f = 10.2778F;
		double d = -12.147;
		char c = 'a';

		String s = "Hello";
		
//		System.out.printf("%d\n", data);
//		System.out.printf("f ������ ����ִ� �� : %f\n",f);
//		System.out.printf("d : %f\nc : %c\n", d, c);
//		System.out.printf("f ������ ����ִ� �� : %.3f\n",f); // �Ҽ��� 3�ڸ�����,�ݿø�
//		System.out.printf("d : %.2f\nc : %c\n", d, c); // �Ҽ��� 2�ڸ�����,�ݿø�
		
		//����_2020-12-22
		System.out.printf("����\n"); //printf�� ��������� ���ľ��� ��� ����
		System.out.printf("%d\n", data); //printf�� ����ؾ����� ����(%d)���� ��� ����
		System.out.printf("����: %d\n", data); //printf�� ����ؼ� ���ڿ� ������ ���������� ���
		System.out.printf("%f\n", f);
		System.out.printf("%.2f\n", f); // %.2f �� f�� �Ҽ��� 2�ڸ����� �ݿø�
		System.out.printf("f�� ����: %f\n", f);
		System.out.printf("%c\n", c);
		System.out.printf("����: %c\n", c);
		
	}
}
