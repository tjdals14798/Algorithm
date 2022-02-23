package SW_EA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SW_1983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String arr[]= {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();	int K=sc.nextInt();
			Double srr[]=new Double[N];
			double km=0.0;
			
			for(int i=0;i<N;i++) {
				int J=sc.nextInt();int G=sc.nextInt();int S=sc.nextInt();
				double sum=(J*35)+(G*45)+(S*20);
				srr[i]=sum;
				if(i+1==K) km=sum;
			}
			Arrays.sort(srr,Collections.reverseOrder());
			
			int index=0;
			for(int i=0;i<srr.length;i++) {
				if(srr[i]==km) {
					index=i;
				}
			}
			index=index/(N/10);
			System.out.printf("#%d %s\n",tc,arr[index]);
		}

	}

}
