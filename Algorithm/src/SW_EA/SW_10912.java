package SW_EA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_10912 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			String str = br.readLine(); // ���ڿ� ���� 1 ~ 100
            
            // �� ���ڰ� ��� ���Դ��� üũ
            int[] alphabet = new int[26];
            for (int i = 0; i < str.length(); i++) {
                alphabet[str.charAt(i) - 'a']++;
            }
             
            // 2�� �̻� ���� ���ڵ��� ������� �ʴ´�
            String ans = "";
            for (int i = 0; i < 26; i++) {
                if(alphabet[i] % 2 == 0) continue;
                ans += (char)(i + 'a');
            }
             
            if(ans.equals("")) ans = "Good";
             
            System.out.printf("#%d %s\n", tc ,ans);
        }

	}

}
