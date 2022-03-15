package SW_EA;

import java.util.Scanner;

public class SW_7728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        char arr[]= {'0','1','2','3','4','5','6','7','8','9'};
        for(int tc = 1; tc <= T; tc++) {
        	boolean brr[]=new boolean[10];
        	String K = sc.next();
        	int cnt =0;
        	
        	for(int i=0;i<K.length();i++) {
        		brr[K.charAt(i)-'0']=true;
        	}
        	
        	for(int i=0;i<brr.length;i++) {
        		if(brr[i]) cnt++;
        	}
        	System.out.printf("#%d %d\n",tc,cnt);
        }

	}

}
