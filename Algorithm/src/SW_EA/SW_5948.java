package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_5948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int arr[]=new int[35];//297
			int num[]=new int[7];	int size = 0,	cnt = 1;
			
			for(int i=0;i<num.length;i++) {
				num[i]=sc.nextInt();
			}
			
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					for(int k=j+1;k<num.length;k++) {
						int index = num[i]+num[j]+num[k];
						arr[size++] = index;
						//arr[index-1] = index-1;
					}
				}
			}
			
			Arrays.sort(arr);
			int i;
			for(i=33;i>=0;i--) {
				if(arr[i] == arr[i+1]) continue;
				if(++cnt == 5) break;
			}
			
			System.out.printf("#%d %d\n",tc,arr[i]);
		}
	}

}
