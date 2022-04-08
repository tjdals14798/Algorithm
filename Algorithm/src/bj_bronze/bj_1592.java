package bj_bronze;

import java.util.Scanner;

public class bj_1592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(),M = sc.nextInt(),L=sc.nextInt();
		int arr[] = new int[N+1];
		arr[1]=1;
		int index = 1, cnt=0;
		while(true) {
			if(arr[index]==M) break;
			
			if(arr[index]%2==1) index+=L;
			else index-=L;
			
			if(index>N) index%=N;
			else if(index<1) index+=N;
			
			
			arr[index]++;
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
