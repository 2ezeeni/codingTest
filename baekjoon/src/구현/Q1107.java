package 구현;

import java.util.Scanner;

public class Q1107 {

	public static void main(String[] args) {
		// 문제. 수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오. 
		//		 수빈이가 지금 보고 있는 채널은 100번이다.
		
		Scanner sc = new Scanner(System.in);
        
        int target = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] broken = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();
            broken[n] = true;
        }
        
        int result = Math.abs(target - 100); 
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) {
                    isBreak = true; 
                    break; 
                }
            }
            if(!isBreak) { 
                int min = Math.abs(target - i) + len; 
                result = Math.min(min, result);
            }
        }        
        System.out.println(result);
		
	}

}
