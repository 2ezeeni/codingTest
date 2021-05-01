package 구현;

import java.util.Scanner;

public class Q1476 {

	public static void main(String[] args) {
		// 문제. E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때, 준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		
		int year = 0;
		while(true) {
			year++;
			if((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0) break;
		}
		System.out.print(year);
	}

}
