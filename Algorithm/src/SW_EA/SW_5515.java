package SW_EA;

import java.util.Scanner;

public class SW_5515 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Man[]= {31,29,31,30,31,30,31,31,30,31,30,31};
        //4 Ω√¿€
        
        for (int tc = 1; tc <= T; tc++) {
        	int M = sc.nextInt(); int D = sc.nextInt();
        	int day=4;
        	for(int i=1;i<=M;i++) {
        		for(int j=1;j<=Man[i-1];j++) {
        			
        			if(day==7) day=0;
        			
            		if(i==M&&j==D) {
            			break;
            		}else {
            			day++;            			
            		}
            	}
        	}
        	
        	System.out.printf("#%d %d\n",tc,day);
        	
        }

	}

}
