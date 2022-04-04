package SW_EA;

import java.util.Scanner;

public class SW_4698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	boolean arr[] = new boolean[1000001];
		arr[1]=true;
		for(int i=2; i < arr.length; i++) {
			for(int j=2; j <= Math.sqrt(i); j++) {
				if(i % j == 0){
					arr[i]=true;
					break;
				}
			}
		}
	
		for (int tc = 1;tc <= T;tc++) {	
			int cnt = 0;
			int D =sc.nextInt(),	A=sc.nextInt(),		B=sc.nextInt();
			
			for(int j=A;j<=B;j++) {
				if(!arr[j]&& Integer.toString(j).contains(Integer.toString(D))) cnt++;
			}
			System.out.printf("#%d %d\n",tc,cnt);
		}

	}

}
