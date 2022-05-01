package SW_EA;

import java.util.Scanner;

public class SW_1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1;tc <= 10;tc++) {
			int N = sc.nextInt();
			int arr[] = new int[8];
			
			for(int i = 0;i < arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
			int cnt = 0;
			boolean ck = true;
			
			while(ck) {
				cnt++;
				int temp = arr[0]-cnt;
				if(temp<0) temp = 0;
				
				for(int i = 0;i < 7;i++) {
					arr[i] = arr[i+1];
				}
				arr[7] = temp;
				
				if(cnt == 5) cnt =0 ;
				
				for(int i = 0;i < arr.length;i++) {
					if(arr[i]<=0) ck=false;
				}
			}
			String str = "";
			for(int i = 0;i < arr.length;i++) {
				str +=arr[i]+" "; 
			}
			System.out.printf("#%d %s\n",tc,str);
		}
		

	}

}
