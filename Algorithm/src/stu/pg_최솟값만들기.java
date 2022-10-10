package stu;

import java.util.Arrays;

public class pg_최솟값만들기 {

	public static void main(String[] args) {
		int [] A = {1,4,2};
		int [] B = {5,4,4};
		int res = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0;i < A.length; i++) {
			res += A[i]*B[A.length-i-1];
		}

		System.out.println(res);
	}

}
