package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14655 {
//	������ �ַ� �ϴ� ������ ���� �ܼ��ϰ�, ģ���� �����̴�. �ٷ� ���� ������ �����̴�. �� ���ӿ� ���̴� ������ ��鿡�� ������ ���� ��ȣ�� �ٸ� ������ �� �鿡 �ϳ��� ���� �ִ�.
//	(��, ���������� ���� ���� ������ �ٸ� �� �ִ�) �� �÷��̾� �� �� ���� ���尡 �־�����. ��� ����� ���� �������� ����Ǹ�, ������ �� ���帶�� N���� ������ ���Ƿ� ���� �̸� �Ϸķ� �迭�Ѵ�.
//	�̶�, ������ �յ� ���⵵ �ٲ� �� �ִ�. ù ��° ���忡���� ������ ǥ�õ� ������ ���� �ִ밡 �ǵ��� ������� �ϰ�, �� ��° ���忡���� ������ ǥ�õ� ������ ���� �ּҰ� �ǵ��� ������� �Ѵ�.
//	(ù ��° ���� ���� ���� ��) - (�� ��° ���� ���� ���� ��)�� �ش� �÷��̾ ���ӿ��� ȹ���� �����̰�, �� ������ �ִ밡 �Ǵ� �÷��̾ �ٷ� ������ ���ڰ� �ȴ�.
//	������ ����, ����, ������ �̿��ؼ� �׻� ������ 3���� ������ ������ �ְ��� ���� �������̴�. ������ ������ 3���� ������ ������ ������ �̱� �� ���ٰ� �����ϱ� ������ �����ϴ� ��� ���� �׻� ������ 3���� ������ �����´�.
//	���� �迭�� �� ������ ����� �� ���� ������ �����ų� �� ���� �� �� ������ ������ �͵� �����ϴ�. ������ ������ Ƚ���� ������ ����.

//	ù° �ٿ� ������ �� N�� �־�����. (1 �� N �� 10,000) ��° �ٿ� ������ ù ��° ������ N�� ������ �迭�� �־�����.
//	��° �ٿ� ������ �� ��° ������ N�� ������ �迭�� �־�����. ������ ������ ���� ���� 10,000 ������ �����̴�.

//	������ �̹� ���ӿ��� ȹ���� ������ ����Ѵ�.
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer s1 = new StringTokenizer(bf.readLine());
		StringTokenizer s2 = new StringTokenizer(bf.readLine());
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int res = 0;
		
		for(int i=0;i<n;i++) {
			arr1[i]=Math.abs(Integer.parseInt(s1.nextToken()));
			arr2[i]=Math.abs(Integer.parseInt(s2.nextToken()));
			
			res += arr1[i]+arr2[i];
		}
		
		System.out.println(res);	

	}

}
