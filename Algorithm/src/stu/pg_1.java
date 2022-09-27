package stu;

import java.util.ArrayList;
import java.util.Arrays;

public class pg_1 {

	
	public static void main(String[] args) {
		
		int[] answer = {5,0,2,7};
		ArrayList<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(answer);
        for(int i =0;i < answer.length-1; i++) {
			for(int j = i+1;j<answer.length;j++) {
				if(!arr.contains(answer[i]+answer[j]))
					arr.add(answer[i]+answer[j]);
			}
        }
        for(int i =0;i < arr.size(); i++) {
        	System.out.println(arr.get(i));
        }
	}
}
