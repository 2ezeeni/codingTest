package 입출력;

import java.io.IOException;
import java.util.Scanner;

public class No1712 {

	public static void main(String[] args) throws IOException {
		// 문제. A, B, C가 주어졌을때, 손익분기점을 구하는 프로그램을 작성하시오.
		
		// 가변비용(B)가 판매가격(C)보다 비쌀경우 손익분기점이 존재하지 않는다
		// 다음을 이용해 조건식을 세운다.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(C <= B) {
			System.out.println(-1);
		} else {
			System.out.println((A / (C - B)) + 1);
		}
		
	}

}
