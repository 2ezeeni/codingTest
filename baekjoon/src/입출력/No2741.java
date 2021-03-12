package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2741 {

	public static void main(String[] args) throws IOException {
		// 문제.  자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		// 반복문마다 출력시 시간과 차지하는 메모리량이 매우 크다.
		// 때문에 StringBuilder를 이용해서 반복문이 끝난 후에 출력.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		for(int i = 1; i <= count; i++) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
