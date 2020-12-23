package day05;

public class ArrTest2 {
	public static void main(String[] args) {
		//행: 소배열의 갯수
		//열: 소배열의 칸수
		int[][] arrData = {{1,2,3},{4,5,6}};
		
		//방법1
//		for (int i = 0; i < 6; i++) {
//			//i: 	0 1 2 3 4 5
//			//행: 	0 0 0 1 1 1
//			//열:	0 1 2 0 1 2
//			System.out.println(arrData[i/3][i%3]);
		
		//방법2
//		System.out.println(arrData[0][0]);
//		System.out.println(arrData[0][1]);
//		System.out.println(arrData[0][2]);
//		System.out.println(arrData[1][0]);
//		System.out.println(arrData[1][1]);
//		System.out.println(arrData[1][2]);
		
		//방법3
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[0][j]);			
//		}	
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);					
//		}

		//방법4
		for (int i = 0; i < arrData.length; i++) { //arrData의 길이는 행의 갯수
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);			
			}
		}
	}
}
