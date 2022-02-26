package SW_EA;

import java.util.Scanner;

public class SW_13038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			
			int N = sc.nextInt();
			int day[] = new int[7];
			int cnt = 0;
			
			for(int i=0;i<day.length;i++) {
				day[i]=sc.nextInt();
			}
			
			for(int i=0;i<day.length;i++) {
				if(day[i]==1) {
					cnt++;
				}
			}
			
			int res = Integer.MAX_VALUE;
			for(int i=0;i<day.length;i++) {
				if(day[i]==0) continue;
				int point = i;
				int pcnt=0;
				int size=0;
				
				while(pcnt<N) {
					point = point%7;	// 7이되면 0이 되는듯
					size++;
					if(day[point]==1) pcnt++;
					if(point==6) {	// 토요일일때 ?
						int Lcnt=N-pcnt;
						if(Lcnt>cnt) {
							if(Lcnt%cnt==0) {
								size +=((Lcnt/cnt)-1)*7;
								pcnt = N-cnt;
							}else {
								size += (Lcnt/cnt)*7;
								pcnt = N-(Lcnt%cnt);
							}
						}
					}
					point++;
				}
				res = Math.min(res, size);
			}
			System.out.printf("#%d %d\n",tc,res);		
		}

	}

}
