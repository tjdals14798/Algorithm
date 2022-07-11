package SW_EA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_1215 {
	static Character[][] arr;
	static int sum; 
	static int l; 
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int t =0; t<10; t++) {
			l = Integer.parseInt(br.readLine());
			sum = 0; 
			arr = new Character[8][8];
			
			for(int i=0; i<8; i++) {
				String str = br.readLine();
				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			for(int i=0; i<8; i++) {
				for(int j =0; j <= (8-l); j++) {
					find(i,j,"x");
					find(i,j,"y");
				}
			}	
			System.out.println("#"+ (t+1) + " " + sum);
		}
	}
	
	public static void find(int i, int j, String type) {
		String tmp = "";
		int count = 0;
		
		if(type.equals("x")) {
			while(count < l) {
				tmp += arr[i][j+count];
				count++;
			}
		}
		else {
			while(count < l) {
				tmp += arr[j+count][i];
				count++;
			}
		}

		StringBuffer bf = new StringBuffer(tmp);
		String reverse = bf.reverse().toString();
		
		if(tmp.equals(reverse)) {
			sum++;
		}
	}
}