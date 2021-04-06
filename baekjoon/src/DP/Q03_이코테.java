package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_이코테 {
	
	
	public static void main(String[] args) {
		// 문제. N가지 종류의 화폐로, M원을 만들기 위한 최소한의 화폐 개수를 출력하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 각 화폐의 가치 추출
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int d[] = new int[m + 1];
		Arrays.fill(d, 10001);
		
		// 다이나믹 프로그래밍 진행
		d[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = arr[i]; j <= m; j++) {
				// (i - k)원을 만드는 방법이 존재하는 경우
				if(d[j - arr[i]] != 10001) {
					d[j] = Math.min(d[j], d[j - arr[i]] + 1);
				}
			}
		}

		if(d[m] == 10001) System.out.println(-1);
		else System.out.println(d[m]);
	}

}
