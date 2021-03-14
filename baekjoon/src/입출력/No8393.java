package 입출력;

import java.util.Scanner;

public class No8393 {

	public static void main(String[] args) {
		// 문제. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= end; i++) {
			total += i;
		}

		System.out.println(total);
		
	}

}
