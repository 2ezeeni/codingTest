package etc;

import java.util.HashSet;
import java.util.Scanner;

public class No3052 {

	public static void main(String[] args) {
		// 문제. 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

		// HashSet으로 중복 제거
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		 
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt() % 42);
		}
        
		sc.close();
		System.out.print(set.size());
		
	}

}
