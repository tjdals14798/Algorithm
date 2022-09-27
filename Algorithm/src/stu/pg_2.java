package stu;

import java.util.Scanner;

public class pg_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int br = sc.nextInt(), ye = sc.nextInt();
		int [] res = new int[2];
		
		int sum = br + ye;
		for(int i = 3;i < sum;i++) {
			int j = sum / i;
			
			if(sum % i ==0 && j >=3) {
				int col = Math.max(i, j);
				int row = Math.min(i, j);
				int center = (col - 2) * (row - 2);
				
				if(center == ye) {
					res[0] = col;
					res[1] = row;
				}
			}
		}
		System.out.println(res[0]+" "+res[1]);
	}

}
