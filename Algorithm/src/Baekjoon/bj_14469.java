package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_14469 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
        int time = 0;
        int cowArr[][] = new int[N][2];

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cowArr[i][0] = Integer.parseInt(st.nextToken());
            cowArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cowArr, (o1,o2)-> o1[0]-o2[0]);
        
        for(int i=0;i<N;i++){
            if(time < cowArr[i][0]){
            	time=cowArr[i][0]+cowArr[i][1];
            }
            else
            	time += cowArr[i][1];
        }
        System.out.println(time);

	}

}
