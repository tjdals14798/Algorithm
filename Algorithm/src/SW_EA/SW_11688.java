package SW_EA;

import java.util.Scanner;

public class SW_11688 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int a=1; int b=1;
			char []arr = sc.next().toCharArray();
			
			for(char i:arr) {
				if(i=='L') {
					b+=a;
				}else {
					a+=b;
				}
			}
			System.out.printf("#%d %d %d\n",tc,a,b);
		}

	}

}
