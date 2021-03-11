package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11021 {

	public static void main(String[] args) throws IOException {
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//       첫째 줄에 테스트 케이스의 개수가 주어진다.
		//		 출력시 Case #x: result형식이며, x는 1부터 시작한다.
		
		// StringTokenizer 사용
		// StringBuilder 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #" + (i + 1) + ": " + (a + b)).append("\n");
		}
		
		System.out.println(sb);
			
	}

}
