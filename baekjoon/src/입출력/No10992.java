package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10992 {

	public static void main(String[] args) throws IOException {
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		
		// 맨앞 빈칸을 먼저 출력한 후
		// 2n-1만큼 반복. 1. 맨 마지막 줄일때는 전부 "*" 출력
		//		 		  2. 아닐때는 맨 첫번째와 맨 마지막만 "*" 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			for(int blank = 0; blank < num - i; blank++) {
				bw.write(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(i == num) { bw.write("*"); continue; }
				if(j == 1 || j == 2 * i - 1) {
					bw.write("*");
				} else {
					bw.write(" ");
				}
			}
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}
