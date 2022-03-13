package SW_EA;

import java.util.Scanner;

public class SW_8658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			String arr[]=new String[10];
			int res=0, max=0, min=Integer.MAX_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.next();
			}
			
			for(int i=0;i<arr.length;i++) {
				String str=arr[i];
				res=0;
				for(int j=0;j<arr[i].length();j++) {
					res+=str.charAt(j)-'0';
				}
				max=Math.max(max, res);
				min=Math.min(min, res);
			}
			System.out.printf("#%d %d %d\n",tc,max,min);
			
		}

	}

}
