package 입출력;

import java.util.Scanner;

public class No1000 {

	public static void main(String[] args) {
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		
		sc.close();  //Scanner 사용 후 닫아주기
	}

}
