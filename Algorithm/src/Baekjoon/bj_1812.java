package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1812 {

	public static void main(String[] args)throws IOException {
		// 시간초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		boolean ck = false;
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int res[] = new int[N];
		res[0] = 1;
		while(true) {
			for(int i = 0; i < N; i++) {
				if(i==N-1) {
					if(res[0]+res[N-1] == arr[N-1]) {
						ck = true;
						break;
					}else res[0]++;
				}else res[i+1] = arr[i]-res[i];
			}
			if(ck) break;
		}
		for(int c : res) System.out.println(c);
		
//		for(int i=0;i<n;i++){
//            nextSum[i] = input.nextInt();
//            sum += nextSum[i];
//        }sum/=2;
// 
//        for(int i=0;i<n;i++){
//            int cnt = i%2; int val = sum;
//            if(i<2) cnt = i+1;
//            while(true){
//                if(cnt>=n) break;
//                if(cnt==i) {cnt++; continue;}
//                val -= nextSum[cnt];
//                cnt+=2;
//            }
	}

}
