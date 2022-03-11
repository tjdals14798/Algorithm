package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SW_9229 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1;tc <= T;tc++) {
			int ans = -1;
			String input[] = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			int arr[] = new int[N];
			
			input = br.readLine().split(" ");
			for(int i = 0;i < N;i++) {
				arr[i]=Integer.parseInt(input[i]);
			}
			Arrays.sort(arr);
			
			int index = 0;
			int end = arr.length-1;
			while(index != end) {
				if(arr[index] + arr[end] <= M) {
					ans = Math.max(ans,arr[index]+arr[end]);
					index+=1;
				}else {
					end-=1;
				}
			}		
			System.out.printf("#%d %d\n",tc,ans);
		}
		
	}

}
