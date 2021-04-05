package 그리디;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// 문제. 다음의 두 연산을 이용해서 N이 1이 될때까지의 최소 횟수를 구하는 프로그램을 작성하세요.
		//		 1. N에서 1을 뺀다.
		//		 2. N을 K로 나눈다. 
		//		 (N과 K는 주어진다.)
		
		// 나누는 것이 훨씬 수를 빨리 줄일 수 있기 때문에
		// 최대한 많이 나누기를 수행할 수 있도록 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		
		while(true) {
			int target = (N / K) * K;
			count += (N - target);
			N = target;
			
			if(N < K) break;
			
			count += 1;
			N /= K;
		}
		count += (N - 1);
		System.out.println(count);
		
	}

}
