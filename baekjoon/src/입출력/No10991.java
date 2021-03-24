package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10991 {

	public static void main(String[] args) throws IOException {
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		// 맨 왼쪽 빈칸을 먼저 출력한 후
		// 다음 칸부터 순서상 짝수일 때는 빈칸, 홀수일 때는 *을 출력하게 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) { 
			for(int blank = 0; blank < num - i; blank++) {//맨 왼쪽 빈칸 출력
				sb.append(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) { 
				if(j % 2 == 1) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}
