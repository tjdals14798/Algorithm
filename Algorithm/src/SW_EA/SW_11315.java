package SW_EA;

import java.util.Scanner;

public class SW_11315 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			char arr[][]=new char[N][N];
			
			for(int i=0;i<N;i++) {
				String str=sc.next();
				for(int j=0;j<N;j++) {
					arr[i][j]=str.charAt(j);
				}
			}
			
			int cnt=0; boolean ck=false;int n=0;
			//가로 
			for(int i=0;i<N;i++) {	
				for(int j=0;j<N;j++) {
					
					if(arr[i][j]=='o') {
						cnt++;
						if(cnt==N) ck=true;
					}else {
						cnt=0;
					}					
				}
			}
			//세로
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					
					if(arr[j][i]=='o') {
						cnt++;
						if(cnt==N) ck=true;
					}else {
						cnt=0;
					}
				}
			}
			// 3 : 대각선(오른쪽 위로)
            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    if(arr[r][c] == 'o') {
                        if(r-4>=0 && c+4<N && arr[r-1][c+1]=='o' && arr[r-2][c+2]=='o' && arr[r-3][c+3]=='o' && arr[r-4][c+4]=='o') {
                            ck = true;
                        }                      
                    }
                }
            }            
            // 4 : 대각선(오른쪽 아래로)
            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    if(arr[r][c] == 'o') {
                        if(r+4<N && c+4<N && arr[r+1][c+1]=='o' && arr[r+2][c+2]=='o' && arr[r+3][c+3]=='o' && arr[r+4][c+4]=='o') {
                            ck = true;
                        }                        
                    }
                }
            }
			if(ck==true) System.out.printf("#%d %s\n",tc,"YES");
			else System.out.printf("#%d %s\n",tc,"NO");
		}

	}

}
