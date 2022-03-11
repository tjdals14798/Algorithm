package SW_EA;

import java.util.ArrayList;
import java.util.Scanner;

public class SW_8931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			int K = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int index = 0;
			for(int i = 0;i < K;i++) {
				int N = sc.nextInt();
				if(N!=0) {
					arr.add(N);
					index=arr.size();
				}else {
					arr.remove(index-1);
					index--;
				}
			}
			int sum=0;
			for(int i = 0;i < arr.size();i++) {
				sum+=arr.get(i);
			}
			System.out.printf("#%d %d\n",tc,sum);
		}

	}

}
