package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10953 {

	public static void main(String[] args) throws IOException {
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//       첫째 줄에 테스트 케이스의 개수가 주어짐
		//		 a와 b는 콤마로 구분되어 있다.
		
		// 배열 사용
		// split 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null; // 한 줄
		int count = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		String[] ab; // split으로 나눈 문자를 저장할 배열
		int results[] = new int[count]; // a + b를 저장할 배열
		
		for(int i = 0; i < count; i++) {
			str = br.readLine();
			ab = str.split(",");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			results[i] = a + b;
		}
		
		for(int k : results) {
			System.out.println(k);
		}
		
		
	}

}
