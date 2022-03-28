package bj_bronze;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2890 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();	int C =sc.nextInt();
		String arr[]=new String[R];	int res[] = new int[10];

		for(int i=0;i<R;i++) {
			arr[i]=sc.next();
		}
		//번호순대로 순위 정리.
		for(int i=0;i<R;i++) {
			int cnt = 0;
			for(int j=1;j<C-1;j++) {
				if(arr[i].charAt(j)=='.') {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt==C-2) res[R-1]=-1;
			else {
				int num = arr[i].charAt(cnt+3)-'0';
				res[num-1]=cnt;
			}
		}
		
		int nres[]=Arrays.stream(res).distinct().toArray();//배열 중복제거

		//하나씩 비교해서 작다면 +1이 순위?	
		int rank[]=new int[9];	
		for(int i=0;i<9;i++) {
			int r = 1;
			for(int j=0;j<nres.length-1;j++) {
				if(res[i]<nres[j]) {
					r++;
				}
			}
			rank[i]=r;
		}
		for(int i=0;i<rank.length;i++) { 
			System.out.println(rank[i]); 
		}
		
	}

}
