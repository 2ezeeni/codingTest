package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10952 {

	public static void main(String[] args) throws IOException {
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//       입력의 마지막에는 0 두 개가 들어온다.
		
		// 종료 조건은 0 두개를 이용해서 1. a + b = 0일때 2. 읽어들인 line이 "0 0"일때로 생각해보았다. 
		// split을 이용해 공백을 기준으로 a,b를 구한다.
		// a,b는 무조건 한자리 숫자이므로 charAt()이용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		String[] str2;
		
		while((str = br.readLine()) != null) {
			if(str.equals("0 0")) {
				break;
			}
			
			str2 = str.split(" ");
			int a = Integer.parseInt(str2[0]);
			int b = Integer.parseInt(str2[1]);
			
			sb.append(a + b).append("\n");
		}
		
//		while((str = br.readLine()) != null) {
//			str2 = str.split(" ");
//			int a = Integer.parseInt(str2[0]);
//			int b = Integer.parseInt(str2[1]);
//			
//			if(a + b == 0) {
//				break;
//			}
//			sb.append(a + b).append("\n");
//		}
		
		System.out.println(sb);
		
	}

}
