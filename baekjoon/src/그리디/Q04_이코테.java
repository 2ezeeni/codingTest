package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q04_이코테 {

	public static void main(String[] args) {
		// 문제. 모험가 N명의 공포도를 측정하였다. 공포도가 X인 모험가는 반드시 X명이상으로 구성한 모험가 그룹에 참여해야한다.
		// 		 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하세요.
		
		// 공포도를 오름차순 정렬 후
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 공포도를 list에 저장
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list); // 오름차순 정렬
		
		int result = 0; // 총 그룹의 수
		int count = 0; 	// 현재 그룹에 포함된 모험가의 수
		for (int i = 0; i < n; i++) { // 공포도를 낮은 것부터 하나씩 확인
			count++; // 현재 그룹의 수 증가시키기 
			if(count >= list.get(i)) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
				result++;  // 총 그룹의 수 증가시키기
				count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
			}
		}
		
		System.out.println(result);
		
	}

}
