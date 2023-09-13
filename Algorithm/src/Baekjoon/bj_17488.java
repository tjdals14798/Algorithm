package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_17488 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> map = new HashMap<>();
		int arr[] = new int[M];
		boolean ck[][] = new boolean[N][M+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			map.put(i+1, 0);
		}
		
		for(int c = 0; c < N; c++) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int idx = Integer.parseInt(st.nextToken());
				if(idx < 0) break;
				
				map.put(idx, map.getOrDefault(idx, 0) + 1);
				if(map.get(idx) > arr[idx-1]) map.put(idx, -1);
				else ck[c][idx] = true;
			}
		}

		for(int c = 0; c < N; c++) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int idx = Integer.parseInt(st.nextToken());
				if(idx < 0) break;
				
				if(map.get(idx) == -1) {
					continue;
				} else {
					if(map.get(idx) > arr[idx-1]) {
						map.put(idx, -1);
					}
					else {
						if(map.get(idx) == arr[idx-1]) {
							ck[c][idx] = false;
						}else {
							ck[c][idx] = true;
						}
						map.put(idx, map.getOrDefault(idx, 0) + 1);
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int cnt = 0;
			for(int j = 1; j <= M; j++) {
				if(map.get(j) == -1) {
					cnt++;
					continue;
				}
				if(ck[i][j]) sb.append(j).append(" ");
				else cnt++;
			}
			if(cnt == M) sb.append("¸ÁÇß¾î¿ä");
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

//public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//    int N = Integer.parseInt(st.nextToken());
//    int M = Integer.parseInt(st.nextToken());
//    int[][] arr = new int[N+1][M+1];
//
//    st = new StringTokenizer(br.readLine());
//    int[] check = new int[M+1];
//    for(int i=1; i<=M; i++) {
//        check[i] = Integer.parseInt(st.nextToken());
//    }
//
//    for(int k=0; k<2; k++) {
//        for(int i=1; i<=N; i++) {
//            st = new StringTokenizer(br.readLine());
//            while (st.hasMoreTokens()) {
//                int tmp = Integer.parseInt(st.nextToken());
//                if(tmp == -1) break;
//                check[tmp]--;
//                arr[i][tmp]++;
//            }
//        }
//
//        for(int i=1; i<=N; i++) {
//            for(int j=1; j<=M; j++) {
//                if(check[j] < 0) {
//                    continue;
//                }
//                if(arr[i][j] == 1) {
//                    arr[i][j]++;
//                }
//            }
//        }
//    }
//
//
//    StringBuilder sb = new StringBuilder();
//    boolean flag = false;
//    for(int i=1; i<=N; i++) {
//        for(int j=1; j<=M; j++) {
//            if(arr[i][j] == 2) {
//                flag = true;
//                sb.append(j +" ");
//            }
//        }
//        if(flag) {
//            sb.deleteCharAt(sb.length()-1);
//            sb.append("\n");
//        }else {
//            sb.append("¸ÁÇß¾î¿ä\n");
//        }
//
//        flag = false;
//    }
//    System.out.println(sb.toString());
//
//
//}
