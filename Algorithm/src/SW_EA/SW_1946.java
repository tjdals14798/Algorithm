package SW_EA;

import java.util.Scanner;

public class SW_1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int num=0;
			int cnt=0;
			
			String []C=new String[N];
			int []Ci=new int[N];
			
			for(int i=0;i<N;i++) {
				C[i]=sc.next();
				Ci[i]=sc.nextInt();
			}
			System.out.printf("#%d\n",tc);
			
			while(true) {
				if(num==N) break;
				for(int i=0;i<Ci[num];i++) {
					System.out.print(C[num]);
					cnt++;
					if(cnt==10) {
						System.out.println();
						cnt=0;
					}
				}
				num++;
			}
			
			System.out.println();
		}
		
	}

}
