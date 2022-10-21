package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_2535 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][3];
		
		for(int i = 0; i < n ; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[]t2) {
				return t2[2]-t1[2];
			}
		});
		int conuntry[]=new int[101], cnt = 0;
		for(int i = 0; i < n ; i++) {
			if(conuntry[arr[i][0]]!=2) {
				System.out.println(arr[i][0]+" "+arr[i][1]);
				conuntry[arr[i][0]]++;
				cnt++;
			}
			if(cnt==3) break;
		}
		
	}

}
