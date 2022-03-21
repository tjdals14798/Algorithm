package SW_EA;

import java.util.ArrayList;
import java.util.Scanner;

public class SW_1229 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
	    for (int tc = 1; tc <= 10; tc++) {
	    	int N = sc.nextInt(); ArrayList<String>al=new ArrayList<String>();
	    	
	    	for(int i=0;i<N;i++) {
	    		al.add(sc.next());
	    	}
	    	
	    	int C = sc.nextInt();
	    	
	    	for(int i=0;i<C;i++) {
	    		String str = sc.next(); int x=sc.nextInt(); int y=sc.nextInt();
	    		
	    		for(int j=0;j<y;j++) {
	    			if(str.equals("I")) al.add(x++, sc.next());
	    			else al.remove(x);
	    		}
	    		
	    	}
	    	System.out.print("#"+tc+" ");
	    	for(int i=0;i<10;i++) {
	    		System.out.print(al.get(i)+" ");
	    	}
	    	System.out.println();
	    
	    }

	}

}
