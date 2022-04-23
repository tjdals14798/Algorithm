package SW_EA;

import java.util.Scanner;
import java.util.Stack;

public class SW_7964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt(),D = sc.nextInt();
			Stack<Integer> arr = new Stack<>();
			
			for(int i=0;i<N;i++) {
				arr.push(sc.nextInt());
			}
			
			int cnt = 0, d = D;
			
			while(!arr.empty()) {				
				if(arr.pop()==1) d = D;
				else {
					d--;
					if(d==0) {
						cnt++;
						d = D;
					}
				}
				
			}
			
			System.out.printf("#%d %d\n",tc,cnt);
			
		}
		
	}

}
