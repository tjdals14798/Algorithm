package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_7732 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1;tc <= T;tc++) {
			String tr[] = br.readLine().split(":");
			String trr[] = br.readLine().split(":");
			
			int sec = (Integer.parseInt(tr[0])*3600)+(Integer.parseInt(tr[1])*60)+Integer.parseInt(tr[2]);
			int sec1 = (Integer.parseInt(trr[0])*3600)+(Integer.parseInt(trr[1])*60)+Integer.parseInt(trr[2]);
			
			if(sec>sec1) sec1 += 24*3600;
			
			int sum = sec-sec1;			
			int time[] = new int[3];
			
			for(int i=0;i<3;i++) {
				if(i==0) {
					time[i]=sum/3600;
					sum-=time[i]*3600;
				}else if(i==1) {
					time[i]=sum/60;
					sum-=time[i]*60;
				}else time[i]=sum;
			}
			
			String res[] = new String[3];
			for(int i=0;i<3;i++) {
				String str = Integer.toString(time[i]*-1);
				
				if(str.length()==1) {
					str = "0"+str;
				}
				
				res[i]=str;
			}
			
			System.out.printf("#%d %s:%s:%s\n",tc,res[0],res[1],res[2]);
		}
	}

}
