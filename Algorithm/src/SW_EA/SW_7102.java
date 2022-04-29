package SW_EA;

import java.util.Scanner;

public class SW_7102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
             
            int[] arr = new int[N+M+1];
            int max = 0;
            for(int i=1; i<=N; i++) {
                for(int j=1; j<=M; j++) {
                    arr[i+j]++;
                }
            }
             
            for(int i=2; i<=M+N; i++) {
                max = Math.max(arr[i], max);
            }
            System.out.print("#"+t+" ");
             
            for(int i=2; i<=M+N; i++) {
                if(arr[i] == max) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
