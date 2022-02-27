package SW_EA;

import java.util.Scanner;

public class SW_12741 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt(); int d=sc.nextInt();
			int[] Arr=new int[b-a];
			int[] Brr=new int[d-c];
			
			for(int i=0,j=a+1;i<Arr.length;i++,j++) {
				Arr[i]=j;
			}
			for(int i=0,j=c+1;i<Brr.length;i++,j++) {
				Brr[i]=j;
			}
			int min=Math.min(Arr.length, Brr.length);
			int max=Math.max(Arr.length, Brr.length);
			int cnt=0;
			for(int i=0;i<min;i++) {
				for(int j=0;j<max;j++) {
					if(Arr.length>Brr.length) {
						if(Brr[i]==Arr[j]) {
							cnt++;
						}
					}else {
						if(Arr[i]==Brr[j]) {
							cnt++;
						}
					}
				}
			}
			System.out.printf("#%d %d\n",tc,cnt);
		}
		

	}

}
