package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_19941 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		boolean ck[] = new boolean[n];
		char arr[] = str.toCharArray();
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'P') {
				int start = Math.max(i-k,0), end = Math.min(i+k, n-1);	//Ž�� ����
				for(int j = start; j <= end; j++) {
					if(arr[j] == 'H' && !ck[j]) {						//�ܹ��Ű� ����������
						ck[j] = true;									//�Ա�
						cnt++;											//����� üũ
						break;				
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
