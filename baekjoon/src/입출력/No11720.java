package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {

	public static void main(String[] args) throws IOException{
		// 문제. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		System.out.println(sum);
		
	}

}
