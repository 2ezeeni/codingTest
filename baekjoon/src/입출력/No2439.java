package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2439 {

	public static void main(String[] args) throws IOException {
		
		//문제. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//      오른쪽 정렬한 별을 출력하시오.
		
		// 출력 한줄씩 보면 공백과 별로 이루어져있다.
		// 공백 : n-1부터 0까지 하나씩 줄어듬
		// 별 : 1부터 n까지 하나씩 늘어남
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < (num - i); j++) { 
				sb.append(" ");
			}
			for(int k = 0; k < i; k++) { 
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
