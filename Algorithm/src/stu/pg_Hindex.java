package stu;

import java.util.Arrays;

public class pg_Hindex {

	public static void main(String[] args) {
		int [] arr = {3,0,6,1,5};
		int res = 0;
		Arrays.sort(arr);
		//			01356
		for(int i = 0;i < arr.length; i++) {
			int h = arr.length-i;
			
			if(arr[i] >= h) {
				res = h;
				break;
			}
		}
		System.out.println(res);

	}

}
