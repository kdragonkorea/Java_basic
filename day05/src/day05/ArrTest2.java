package day05;

public class ArrTest2 {
	public static void main(String[] args) {
		//��: �ҹ迭�� ����
		//��: �ҹ迭�� ĭ��
		int[][] arrData = {{1,2,3},{4,5,6}};
		
		//���1
//		for (int i = 0; i < 6; i++) {
//			//i: 	0 1 2 3 4 5
//			//��: 	0 0 0 1 1 1
//			//��:	0 1 2 0 1 2
//			System.out.println(arrData[i/3][i%3]);
		
		//���2
//		System.out.println(arrData[0][0]);
//		System.out.println(arrData[0][1]);
//		System.out.println(arrData[0][2]);
//		System.out.println(arrData[1][0]);
//		System.out.println(arrData[1][1]);
//		System.out.println(arrData[1][2]);
		
		//���3
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[0][j]);			
//		}	
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);					
//		}

		//���4
		for (int i = 0; i < arrData.length; i++) { //arrData�� ���̴� ���� ����
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);			
			}
		}
	}
}
