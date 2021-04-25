package 그리디;

import java.util.Scanner;

public class Q11047 {

	public static void main(String[] args) {
		// 문제. 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
		
		int count = 0;
 
		for(int i = N - 1; i >= 0; i--) {
			if(coin[i] <= K) {
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
		
	}
}
