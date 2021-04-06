package DP;

import java.util.Scanner;

public class Q02_이코테 {
	
	public static int dp[] = new int[30001];
	
	public static void main(String[] args) {
		// 문제. 정수 X가 주어졌을 때, 연산 4개를 적절히 사용해서 1로 만들고자 합니다.
		//		 연산을 사용하는 횟수의 최솟값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;
			
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			if(i % 5 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 5] + 1);
			}
		}
		System.out.println(dp[N]);
		
	}

}
