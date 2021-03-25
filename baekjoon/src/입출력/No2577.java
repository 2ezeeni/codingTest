package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2577 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
		//       0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = 1;
		for(int i = 0; i < 3; i++) {
			total *= Integer.parseInt(br.readLine());
		}
		
		String strTotal = total + "";
		int arrays[] = new int[10];
		for(int i = 0; i < arrays.length; i++) { 
			for(int j = 0; j < strTotal.length(); j++) {
				if(Integer.parseInt(strTotal.substring(j, j + 1)) == i) {
					arrays[i]++;
				}
			}
		}
		
		for(int count : arrays) {
			bw.write(count + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
