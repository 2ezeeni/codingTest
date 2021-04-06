package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03_이코테 {

	public static void main(String[] args) throws IOException {
		// 문제. 숫자로만 이루어진 문자열 S가 주어졌을때, 연산 'x', '+' 를 숫자 사이에 넣어 만들어질 수 있는 가장 큰 수를 출력하세요.
		//		 모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정한다.
		//		 (항상 20억 이하의 정수가 되도록 입력이 주어집니다.)
		
		// 연산이 이루어지는 숫자 두개 중 0이나 1이 존재하는 경우 '+' 연산 사용
		// 0이 존재하지 않는 경우 'x'를 사용한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int result = str.charAt(0) - '0'; // s의 길이는 1이상이므로 가능
		
		for(int i = 1; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			
			if(result <= 1 || num <= 1) {
				result += num;
			} else {
				result *= num;
			}
			
		}
		
		System.out.println(result);
		
		
	}

}
