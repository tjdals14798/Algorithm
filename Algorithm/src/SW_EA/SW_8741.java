package SW_EA;

import java.util.Scanner;

public class SW_8741 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			String arr[] = new String[3];
			String res="";
			
			for(int i=0;i<3;i++) {
				arr[i]=sc.next();
			}
			
			for(int i=0;i<3;i++) {
				res+=arr[i].charAt(0);
			}
			
			System.out.printf("#%d %s\n",tc,res.toUpperCase());
			
		}
	}
}
