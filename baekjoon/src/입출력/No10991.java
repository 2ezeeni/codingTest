package 입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10991 {

	public static void main(String[] args) throws IOException {
		
		// 문제. 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());

	  for (int i = 1; i <= num; i++)
       {
           for (int j = i; j <= num - 1; j++)
           {
               System.out.print(" ");
           }
           for (int j = 1; j <= i*2-1; j++)
           {
               if (j % 2 == 1)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
      }


	}

}
