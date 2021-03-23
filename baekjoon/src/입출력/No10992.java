package 입출력;

import java.util.Scanner;

public class No10992 {

	public static void main(String[] args) {
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i < num; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		for (int i = 2; i < num; i++) { 
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1; j <= 2 * (i - 1)- 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		if (num != 1) {
			for (int i = 1; i <= 2 * num - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
