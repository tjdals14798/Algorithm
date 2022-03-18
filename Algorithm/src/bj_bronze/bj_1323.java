package bj_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_1323 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        HashSet<Long> set = new HashSet<>();    //나온 나머지 체크
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        long num = N;
        int cnt = 0;

        while(true) {
            cnt++;
            long remain = num%K;
            if(remain==0) break;

            if(!set.add(remain)) {    //같은 나머지가 나오면 반복 되기때문에 루프 탈출
               System.out.println(-1);
               return;
            }

            sb.append(remain).append(N);
            num = Long.parseLong(sb.toString());
            sb.delete(0, sb.length());
        }

        System.out.println(cnt);
    }
}