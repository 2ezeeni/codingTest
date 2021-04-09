package 구현;

import java.util.Scanner;

public class Q00_이코테 {

	public static void main(String[] args) {
		// 문제. N * N 공간 내에서, 이동할 계획서 내용에 따라 이동 후
		// 		 최종적으로 도착할 지점의 좌표 (x, y)를 공백을 기준으로 구분하여 출력하세요.
		
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            // 이동 후 좌표 구하기 
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
	
		
	}

}