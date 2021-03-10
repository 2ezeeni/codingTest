package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10950 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		int[] results = new int[count];
		StringTokenizer st;
		for(int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			results[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		}
		
		for(int k : results) {
			System.out.println(k);
		}
		
		
		
	}

}
