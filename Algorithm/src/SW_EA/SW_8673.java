package SW_EA;

import java.util.LinkedList;
import java.util.Scanner;

public class SW_8673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			LinkedList<Integer> Lis = new LinkedList<>();

			for (int i = 0; i < (1<<N); i++) {
				Lis.offer(sc.nextInt());
			}
			
			int sum=0;
			while(Lis.size() > 1) {
				int a = Lis.poll();
				int b = Lis.poll();
				Lis.offer(Math.max(a, b));
				sum+=Math.abs(a-b);
			}
			System.out.printf("#%d %d\n",tc,sum);
		}

	}

}
