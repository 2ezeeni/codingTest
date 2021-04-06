package DP;

import java.util.Scanner;

public class Q01_이코테 {
	public static int dp[] = new int[100];
	
	public static void main(String[] args) {
		// 문제. 식량창고 N개에 대한 정보가 주어졌을 때 얻을 수 있는 식량의
		//  	 최댓값을 구하는 프로그램을 작성하세요.
		//		 (최소한 한 칸 이상 떨어진 식량창고를 약탈해야 합니다.)
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for(int i = 2; i < N; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
		}
		
		System.out.println(dp[N - 1]);
		
	}

}
