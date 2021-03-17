package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2445 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		// 가운데 빈칸의 개수는 2 * Math.abs(N - n번째 줄 번호) 이다.
		// 가운데까지 포함한 윗 부분과, 아랫부분으로 나눠서 풀이 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		 
		// 상단 별
		for(int i = 1; i <= num; i++) {
			for(int left = 1; left <= i; left++) {
				bw.write("*");
			}
			for(int blank = 1; blank <= 2 * (num - i); blank++) {
				bw.write(" ");
			}
			for(int right = 1; right <= i; right++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		// 하단 별
		for(int i = num - 1; i > 0; i--) { 
			for(int left = i; left > 0; left--) {
				bw.write("*");
			}
			for(int blank = 1; blank <= 2 * (num - i); blank++) {
				bw.write(" ");
			}
			for(int right = i; right > 0; right--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}