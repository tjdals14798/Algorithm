package SW_EA;

import java.util.Scanner;

public class SW_2058 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * int N = sc.nextInt(); int sum=0;
		 * 
		 * while(N%10!=0) { sum+=N%10; N/=10; }
		 * 
		 * System.out.println(sum);
		 */
		
		String N = sc.next();
		int V = Integer.parseInt(N);
		
		int sum = 0;
		
		for(int i =0;i<N.length();i++) {
			sum+=V%10;
			V/=10;
		}
		System.out.println(sum);
	}

}
