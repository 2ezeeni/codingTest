package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2441 {

	public static void main(String[] args) throws IOException {

		// 문제. 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
		// 		 오른쪽 정렬하여 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for(int count = 0; count < num; count++) { 
			for(int i = 0; i < count; i++) {  
				bw.write(" ");
			}
			for(int j = 0; j < (num - count); j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
