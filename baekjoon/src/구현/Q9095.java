package 구현;

import java.util.Scanner;

public class Q9095 {

	public static void main(String[] args) {
		// 문제. 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] array = new int[11];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		
		int a = 0;
		for(int i = 0; i < num; i++) {
			a = sc.nextInt();
			for(int j = 4; j <= a; j++) {
				array[j] = array[j - 1] + array[j - 2] + array[j - 3];
			}
			System.out.println(array[a]);
		}
	}

}
