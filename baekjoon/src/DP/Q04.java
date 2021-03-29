package DP;

import java.util.Scanner;

public class Q04 {
	
	// 공통으로 사용하는 변수
	static int testCase, n, m;
	static int arr[][] = new int[20][20];
	static int dp[][] = new int[20][20];
	
	public static void main(String[] args) {
		// 문제. 첫째 줄에 테스트 케이스 T가 입력되고, 테스트 케이스마다 n(행)과 m(열)이 공백으로 구분되어 입력됩니다.
		//		 테스트 케이스마다 얻을 수 있는 금의 최대크기를 출력합니다.
		
		// arr[][] : 각 금괴의 양
		// dp[][]  : 특정 행열까지의 최대 금괴의 양  
		// arr, dp의 크기는 n과 m의 최대정수인 20 * 20이다.
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 입력
		testCase = sc.nextInt();
		
		//테스트 케이스 반복
		for(int tc = 0; tc < testCase; tc++) {
			
			n = sc.nextInt();
			m = sc.nextInt();
			
			// i = 행 , j = 열
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j< m; j++) {
					dp[i][j] = arr[i][j];
				}
			}
			
			// i행 j열까지의 최적의 해 dp[i][j]는
			// : (j - 1)열의 왼쪽위, 왼쪽, 왼쪽아래 dp[i][j]중 최댓값 + arr[i][j]
			for(int j = 1; j < m; j++) {
				for(int i = 0; i < n; i++) {
					
					int leftUp, left, leftDown;
					
					// 왼쪽 위에서 오는 경우
					if(i == 0) leftUp = 0;
					else leftUp = dp[i - 1][j - 1];
					
					// 왼쪽 아래에서 오는 경우
					if(i == n - 1) leftDown = 0;
					else leftDown = dp[i + 1][j - 1];
					
					// 왼쪽에서 오는 경우
					left = dp[i][j - 1];
					
					dp[i][j] = dp[i][j] + Math.max(leftUp, Math.max(left, leftDown));
				}
			}
			int result = 0;
			for(int i = 0; i < n; i++) {
				result = Math.max(result, dp[i][m - 1]);
			}
			System.out.println(result);
		} //테스트 케이스 종료
	}

}
