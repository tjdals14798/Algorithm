package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_14361 {
	static int cnt=2;
	static int tc;
	static String str;
	static int d = Integer.toString(Integer.MAX_VALUE).length();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(tc = 1; tc <= T; tc++) {
			str = br.readLine();
		 	int N = Integer.parseInt(str);
			
			test(N);
			cnt = 2;
		}
	}
	
//	public static void test(int num) {
//		int res = num*cnt;
//		int c = Integer.toString(res).length();
//		boolean ck = true;
//		
//		for(int i = 0; i < str.length(); i++) {
//			int n = res%10;
//			res/=10;
//			if(str.contains(Integer.toString(n))) {
//				continue;
//			}else {
//				ck=false;
//				break;
//			}
//		}
//		if(c!=str.length()||c==1) System.out.printf("#%d impossible\n",tc);
//		else {
//			if(ck==true) {
//				System.out.printf("#%d possible\n",tc);
//			}else {
//					cnt++;
//					test(Integer.parseInt(str));
//				}
//			}
//		}
	
	public static void test(int num) {
		long res = num*cnt;
		int c = String.valueOf(res).length();
		boolean ck = true;
		
		if(c>d||c==1) System.out.printf("#%d impossible\n",tc);
		else {
			for(int i = 0; i < c; i++) {
				int n = (int) (res%10);
				res/=10;
				if(str.contains(Integer.toString(n))) {
					continue;
				}else {
					ck=false;
					break;
				}
			}
			if(ck==true) {
				System.out.printf("#%d possible\n",tc);
			}else {
				cnt++;
				test(Integer.parseInt(str));
				
			}
		}
	}
	
}
