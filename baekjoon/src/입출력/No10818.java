package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10818 {

	public static void main(String[] args) throws IOException {
		// 문제. N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		// 최솟값의 초기값은 문제에서 주어진 정수의 최댓값으로,
		// 최댓값의 초기값은 문제에서 주어진 정수의 최솟값으로 설정한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int min = 1000000;
		int max = -1000000;
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(st.nextToken());
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
		
	}
}
