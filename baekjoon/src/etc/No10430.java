package etc;

import java.util.Scanner;

public class No10430 {
	public static void main(String[] args) {
		// 문제. 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sb.append((A + B) % C + "\n");
		sb.append(((A % C) + (B % C)) % C + "\n");
		sb.append((A * B) % C + "\n");
		sb.append(((A % C) * (B % C)) % C);
		
		System.out.println(sb);

	}
}
