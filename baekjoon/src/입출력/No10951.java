package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10951 {

	public static void main(String[] args) throws IOException {
		// 문제. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 		 테스트 케이스 개수가 주어지지 않는다.
		
		// 결과를 한번에 출력하기 위해 StringBuiler사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while((s = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(s, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append('\n');
        }

        System.out.println(sb);

	}

}
