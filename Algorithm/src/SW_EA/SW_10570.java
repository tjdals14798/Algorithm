package SW_EA;

import java.util.Scanner;

public class SW_10570 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuffer sb=null;
        
        for (int tc = 1; tc <= T; tc++) {
            int A=sc.nextInt(); int B=sc.nextInt();          
            int cnt=0;
            
            for(int i=A;i<=B;i++) {
            	
            	boolean cka=false; boolean ckb=false;
            	double ix=Math.sqrt(i);
            	
            	if(Math.round(ix)==ix) {
            		sb=new StringBuffer(Integer.toString(i));
            		String rsa = sb.reverse().toString();
            		
            		if(sb.reverse().toString().equals(rsa)) {
            			if(Integer.parseInt(sb.reverse().toString())<=B) {
            				cka = true;            				
            			}            			
            		}
            		//뒤집힌 수
            		sb=new StringBuffer(String.valueOf((int)ix));
            		String rsb = sb.reverse().toString();
            	
            		if(sb.reverse().toString().equals(rsb)) {
            			ckb = true;
            		}
            		
            		//카운트
            		if(cka==true && ckb==true) cnt++;
            	}
            }
            System.out.printf("#%d %d\n",tc,cnt);
        }
	}

}
