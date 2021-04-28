package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1783 {

	public static void main(String[] args) throws IOException {
		// 문제. 체스판의 크기가 주어졌을 때, 병든 나이트가 여행에서 방문할 수 있는 칸의 최대 개수를 구해보자.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    
	    int result = 0;
	    
	    if(N == 1) {
	        result = 1;
		} else if(N == 2) {
	        result = Math.min((M + 1) / 2, 4);
		}
	    else if(N >= 3) {
			if(M < 7) {
				result = Math.min(M, 4);
			} else {
				result = M - 2;
			}
		}
		
		System.out.println(result);
		
	}

}
