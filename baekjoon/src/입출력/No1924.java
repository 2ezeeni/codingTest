package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1924 {

	public static void main(String[] args) throws IOException {
		// 문제. 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.

		// y를 7로 나눴을때 나머지가 1이면 '월요일'을 기준으로 한다. 
		// 월별로 한달일자가 다르므로 배열로 저장해서 사용한다. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		String[] weekday = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int month = 0;
		 
		while(x > 1) {  
			y += days[month];
			x--;
			month++;
		}
		
		String result = weekday[y % 7];
		System.out.println(result);
	}

}
