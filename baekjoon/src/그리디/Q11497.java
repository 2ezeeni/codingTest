package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11497 {

	static int t,n;
    static int arr[];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
    	// 문제. 각 테스트 케이스마다 한 줄에 주어진 통나무들로 만들 수 있는 최소 난이도를 출력하시오.

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());
        
        while(t > 0) {
            t--;
            n = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            arr = new int[n];
            String[] t = br.readLine().split(" ");
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(t[i]);
            }
            
            int ans[] = new int[n];
            int left = 0;
            int right = n - 1;
            
            Arrays.sort(arr);
            
            for(int i = 0; i < n; i++) {
                if(i % 2 != 0) {
                    ans[left] = arr[i];
                    left += 1;
                }
                else {
                    ans[right] = arr[i];
                    right -= 1;
                }
            }
            min = Math.abs(ans[0] - ans[n - 1]);
            for(int i = 1; i < n; i++) {
                min = Math.max(min, Math.abs(ans[i] - ans[i - 1]));
            }
            System.out.println(min);
        }
        
	}

}
