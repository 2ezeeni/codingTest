package 구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q03_이코테 {

	public static void main(String[] args) {
		// 문제. 알파벳 대문자와 숫자(0~9)로만 구성된 문자열 S가 주어졌을 때,
		//		 모든 알파벳을 오름차순으로 정렬하여 출력하고, 그 뒤에 모든 숫자를 더한 값을 이어서 출력하세요.
		
		// 문자를 하나씩 확인하면서 문자와 숫자를 나눠서 해결한다.
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// 문자와 숫자를 저장할 곳
		List<Character> list = new ArrayList<Character>();
		int num = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				list.add(s.charAt(i));
			} else {
				num += s.charAt(i) - '0';
			}
		}
		
		// 알파벳 오름차순으로 정렬
		Collections.sort(list);
		
		// 알파벳 출력
		for(char alpha : list) {
			System.out.print(alpha);
		}
		// 숫자 출력
		// 숫자가 없을때는 num이 0이므로 출력할 필요가 없다.
		if(num != 0) System.out.println(num);
		
	}

}
