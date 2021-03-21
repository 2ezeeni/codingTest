package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11721 {

	public static void main(String[] args) throws IOException {
		// 문제. 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		//       한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		while(true) {
			if(str.length() >= 10) {
				sb.append(str.substring(0, 10) + "\n");
				str = str.substring(10);
			} else {
				sb.append(str.substring(0));
				break;
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
