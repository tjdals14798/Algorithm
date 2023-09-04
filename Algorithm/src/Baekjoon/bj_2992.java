package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2992 {
	static int min = Integer.MAX_VALUE;
	static boolean ck = false;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		int len = str.length;
		boolean vk[] = new boolean[len];
		int arr[] = new int[len];
		int out[] = new int[len];
		
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.valueOf(str[i]);
		int t = arrToInt(arr);
		
		ck(t, arr, out, vk, 0, len, len);
		
		if(ck != true) System.out.println("0");
		else System.out.println(Integer.toString(min));
	}

	public static void ck(int num, int arr[], int out[], boolean vk[], int dep, int n, int r) {
		if(dep == r) {
			int tmp = arrToInt(out);
			if(tmp > num) {
				if(tmp < min) {
					min = tmp;
					ck = true;
				}
			}
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(vk[i] != true) {
				vk[i] = true;
				out[dep] = arr[i];
				ck(num, arr, out, vk, dep + 1, n, r);
				vk[i] = false;
			}
		}
	}
	
	static int arrToInt(int arr[]){
        int res = 0, size = arr.length;
        for(int i = 0; i<size; i++){
            res += arr[i] * Math.pow(10, size - i - 1);
        }
        return res;
    }
}
