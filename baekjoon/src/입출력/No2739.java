package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int dan = Integer.parseInt(br.readLine());
		for(int i = 1; i <= 9; i++) {
			sb.append(dan + " * " + i + " = " + (dan * i)).append("\n");
		}
		System.out.println(sb);
				
	}

}
