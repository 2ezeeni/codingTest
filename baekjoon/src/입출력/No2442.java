package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2442 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
		// 		 별은 가운데를 기준으로 대칭이어야 한다.

		
		// 왼쪽 빈칸의 개수는 N-1개 부터 하나씩 감소
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) { 
			for(int blank = 1; blank <= (num - i); blank++) { 
				bw.write(" ");
			}
			for(int star = 1; star <= ((2 * i) - 1); star++) { 
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
