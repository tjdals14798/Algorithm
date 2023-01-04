package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class bj_10825 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		Student[] arr = new Student[cnt];
		for(int i = 0; i < cnt; i++) {
			String [] sc = br.readLine().split(" ");
			arr[i] = new Student(sc[0], Integer.parseInt(sc[1]), Integer.parseInt(sc[2]), Integer.parseInt(sc[3]));
		}
		Comparator<Student> sortArr = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.kor < o2.kor) {
					return 1;
				}else if(o1.kor == o2.kor) {
					if(o1.eng > o2.eng) {
						return 1;
					}else if(o1.eng == o2.eng) {
						if(o1.math < o2.math) {
							return 1;
						}else if(o1.math == o2.math) {
							return o1.name.compareTo(o2.name);
						}
					}
				}
				return -1;
			}
		};
		Arrays.parallelSort(arr, sortArr);
		for(int i = 0; i < cnt; i++) {
			System.out.println(arr[i].name);
		}
	}

}