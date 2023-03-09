package Baekjoon;

import java.util.Scanner;

public class bj_1551 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        String t[] = new String[N];
        String str = sc.next();
        t=str.split(",");
        for(int i =0  ; i < A.length;i++)
            A[i] = Integer.parseInt(t[i]);

        for(int time = 0; time < K ; time++){
            for(int i = 0; i < N-1; i++)A[i] = A[i+1]-A[i]; 
        }
        for(int i = 0; i < N-K; i++){
            System.out.print(A[i]);
            if(i!=N-K-1)System.out.print(',');
        }
    }
}