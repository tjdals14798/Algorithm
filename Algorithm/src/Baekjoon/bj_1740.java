package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1740 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());

        Long res = 0L;
        while (n > 0L) {
            Long tempCnt = 0L;
            Long num = 1L;
            while (n >= num * 2L) {
                num *= 2L;
                tempCnt++;
            }
            n -= num;
            res += myPowBy3(tempCnt);
        }
        System.out.println(res);
    }

    private static Long myPowBy3(Long tempCnt) {
        Long retVal = 1L;
        for (int i=0;i<tempCnt;i++){
            retVal *= 3;
        }
        return retVal;
    }
}