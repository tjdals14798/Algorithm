package bj_bronze;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class bj_1236 {
	
//	�����̴� ���簢�� ����� ���� ������ �ִ�. ���� 1���� �� ���� ������ ���ؼ� ��ȣ�ǰ� �ִ�. �����̴� ��� ��� ��� ���� �� �� �̻��� ������ ������ ���ڴٰ� �����ߴ�.
//	���� ũ��� ������ ����ִ��� �־����� ��, �� ���� ������ �ּҷ� �߰��ؾ� �����̸� ������Ű���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
//	ù° �ٿ� ���� ���� ũ�� N�� ���� ũ�� M�� �־�����. N�� M�� 50���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ��� ���� ���°� �־�����. ���� ���´� .�� ��ĭ, X�� ������ �ִ� ĭ�̴�.

//	ù° �ٿ� �߰��ؾ� �ϴ� ������ �ּڰ��� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		boolean res[] = new boolean[N];
		boolean arr[][] = new boolean[N][M];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				String str = sc.next();
				if(str.equals("X")) {
					arr[i][j]=true;
				}else {
					arr[i][j]=false;
				}	
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				if(arr[i][j]==true) {
					res[i]=true;
				}
			}
		}
		
		for(int i = 0;i < N;i++) {
			if(res[i]==false) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
