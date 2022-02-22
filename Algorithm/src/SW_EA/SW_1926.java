package SW_EA;

import java.util.Scanner;

public class SW_1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int cnt=0;
			if(i<10) {
				if(i%3==0) System.out.print("- ");
				else System.out.print(i+" ");
			}else {
				String a = Integer.toString(i);
				String arr[]= a.split("");
				
				for(int j=0;j<arr.length;j++) {
					if(arr[j].contains("3")||arr[j].contains("6")||arr[j].contains("9")) {
						cnt++;
					}
				}
				
				if(cnt==0) System.out.print(i+" ");
				else {
					for(int h=0;h<cnt;h++) {
						if(cnt==1) System.out.print("-");
						else System.out.print("-");
					}
					System.out.print(" ");
				}
			}
		
		}

	}

}
