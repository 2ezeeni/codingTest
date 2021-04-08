package 구현;

import java.util.Scanner;

public class Q01_이코테 {
	
	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3 ) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 문제. 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력합니다.
		
		// 십의 자리와 일의 자리에 3이 있는지 확인하기 위해서 
		// 10으로 나눈 나머지와, 10으로 나눈 몫을 사용한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0; 
		
		for(int h = 0; h <= n; h++) {			// 시
			for(int m = 0; m < 60; m++) {		// 분
				for(int s = 0; s < 60; s++) {	// 초
					// 3이 있는지 확인한다.
					if(check(h, m, s)) count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
