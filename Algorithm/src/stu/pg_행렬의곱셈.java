package stu;

public class pg_Çà·ÄÀÇ°ö¼À {

	public static void main(String[] args) {
		int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
		int[][] res = new int[arr1.length][arr2[0].length];
		
		for(int i = 0;i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				int sum = 0;
				for(int k = 0; k < arr2.length; k++) {
					sum += arr1[i][k]*arr2[k][j];
				}
				res[i][j] = sum;
			}
		}
		for(int i = 0;i < res.length; i++) {
			for(int j = 0;j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
