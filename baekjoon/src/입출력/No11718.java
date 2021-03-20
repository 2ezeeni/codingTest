package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11718 {

	public static void main(String[] args) throws IOException {
		// 문제. 입력 받은 대로 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = null; // 한줄
		
		while((str = br.readLine()) != null) {
			bw.write(str);
			bw.write("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

}
