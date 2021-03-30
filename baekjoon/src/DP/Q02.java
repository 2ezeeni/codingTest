package DP;

import java.util.Scanner;

public class Q02 {
	
	public static int dp[] = new int[30001];
	
	public static void main(String[] args) {
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