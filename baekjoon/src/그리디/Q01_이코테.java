package 그리디;

import java.util.Scanner;

public class Q01_이코테 {

	public static void main(String[] args) {
		// 문제. 손님에게 거슬러 줘야할 돈이 N원일때
		//	     500원, 100원, 50원, 10원짜리 동전으로 거슬러 줄 동전의 최소개수를 구하세요.
		
		// 큰 단위의 동전들이 항상 작은 단위의 배수이기 때문에, 작은 단위의 동전들로는 다른 해가 나올 수 없다.
		// 때문에 가장 큰 단위의 동전부터 돈을 거슬러 주는 것이 최적의 해이다.
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		int change[] = {500, 100, 50, 10};
		for(int i = 0; i < change.length; i++) {
			count += N / change[i];
			N = N % change[i];
		}
		
		System.out.println(count);
		
	}

}
