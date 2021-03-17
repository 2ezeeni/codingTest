package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2446 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		// 줄번호가 num보다 큰 경우 상단과 대칭이 될 수 있게 처리함.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());  

		for(int i = 1; i < 2 * num; i++) {
			int s = i; 
			if(s > num) { 
				s = 2 * num - i; 
			}
			for(int blank = 0; blank < s - 1; blank++) {
				bw.write(" ");
			}
			for(int star = 0; star < 2 * (num - s) + 1; star++) { 
				bw.write("*");
			}
			bw.newLine();
			
		}
		bw.flush();
		br.close();
		bw.close();
		
	}

}
