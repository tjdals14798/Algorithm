package ����;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj_10814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String arr[][] = new String[cnt][2];
		
		for(int i = 0; i < cnt; i++) {
			arr[i][0]=sc.nextLine();
			arr[i][1]=sc.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		
		for(int i = 0; i < cnt ;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}

	}

}
