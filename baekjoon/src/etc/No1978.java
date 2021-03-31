package etc;

import java.util.Scanner;

public class No1978 {

	public static void main(String[] args) {
		// 문제. 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			boolean isSosu = false;
			
			if(num == 1) continue;
			
			for(int j = 2; j * j <= num; j++) {
				 if(num % j == 0) {
					 	isSosu = true;
	                    break;
	                }
			}
			if(!isSosu) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
