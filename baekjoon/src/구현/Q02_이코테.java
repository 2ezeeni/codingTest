package 구현;

import java.util.Scanner;

public class Q02_이코테 {

	public static void main(String[] args) {
		// 문제. N * N 공간 내에서, 이동할 계획서 내용에 따라 이동 후
		// 		 최종적으로 도착할 지점의 좌표 (x, y)를 공백을 기준으로 구분하여 출력하세요.
		
		// 나이트가 이동할 수 있는 방향을 정의하고 각 방향에 대해 이동이 가능한지 확인한다.
		// (N * N 공간을 벗어나지 않는지 확인)
	
		Scanner sc = new Scanner(System.in);
		
		// 현재 나이트의 위치 입력 받기
		String n = sc.nextLine();
		int row = n.charAt(1) - '0';
		int column = n.charAt(0) - 'a' + 1;
		
		// 이동할 수 있는 8개의 방향 정의
		int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1};
		int[] dy = {-1, 1, -1, 1, -2, -2, 2, 2};
		
		// 이동 할 수 있는지 확인 후 카운트
		int count = 0;
		for(int i = 0; i < 8; i++) {
			int nextRow = row + dx[i];
			int nextColumn = row + dy[i];
			if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
