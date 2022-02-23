package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int arr[]=new int[10];
			for(int i=0;i<10;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int sum=0;
			double avg=0.0;
			for(int i=1;i<9;i++) {
				sum+=arr[i];
			}
			avg=sum/(double)8;
			double res = Math.round(avg);
			System.out.printf("#%d %.0f\n",tc,res);
		}

	}

}
