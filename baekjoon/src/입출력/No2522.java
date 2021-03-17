package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2522 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		// 중간을 포함한 상단과 하단으로 나누어 해결한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine()); 

		// 상단
		for(int i = 1; i <= num; i++) {  
			for(int blank = 1; blank <= num - i; blank++) {
				bw.write(" ");
			}
			for(int star = 1; star <= i; star++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		// 하단
		for(int i = 1; i <= num - 1; i++) { 
			for(int blank = 1; blank <= i; blank++) { 
				bw.write(" ");
			}
			for(int star = 1; star <= num - i; star++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}
