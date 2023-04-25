package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1340 {
	
	static String month_arr[] = {"0","January","February","March","April","May","June","July","August","September","October","November","December"};
	
	public static int[] LeapYear(String str) {
		int year = Integer.parseInt(str);
		int mrr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			mrr[2] = 29;
		}
		return mrr;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int mon = 0;
		for(int i = 1; i < month_arr.length; i++) if(month_arr[i].equals(str)) mon = i;	//	달
		int day = Integer.parseInt(st.nextToken().substring(0,2));	// 날짜
		int day_arr[] = LeapYear(st.nextToken());	//	윤년 구분
		String time[] = st.nextToken().split(":");	//	시간
		
		int sum_date = 0;
		for(int i = 1; i < mon; i++) {
			sum_date += day_arr[i];
		}
		
		sum_date += day - 1;
		sum_date = sum_date * 1440;
		int hour = Integer.parseInt(time[0]) * 60;
		int sum = sum_date + hour + Integer.parseInt(time[1]);
		
		if(day_arr[2] == 28) System.out.println((double)sum / (double)525600 * 100);
		else System.out.println((double)sum / (double)527040 * 100);
	}

}
