package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2742 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		 
		 int count = Integer.parseInt(br.readLine());
		 for(int i = count; i > 0; i--) {
			 sb.append(i).append("\n");
		 }
		 System.out.println(sb);
		
	}

}
