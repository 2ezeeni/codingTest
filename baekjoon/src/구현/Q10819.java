package 구현;

import java.util.Scanner;

public class Q10819 {
	static int n;
	static int[] arr;

	public static void main(String[] args) {
		// 문제. N개의 정수로 이루어진 배열 A가 주어진다. 이때, 배열에 들어있는 정수의 순서를 적절히 바꿔서 다음 식의 최댓값을 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        visited = new int[n];
        tArr = new int[n];
        result = 0;
        solve(0);
        System.out.println(result);
    }
    
    static int result;
    static int[] visited;
    static int[] tArr; 
    private static void solve(int cnt) {
        if(cnt == n) {
            int sum = 0;
            for(int i = 0;i < n - 1;i++)
                sum += Math.abs(tArr[i] - tArr[i+1]);
            result = Math.max(result, sum);
            return;
        }
        
        for(int i = 0;i < n;i++) {
            if(visited[i] == 1) continue; 
            visited[i] = 1;
            tArr[cnt] = arr[i]; 
            solve(cnt + 1);
            visited[i] = 0; 
        }
	}

}
