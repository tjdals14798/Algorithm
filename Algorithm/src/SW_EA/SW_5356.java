package SW_EA;

import java.util.Scanner;

public class SW_5356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			String arr[][]=new String[5][15];
			String res = "";
			
			for(int i=0;i<arr.length;i++) {
				String str=sc.next();
				for(int j=0;j<str.length();j++) {
					arr[i][j]=String.valueOf(str.charAt(j));
				}
			}
			
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[j][i]==null) {
						continue;
					}else res+=arr[j][i];
				}
			}
			System.out.printf("#%d %s",tc,res);
		}
	}
}
