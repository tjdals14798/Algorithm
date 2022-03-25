package SW_EA;

//import java.util.Arrays;
import java.util.Scanner;

public class SW_5603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();	int arr[]=new int[N];
			int sum = 0;
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				sum+= arr[i];
			}
			
			int avg = sum / N;
			int res=0;
			
			for(int i=0;i<arr.length;i++) {
				res += Math.abs(avg - arr[i]);
			}
			
			System.out.printf("#%d %d\n",tc,res/2);
			/*
			 * int cnt = 0;
			 * 
			 * for(int i=0;i<arr.length;i++) { arr[i]=sc.nextInt(); }
			 * 
			 * while(true) { Arrays.sort(arr); if(arr[arr.length-1]==arr[0]) { break; } else
			 * { arr[arr.length-1]--; arr[0]++; } cnt++; }
			 * System.out.printf("#%d %d\n",tc,cnt);
			 */
			
		}

	}

}
