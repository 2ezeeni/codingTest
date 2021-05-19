package 그리디;

import java.util.Scanner;

public class Q12782 {

	public static void main(String[] args) {

		// 문제. 두 수의 비트 우정지수를 구하는 프로그램을 만드세요.
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();  

		for (int i = 0; i < t; i++) {
			String n = sc.next();  
			String m = sc.next();  
			
			int one = 0;
			int zero = 0;
			
			for (int j = 0; j < m.length(); j++) {
				if (n.charAt(j) != m.charAt(j)) {
					if(m.charAt(j) == '1') {
						one ++;
					}
					else {
						zero ++;
					}
				}
			}
			
			System.out.println(Math.max(one, zero));
		}
		
		
	}

}
