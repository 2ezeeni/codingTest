package 그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1931 {

	public static void main(String[] args) {
		// 문제. 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] time = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();	 
			time[i][1] = sc.nextInt();	 
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
