package day02;

public class VariableTest2 {
	public static void main(String[] args) {
		//====ȸ�� ���� ====
		//�̸�	: ȫ�浿
		//Ű		: 182.24cm
		//������	: 75.26kg
		//����	: 'A'
		String name="ȫ�浿";
		double height = 182.24;
		float weight = 75.26F; 
		
		char score = 'A';
	
		System.out.println("====ȸ������====");
		System.out.printf("�̸�\t: %s\n", name);
		System.out.printf("Ű\t: %.2fcm\n", height);
		System.out.printf("������\t: %.2fkg\n", weight);
		System.out.printf("����\t: \'%c\'\n", score);
		
		System.out.println("====ȸ������====");
		System.out.println("�̸�\t: "+name);
		System.out.println("Ű\t: "+height);
		System.out.println("������\t: "+weight);
		System.out.println("����\t: \'"+score+"\'");
		//syso = system.out.println
		//Ctrl+Alt+���Ʒ�: ���Ʒ� ���� ����
		//Alt+���Ʒ�: ���Ʒ��� ���� �̵�
		System.out.println();
		System.out.println("====ȸ�� ����====");
		System.out.printf("�̸�\t : %s\n",name);
		System.out.printf("Ű\t : %.2fcm\n",height);
		System.out.printf("������\t : %skg\n",weight);
		System.out.printf("����\t : \'%c\'\n",score);
		
		//����_2020-12-22
		
	}
}
