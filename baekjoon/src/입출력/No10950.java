package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10950 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 

		// 풀이.
		// 입력에 여러 테스트 케이스가 포함되어 있으므로 한 줄씩 읽어서 사용할 수 있게 BufferedReader에 readLine()을 사용
		// 결과를 한번에 출력하기 위해서 배열 사용

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		int[] results = new int[count];
		StringTokenizer st;
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			results[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		}

		for (int k : results) {
			System.out.println(k);
		}

	}

}
