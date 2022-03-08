package SW_EA;

import java.util.Scanner;

public class SW_10200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();int B = sc.nextInt();
			int max=0;int min=0;
			
			if(N==A&&N==B) {
				max=A;min=B;
				System.out.printf("#%d %d %d\n",tc,max,min);
			}else {
				if(A>B) max=B;
				else max=A;
				
				min=(A+B)-N;
				if(min<0) min=0; 
				System.out.printf("#%d %d %d\n",tc,max,min);
			}
			
			
		}
		

	}

}
