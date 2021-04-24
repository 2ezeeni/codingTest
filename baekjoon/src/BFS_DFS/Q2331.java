package BFS_DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2331 {

	public static void main(String[] args) throws IOException{
		// 문제. 수열을 계속 구하다 보면 언젠가 이와 같은 반복수열이 된다. 이때, 반복되는 부분을 제외했을 때, 수열에 남게 되는 수들의 개수를 구하는 프로그램을 작성하시오. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
 
        List<Integer> list = new ArrayList<>();
        list.add(A);
 
        while (true) {
            int temp = list.get(list.size() - 1);
 
            int result = 0;
            while (temp != 0) {
                result += (int) Math.pow(temp % 10, (double) P);
                temp /= 10;
            }
 
            if (list.contains(result)) {
                int ans = list.indexOf(result);
                bw.write(ans + "\n");
                break;
            }
 
            list.add(result);
        }
 
        bw.flush();
        bw.close();
        br.close();

	}
}
