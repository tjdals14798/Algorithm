package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10972 {
	

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		if (nextPermutation(arr)) {
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
		}else System.out.println("-1");
		 
	}
	
	private static boolean nextPermutation(int arr[]) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--; 
        if (i <= 0) return false;
 
        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) j--;
 
        swap(i - 1, j, arr);
        j = arr.length - 1;
        while (i < j) {
            swap(i, j, arr);
            i++;
            j--;
        }
        return true;
    }
 
    private static void swap(int idx1, int idx2, int arr[]) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}